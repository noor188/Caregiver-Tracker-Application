# Caregiver tracker application

# Components
1. Data
2. Presentation
3. Views
4. Style
5. Server-side

### End goal
1. Spring boot
2. MySQL
3. Hibernate
4. Java
5. HTML
6. CSS

### Business Requirement:
Developed a caregiver tracker application that connects patients to caregivers. It allows patients to assign and manage tasks to caregivers.

### Work-Flow:
Only Patiens with the right credentials can log in. Valid patients are able to see the caregivers they are assigned to. Valid patients are able to assign for any caregiver in the application.

### Maven Project Requirements:
- [Amazon Corretto 23 JDK](https://docs.aws.amazon.com/corretto/latest/corretto-23-ug/downloads-list.html) 
- [Hibernate](https://mvnrepository.com/artifact/org.hibernate/hibernate-core)
- [MySQL Connector Java](https://mvnrepository.com/artifact/mysql/mysql-connector-java)
- [Project lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
- [Junit jupiter api](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)
- [Junit jupiter engine](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine)
- [Junit jupiter param](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params)
- [Junit platform suite](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-suite-engine)
- [Junit platform runner](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-runner)

### Project Structure:
```
/src/main/java/com/Caregiver/
├── dao/
│   ├── PatientI.java
│   ├── CaregiverI.java
│   ├── ServiceI.java 
│
├── model
│   ├── Patient.java 
│   ├── Caregiver.java
│   ├── Service.java 
│
├── service/
|
├── exception/
|
└── controller/

/src/test/java/org/rma
├── service/
└──

./
├── index.html
│
├── styles/
│   ├── style.css
│
└── images/
```
