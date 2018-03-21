
Lecture Halls Management System Spring MVC + Maven + Hibernate + Twilio Api
---------------------------------------------------------------------------

This project was designed as a project for my university.The basic idea behind this project was to overcome the issues related in the university regarding the 
- lecture adding, canceling , stop lecture clashing , reducing the department ref workload and etc.

This project covered the backend with Spring MVC and frontend with JSP view , bootstrap ,JSTL and hibernate for mapping object-oriented domain model to a relational databases and maven for project building.

And also with the help of Twilio api I have designed a messaging part where lectures can interact with the system. Lectures and Department ref get messages when a lecture is added or canceled. And lectures can send messages asking request regarding lectures. And the admin has a complete overview and clear idea regarding the lecture schedules, lecture halls arrangements from the system. So he can decide the lecture scheduling . 

## To Run this project locally

- clone the project to your local repository
- $ mvn tomcat7:run
- Access http://localhost:8080/coursemanagement.
