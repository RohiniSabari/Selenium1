set projectLocation=C:\Eclipse\eclipse-workspace\RohiniFramework
cd %projectLocation% 
set classpath=%projectLocation%\bin;%projectLocation%\lib\* 
java -cp ".;C:\Eclipse\eclipse-workspace\RohiniFramework\lib\testng-7.9.0.jar" org.testng.TestNG C:\Eclipse\eclipse-workspace\RohiniFramework\testng.xml