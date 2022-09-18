package org.mvc.controllers;

import org.mvc.models.Database;
import org.mvc.models.De;
import org.mvc.views.GameView;

public class GameController {
    private GameView view;

    public GameController(GameView view){
        this.view = view;
        this.view.setController(this);
    }

    public void run() {
        while (true){
            view.promtForUserInpt();
        }
    }

    public void throwDe() {
        De score = De.getRandomValue();
        Database.addScore(score);
        view.promptScore(score);
    }

    public void stopGame() {
        for (De score: Database.geScores()) {
            view.promptScore(score);
        }
        System.exit(0);
    }
}
