package world.ucode.main;

import javafx.application.Application;
import javafx.stage.Stage;
import world.ucode.menus.game.Menu;
import world.ucode.menus.handler.MenuHandler;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            MenuHandler menuHandler = MenuHandler.getMenuHandler().init(stage);

            menuHandler.addMenu(MenuHandler.GameScene.MAIN, "/scenes/GameMenu.fxml");
            menuHandler.addMenu(MenuHandler.GameScene.GAVE_OVER, "/scenes/GameOverMenu.fxml");
            menuHandler.addMenu(MenuHandler.GameScene.GAME_PLAY, "/scenes/GamePlayMenu.fxml");
            menuHandler.addMenu(MenuHandler.GameScene.NEW_GAME, "/scenes/NewGameMenu.fxml");
            menuHandler.addMenu(MenuHandler.GameScene.LOAD, "/scenes/LoadMenu.fxml");
            menuHandler.activate(MenuHandler.GameScene.MAIN);
            stage.setTitle("Tamagotchi");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
