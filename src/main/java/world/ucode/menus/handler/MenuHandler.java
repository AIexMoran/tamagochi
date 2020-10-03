package world.ucode.menus.handler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import world.ucode.menus.game.Menu;

import java.util.HashMap;

public class MenuHandler {

    private HashMap<GameScene, Scene> sceneMap = new HashMap<>();
    private HashMap<GameScene, FXMLLoader> loaderMap = new HashMap<>();
    private Stage stage;
    private static MenuHandler instance;

    public enum GameScene {
        MAIN,
        GAVE_OVER,
        GAME_PLAY,
        LOAD,
        NEW_GAME,
    }

    private MenuHandler() {

    }

    public void addMenu(GameScene s, String resource) {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource(resource));
        try {
            sceneMap.put(s, new Scene(loader.load()));
            loaderMap.put(s, loader);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public FXMLLoader activate(GameScene s) {
        stage.setScene(sceneMap.get(s));
        return loaderMap.get(s);
    }

    public MenuHandler init(Stage stage) {
        if (this.stage == null) {
            this.stage = stage;
        }
        stage.setResizable(false);
        return this;
    }

    public static MenuHandler getMenuHandler() {
        if (instance == null) {
            instance = new MenuHandler();
        }
        return instance;
    }

}
