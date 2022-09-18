package org.mvc.models;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<De> scores = new ArrayList<>();
    private Database(){};

    public static void addScore(De score){
        scores.add(score);
    }

    public static List<De> geScores(){
        return scores;
    }
}
