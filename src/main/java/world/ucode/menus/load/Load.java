package world.ucode.menus.load;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.menus.handler.MenuHandler;


public class Load {

    @FXML
    private Button firstSave;

    @FXML
    private Button secondSave;

    @FXML
    private Button thirdSave;

    @FXML
    private Button backButton;

    public void reset() {
        firstSave.setOpacity(1.0);
        secondSave.setOpacity(1.0);
        thirdSave.setOpacity(1.0);

        firstSave.setText("EMPTY");
        secondSave.setText("EMPTY");
        thirdSave.setText("EMPTY");
    }

    public void load() {

    }

    @FXML
    private void backToMenu(ActionEvent e) {
        MenuHandler handler = MenuHandler.getMenuHandler();

        handler.activate(MenuHandler.GameScene.MAIN);
    }

    @FXML
    private void firstSave(ActionEvent e) {
        System.out.println("first Save");
    }

    @FXML
    private void secondSave(ActionEvent e) {
        System.out.println("second Save");
    }

    @FXML
    private void thirdSave(ActionEvent e) {
        System.out.println("third Save");
    }

}
