package com.ashok.app.service;

import java.io.IOException;

import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class GetRawdata {

	private String reqUrl = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
	private List<Map<String, String>> Stats = new ArrayList<>();

	public List<Map<String, String>> getStats() {
		return Stats;
	}

	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	private void getdata() throws IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest req = HttpRequest.newBuilder().uri(URI.create(reqUrl)).build();

		HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());
		StringReader in = new StringReader(response.body());
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		
		for (CSVRecord record : records) {
			Modeldata dataObj = new Modeldata();
			dataObj.setState(record.get("Province/State"));
			dataObj.setCountry(record.get("Country/Region"));
			int newCase=Integer.parseInt(record.get(record.size() - 1));
			int oldCase=Integer.parseInt(record.get(record.size() - 2));
			dataObj.setTotalCase(newCase);
			dataObj.setOldCase(newCase-oldCase);
			Stats.add(dataObj.statValues());
		}
		
	}

}
