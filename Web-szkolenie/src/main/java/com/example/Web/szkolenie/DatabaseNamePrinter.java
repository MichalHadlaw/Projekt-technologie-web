package com.example.Web.szkolenie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseNamePrinter implements CommandLineRunner {

    @Value("${spring.datasource.url}")
    private String databaseUrl;

    @Override
    public void run(String... args) throws Exception {
        String databaseName = extractDatabaseName(databaseUrl);
        System.out.println("Connected to database: " + databaseName);
    }

    private String extractDatabaseName(String databaseUrl) {
        // Jeśli URL bazy danych jest w formacie jdbc:mysql://localhost:3306/databaseName,
        // to możemy użyć poniższego kodu do wyodrębnienia nazwy bazy danych
        return databaseUrl.substring(databaseUrl.lastIndexOf("/") + 1);
    }
}
