package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class LibraryConfig {
    @Bean
    @Primary
    public Library librarySecondBean() {
        return new Library(libraryDbControllerSecondBean());
    }

    @Bean
    public LibraryDbController libraryDbControllerSecondBean() {
        return new LibraryDbController();
    }
}
