package com.example.lab3;

import basiclibrary.Library;
import org.junit.jupiter.api.Test;
import com.example.lab3.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab3Test {
    @Test
    void AnalyzingWeatherTest(){
        AnalyzingWeatherData classUnderTest = new AnalyzingWeatherData();
        String Result = classUnderTest.WeatherData(new int[][] {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        });

        assertEquals("63 67 68 69 ",Result);

    }

    @Test
    void TallyingElectionTest(){
        TallyingElection  classUnderTest = new TallyingElection();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String Result = classUnderTest.tally(votes);
        assertEquals("Bush",Result);
    }
}
