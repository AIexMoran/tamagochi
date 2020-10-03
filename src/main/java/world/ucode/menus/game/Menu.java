package world.ucode.menus.game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import world.ucode.menus.handler.MenuHandler;
import world.ucode.menus.load.Load;
import world.ucode.menus.newGame.NewGame;


public class Menu {

    @FXML
    private Button newGameButton;

    @FXML
    private Button loadGameButton;

    @FXML
    private Button exitButton;

    @FXML
    private void exitGame(ActionEvent e) {
        Stage stage = (Stage) exitButton.getScene().getWindow();

        stage.close();
    }

    @FXML
    private void loadGame(ActionEvent e) {
        MenuHandler handler = MenuHandler.getMenuHandler();

        FXMLLoader loader = handler.activate(MenuHandler.GameScene.LOAD);
        Load load = loader.getController();
        load.reset();
        load.load();
    }

    @FXML
    private void newGame(ActionEvent e) {
        MenuHandler handler = MenuHandler.getMenuHandler();

        FXMLLoader loader = handler.activate(MenuHandler.GameScene.NEW_GAME);
        NewGame newGame = loader.getController();
        newGame.reset();
    }

}
