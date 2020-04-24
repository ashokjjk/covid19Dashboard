# Covid19 Dashboard
<p>This application tracks the total number of reported cases globally</p>

<p>Written as Spring boot app using jdk12, Maven, Dockerfile is attached in the repo.</p>
<p>Front end used are <b>JSP, Bootstrap</b></p>
<p>Docker image is available in dockerhub image name - <b>ashokjjk/covid19:latest</b></p>
<p>Docker commands to pull the image --> docker pull ashokjjk/covid19:latest</p>
<p>Docker command to run the image   --> docker run -p 8080:8080 -d -it ashokjjk/covid19:latest</p>
<p>Embedded tomcat is exposed to port 8080.</p>
<p>Application was temporarly deployed in AWS ubuntu instance during the pandemic situation for user benefit which runs
as a docker container rechable at http://ec2-52-90-162-78.compute-1.amazonaws.com:8080/</p> 
<hr>
<h3><u>Disclaimer</u></h3>
<p>This application was developed only for study purpose and not for generating revenue at any form.
This application and code is <b>copyright</b> protected.</p>
<br>
<p>Credits: John Hopkins for raw data from github repo and Koushik Kothangal from Java Brains for motivation</p>
