package world.ucode.menus.gamePlay;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import world.ucode.menus.handler.MenuHandler;

public class GamePlay {

    @FXML
    private Button saveGameButton;

    @FXML
    private Button exitGameButton;

    @FXML
    private Button playButton;

    @FXML
    private Button feedButton;

    @FXML
    private Button drinkPetButton;

    @FXML
    private Button healButton;

    @FXML
    private Button cleanButton;

    @FXML
    private Canvas tamagotchiCanvas;

    @FXML
    private Canvas scoreCanvas;

    @FXML
    private Label tamagotchiName;

    public void reset() {
        tamagotchiName.setText("");
        scoreCanvas.getGraphicsContext2D().clearRect(0, 0, scoreCanvas.getWidth(), scoreCanvas.getHeight());
        tamagotchiCanvas.getGraphicsContext2D().clearRect(0, 0, tamagotchiCanvas.getWidth(), tamagotchiCanvas.getHeight());
    }

    public void newGame(String name, String pet, double maxHealth) {
        tamagotchiName.setText(name);
    }

    public void loadGame() {

    }

    @FXML
    private void cleanPet(ActionEvent e) {
        System.out.println("Clean pet");
    }

    @FXML
    private void healPet(ActionEvent e) {
        System.out.println("heal pet");
    }

    @FXML
    private void drinkPet(ActionEvent e) {
        System.out.println("drink pet");
    }

    @FXML
    private void feedPet(ActionEvent e) {
        System.out.println("Feed pet");
    }
    @FXML
    private void playWithPet(ActionEvent e) {
        System.out.println("Play with pet");
    }

    @FXML
    private void saveGame(ActionEvent e) {
        System.out.println("save game");
    }

    @FXML
    private void exitGame(ActionEvent e) {
        MenuHandler handler = MenuHandler.getMenuHandler();

        handler.activate(MenuHandler.GameScene.MAIN);
    }

}
