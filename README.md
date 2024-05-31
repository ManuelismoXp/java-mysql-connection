# Java MySQL Connection

This project demonstrates how to configure and connect a Java application to a MySQL database.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- MySQL Connector/J (JDBC Driver for MySQL)
- IDE or Text Editor: IntelliJ IDEA, Eclipse, NetBeans or Visual Studio Code

## Steps for Configuration

### 1. Clone the Project

``` git clone https://github.com/ManuelismoXp/java-mysql-connection.git ```

### 2. Change data in files

1. File conexao/Conexao.java

1.1. Change the database name to your database name in the url variable
1.2. Change the value of the user variable, enter the user from your database
1.3. Change the value of the password variable, enter your user's password from your database

2. File App.java

2.1. Change the value of the query variable, place the query you want to execute in it

### 3. Download the JDBC driver

1. Access the link: https://downloads.mysql.com/archives/c-j
2. Add the downloaded file to the lib folder

### 3. Note

Don't forget to first create the database that you will add in the Conexao.java file

### 4. Execute the Project