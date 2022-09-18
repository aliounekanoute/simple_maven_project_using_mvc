package org.mvc;

import org.mvc.controllers.GameController;
import org.mvc.views.GameView;

/**
 * Hello world!
 *
 */
public class GameApp
{
    public static void main( String[] args )
    {
        GameController controller = new GameController(new GameView());
        controller.run();
    }
}
