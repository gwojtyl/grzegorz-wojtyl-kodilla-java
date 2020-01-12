package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        String moviesString = MovieStore.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(moviesString);
    }
}
