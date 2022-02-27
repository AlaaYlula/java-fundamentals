package com.example.lab3;

import java.util.HashSet;
import java.util.Set;

public class AnalyzingWeatherData {
    public String WeatherData(int[][] weeklyMonthTemperatures){
        System.out.println("////////////AnalyzingWeatherData");
        // Daily average temperatures for Seattle, October 1-28 2017

        int min = weeklyMonthTemperatures[0][0] ;
        int max = 0 ;
        Set<Integer> AllweeklyMonthTemperatures = new HashSet<>();

        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
               // System.out.println(weeklyMonthTemperatures[i][j]);
                AllweeklyMonthTemperatures.add(weeklyMonthTemperatures[i][j]);
                if(weeklyMonthTemperatures[i][j] >= max){
                    max = weeklyMonthTemperatures[i][j];
                }
                if(weeklyMonthTemperatures[i][j] <= min){
                    min = weeklyMonthTemperatures[i][j];
                }

            }

        }


        System.out.println("High : "+max);
        System.out.println("Low : "+min);
        //System.out.println(AllweeklyMonthTemperatures);
        String notSeenTem = new String();
        notSeenTem = "";
        for (int i = min; i <=max ; i++) {
            if(AllweeklyMonthTemperatures.contains(i)){
                continue;
            }else{
                notSeenTem = notSeenTem +i + " ";
            }
        }
        //System.out.println(notSeenTem);

        return notSeenTem;
    }


}
