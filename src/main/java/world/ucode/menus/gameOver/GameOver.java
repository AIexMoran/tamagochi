package world.ucode.menus.gameOver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GameOver {

    @FXML
    private Button backButton;

    @FXML
    private Button newGameButton;

    @FXML
    private void startNewGame(ActionEvent e) {
        System.out.println("Start new Game");
    }

    @FXML
    private void backToMenu(ActionEvent e) {
        System.out.println("back to Menu");
    }

}
