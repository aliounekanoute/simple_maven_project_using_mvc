package org.mvc.views;

import org.mvc.controllers.GameController;
import org.mvc.models.De;

import java.util.Scanner;

public class GameView {
    private GameController controller;
    private Scanner scanner;

    public GameView(){
        scanner = new Scanner(System.in);
    }

    public void setController(GameController controller) {
        this.controller = controller;
    }

    public void promptScore(De score) {
        System.out.println(String.format("Le score est de : %d", score.value));
    }

    public void promtForUserInpt() {
        System.out.println("Faites votre choix:");
        System.out.println("1. Lancer le De");
        System.out.println("2. Arreter le jeu");

        int choice = scanner.nextInt();
        if (choice == 1){
            controller.throwDe();
        } else {
            controller.stopGame();
        }
    }
}
