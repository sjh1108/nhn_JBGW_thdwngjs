package com.nhnacademy.movies;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ApacheCommonsCsvMovieParser implements MovieParser {

    @Override
    public List<Movie> parse(String fileName) throws IOException {
        List<Movie> movies = new ArrayList<>();
        Reader in = new InputStreamReader(this.getMovieFileAsStream());
        CSVParser csvParser = new CSVParser(in, CSVFormat.EXCEL);

        List<CSVRecord> csvRecordList = csvParser.getRecords();

        for(int record_i=1; record_i<csvRecordList.size(); record_i++){
            CSVRecord csvRecord = csvRecordList.get(record_i);

            long movieId = Long.parseLong(csvRecord.get(0));
            String title = csvRecord.get(1);
            Set<String> genres =  Arrays.stream(csvRecord.get(2).split("\\|")).collect(Collectors.toSet());
            movies.add(new Movie(movieId, title, genres));
        }

        return movies;
    }
}
