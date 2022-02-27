package com.example.lab3;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TallyingElection {
    public String tally (List<String> votes) {
        System.out.println("////////////TallyingElection");

        //System.out.println(votes);

        Map<String ,Integer> votesMost = new HashMap<>();
        int count = 0;
        String[] arrayVotes = votes.toArray(new String[0]);
        for (int i = 0; i < arrayVotes.length; i++) {
                votesMost.put(arrayVotes[i],count);
        }

        for (int i = 0; i < arrayVotes.length; i++) {
            if(votesMost.containsKey(arrayVotes[i]))
            {
                int countVote = votesMost.get(arrayVotes[i]);
                votesMost.put(arrayVotes[i],++countVote);
            }else
            {
                int countVote = votesMost.get(arrayVotes[i]);
                votesMost.put(arrayVotes[i],countVote);

            }
        }

        int vote = 0 ;
        String mostVote = "";
        for (Map.Entry<String,Integer> entry : votesMost.entrySet()){
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
            if(entry.getValue() >= vote){
                vote = entry.getValue();
                mostVote = entry.getKey();
            }
    }
       // System.out.println(votesMost);
        return mostVote;

    }
    }
