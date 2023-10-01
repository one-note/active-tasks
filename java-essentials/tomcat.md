<div style="text-align:center"> 

# Apache Tomcat
</div>

Apache Tomcat is a free and open-source implementation of the Jakarta Servlet, Jakarta Expression Language, and WebSocket technologies. It provides a "pure Java" HTTP web server environment in which Java code can also run. Thus, it is a Java web application server, although not a full JEE application server.

### Installation on the system

- I downloaded the .zip file of the tomcat server from its official site.
- `JAVA_HOME` environment variable is needed to be set so that the server can access the JDK.
- To stat the server we need to run the `startup.bat` file in the bin folder of the server.
- In order to manage the server we have to log in to the server which is hosted on the url `localhost:8080` by default.
- To change the different levels of access we need to edit the users.xml file located on config folder in the apache tomcat folder.
- If we need to shut down the tomcat server we can do it by running the `shutdown.bat` file.
If we successfully follow these steps we can access the server in our browser using the `localhost:8080` url.


![Screenshot 2023-10-01 143346](https://github.com/Ansu-s/need_to_study_this/assets/130679461/00f2c8b6-36a9-4de0-993f-b9120dd0f892)  

![Screenshot 2023-10-01 143412](https://github.com/Ansu-s/need_to_study_this/assets/130679461/dd642e0c-203c-4637-83c1-6422d2bd1b88)  

![Screenshot (180)](https://github.com/Ansu-s/need_to_study_this/assets/130679461/bfc15489-33c1-4d18-9fd6-5c44b9b9bf56)  

![Screenshot (179)](https://github.com/Ansu-s/need_to_study_this/assets/130679461/93e58eb0-8b0c-4b3e-a659-d855c240c29a)  

![Screenshot 2023-10-01 1451101](https://github.com/Ansu-s/need_to_study_this/assets/130679461/e617cc0c-eab7-4a8f-9395-6d032feb8770)
<div style="text-align:center"> 

# Port Conflicts in Tomcat :
</div>
Port conflicts in Tomcat occur when multiple processes or services attempt to use the same port number, preventing Tomcat from starting or functioning correctly. To fix a port conflict in Tomcat, you need to identify which port is in conflict and then take appropriate action to resolve it.

### How to solve port conflicts

Port conflicts in Tomcat can prevent your web server from starting or functioning correctly. 

If you install an application that uses the same ports that are used by CCC (for example, CA Mediation Manager (CAMM)), you must change the Tomcat port configuration of one of the products.  

No configuration changes are required if CCC and CAMM are installed on different servers.
By default, the CCC and CAMM Apache Tomcat services are configured to use the same shutdown (8005) port. This default configuration causes conflicts between the two applications if they are installed on the same server. Although not shared by default, the listener port could also cause a conflict if you inadvertently specified the same port for both products during installation.  

To enable the two applications to function correctly on the same server, you must change the conflicting ports in either the Capacity Command Center or in the CAMM Tomcat server.xml file.  

The server.xml file is located in the following directory:  

`<ccc_install_folder>\ApacheTomcat\conf
 <ccc_install_folder>/ApacheTomcat/conf`

For the location of the CAMM server.xml file, see the CAMM documentation.
To change the shutdown port  

Perform the following steps to change the shutdown port:
Search the server.xml file for the value ‘8005’.
You will find the following option:
`<Server port="8005" shutdown="SHUTDOWN">`
Change 8005 to another valid port number.  

We can perform the following command to verify that the number you select is not already in the LISTEN state:  
`netstat -an | grep port-num
 netstat -an | findstr port-num`  
(where port-num is the new port number)  

To change the listener/connector port
If you have problems connecting to the CA CCC or Data Manager user interface, it is possible that there is a contention with the CAMM listener/connector:
Search the server.xml file for the value "8081".
You will find the following XML element:
<Connector port="8081" protocol="HTTP/1.1" connectionTimeout="20000" redirectPort="8443"/>
Change 8081 to another valid port number.
We can perform the following command to verify that the number you select is not already in the LISTEN state:  

`netstat -an | grep port-num
 netstat -an | findstr port-num`  

(where port-num is the new port number)
<div style="text-align:center"> 

# Logs in Tomcat :
</div>
In Tomcat, the logs directory contains various log files that record different types of information about the server's operation and the deployed web applications. There are several types of log files commonly found in the logs directory of a Tomcat installation:

1. **catalina.out (or catalina.log):** This is the primary log file for Tomcat. It contains general information about the server's startup, shutdown, and any errors or exceptions that occur during its operation.

2. **localhost.log:** This log file is specific to the "localhost" host, which is the default host for Tomcat. It records information related to web applications deployed under the "localhost" context.

3. **host-manager.log:** This log file contains information about the Tomcat Host Manager application, which is used for managing virtual hosts.

4. **manager.log:** This log file pertains to the Tomcat Manager application, which allows you to deploy, undeploy, and manage web applications remotely.

5. **access_log (or access.log):** This log file records access information for web applications, such as incoming requests, IP addresses, and response codes. It can be configured in the Tomcat server.xml file.

6. **localhost_access_log.YYYY-MM-DD.txt:** These are access log files with a timestamp in their names. They rotate daily and contain access information specific to the "localhost" host.

7. **catalina.YYYY-MM-DD.log:** These are rotated log files for the main Tomcat log (catalina.out or catalina.log). They have timestamps in their names and store historical log data.

8. **localhost.YYYY-MM-DD.log:** Similar to the main Catalina log, these are rotated log files for the localhost-specific log (localhost.log) with timestamps in their names.

9. **manager.YYYY-MM-DD.log:** Rotated log files for the Manager application log (manager.log) with timestamps.

10. **host-manager.YYYY-MM-DD.log:** Rotated log files for the Host Manager application log (host-manager.log) with timestamps.

These log files are essential for diagnosing issues, monitoring server activity, and tracking application access. Depending on your Tomcat configuration and the web applications you deploy, you may have additional log files or customize their names and locations.

When troubleshooting issues in Tomcat, it's important to review the appropriate log files to gather information about what might be causing problems or errors in your server or applications.
