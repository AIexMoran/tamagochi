package world.ucode.menus.newGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import world.ucode.menus.gamePlay.GamePlay;
import world.ucode.menus.handler.MenuHandler;

public class NewGame {

    private String selectedPet;

    @FXML
    private TextField nameTextField;

    @FXML
    private ImageView firstPet;

    @FXML
    private ImageView secondPet;

    @FXML
    private ImageView thirdPet;

    @FXML
    private Button startButton;

    @FXML
    private Button backButton;

    @FXML
    private Slider healthSlider;

    public void reset() {
        unselectPet(firstPet);
        unselectPet(secondPet);
        unselectPet(thirdPet);
        nameTextField.setText("");
        selectedPet = null;
    }

    private void selectPet(ImageView view) {
        DropShadow shadow = new DropShadow();
        shadow.setRadius(20.0);
        shadow.setColor(Color.BLACK);
        view.setEffect(shadow);
        view.setScaleX(1.07);
        view.setScaleY(1.07);
        selectedPet = view.getId();
    }

    private void unselectPet(ImageView view) {
        BoxBlur blur = new BoxBlur();

        blur.setWidth(7);
        blur.setIterations(1);
        view.setEffect(blur);
        view.setScaleX(1.0);
        view.setScaleY(1.0);
    }

    @FXML
    private void checkFirstPet() {
        unselectPet(secondPet);
        unselectPet(thirdPet);
        selectPet(firstPet);
    }

    @FXML
    private void checkSecondPet() {
        unselectPet(firstPet);
        unselectPet(thirdPet);
        selectPet(secondPet);
    }

    @FXML
    private void checkThirdPet() {
        unselectPet(firstPet);
        unselectPet(secondPet);
        selectPet(thirdPet);
    }

    @FXML
    private void backToMenu(ActionEvent e) {
        MenuHandler handler = MenuHandler.getMenuHandler();

        handler.activate(MenuHandler.GameScene.MAIN);
    }

    @FXML
    private void startGame(ActionEvent e) {
        if (nameTextField.getText().length() == 0 || selectedPet == null) {
            return;
        }
        MenuHandler handler = MenuHandler.getMenuHandler();

        FXMLLoader loader = handler.activate(MenuHandler.GameScene.GAME_PLAY);
        GamePlay gamePlay = loader.getController();
        gamePlay.newGame(nameTextField.getText(), selectedPet, healthSlider.getValue());
    }

}
