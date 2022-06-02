# learn-devops


Script Path in Jenkins is:<br/>
numberguesser/Jenkinsfile
<br/>
To stap and start jenkins, go to the C:\Program Files\Jenkins folder
<br/>You may want to use the DOS prompt, not BASH
<br/>
cd C:\Program Files\Jenkins
<br/>
Then issue these commands depending on what you need to do:
</br>
jenkins status</br>
jenkins start</br>
jenkins stop</br>
</br>

For Tomcat, the startup.bat and shutdown.bat files are in the C:\software\apache-tomcat-9.0.8\bin folder
</br>
The URL to access your app on Tomcat should be something like:
http://localhost:8080/numberguesser/
</br>
C:\Software\apache-tomcat-9.0.8\bin>startup.bat
</br>
TOMCAT WILL NOT RUN IF JENKINS IS RUNNING ON PORT 8080.</br>
If you can still access Jenkins in the browser, it isn't stopped!
