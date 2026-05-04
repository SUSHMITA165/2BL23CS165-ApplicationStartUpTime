# 2BL23CS165-ApplicationStartUpTime
This project displays the application startup time using ServletContext. It stores the startup time when the application is accessed for the first time and calculates how long the application has been running in hours and minutes.

# Application Startup Time Display (ServletContext)

## Description
This project is a Java Servlet web application that displays the startup time of the application. The startup time is stored using ServletContext and is shared across all users. The application also calculates and displays how long it has been running in hours and minutes.

## Technologies Used
- Java
- Servlet (Jakarta Servlet API)
- HTML
- Apache Tomcat v10.1
- Eclipse IDE

## Folder Structure
ApplicationStartupTime/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/tara/StartupTimeServlet.java
│       │
│       └── webapp/
│           ├── index.html
│           └── WEB-INF/
│               └── web.xml
│
├── screenshots/
│   ├── screenshot1.png
│   ├── screenshot2.png
│
└── README.md

## Requirements
- JDK 17 or above
- Eclipse IDE
- Apache Tomcat v10.1
- Web Browser (Chrome/Edge)

## How to Run
1. Open Eclipse IDE
2. Create or import Dynamic Web Project
3. Configure Apache Tomcat v10.1
4. Right click project → Run As → Run on Server
5. Open browser
6. Enter URL:
   http://localhost:8081/ApplicationStartupTime/index.html

## How It Works
- On first request, the application stores current time in ServletContext
- On every request, it retrieves stored startup time
- Calculates uptime using current time
- Displays uptime in hours and minutes

## Output
The application displays:
- Application Startup Time
- Current Time
- Application Uptime (hours and minutes)



