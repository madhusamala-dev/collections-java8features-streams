package com.trainingmug.java.oop;

public class DbConfig {
    String dbUrl;
    String dbName;
    String username;
    String password;

     DbConfig() {
         dbName = "trainingug-db";
         dbUrl = "http://127.0.0.1:8080";
         username = "trainingmug";
         password = "trainingmug";
    }
}
