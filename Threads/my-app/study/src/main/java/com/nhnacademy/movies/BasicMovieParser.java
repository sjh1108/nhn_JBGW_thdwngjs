package com.nhnacademy.movies;

import java.io.*;
import java.util.*;

public class BasicMovieParser implements MovieParser {

    @Override
    public List<Movie> parse(String s) throws IOException {
        List<Movie> movies = new ArrayList<>();

        getMovieFileAsStream();
        try(InputStream inputStream = getMovieFileAsStream()){
            if(inputStream == null){
                throw new IOException("No file found");
            }

            try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
                String line = reader.readLine();

                while((line = reader.readLine()) != null){
                    String[] movieData = line.split(",");

                    Set<String> movieSet = new HashSet<>(Arrays.asList(movieData).subList(2, movieData.length));

                    Movie movie = new Movie(Integer.parseInt(movieData[0]), movieData[1], movieSet);
                    movies.add(movie);
                }
            }
        }
        return movies;
    }
}
