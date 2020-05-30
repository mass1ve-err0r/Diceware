package de.saadatbaig.DicewareJ.Views;

import de.saadatbaig.DicewareJ.Main;
import de.saadatbaig.DicewareJ.Models.Tuple;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class HomeView {

    @FXML Label lHeader;
    @FXML TextField tfAmount;
    @FXML CheckBox cbWhitespace;
    @FXML CheckBox cbNums;
    @FXML ListView<String> lvLogger;
    @FXML Button btnGenerate;
    @FXML Label lPass;
    @FXML ScrollPane spPassView;

    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();

    public void lateinit() {
        spPassView.setTooltip(new Tooltip("Click me to copy your password!"));
        lvLogger.setTooltip(new Tooltip("The used words will be shown here!"));
    }

    public void createPassword() {
        if (tfAmount.getText().isBlank()) {
            showWarning("Field is Blank! Please retry...");
        } else {
            try {
                int n = Integer.parseInt(tfAmount.getText());
                Main.cp(n, cbWhitespace.isSelected(), cbNums.isSelected());
            } catch (NumberFormatException nfe) {
                showWarning("Number could NOT be parsed! Please retry...");
            }
        }
    }

    private void showWarning(String msg) {
        new Alert(Alert.AlertType.ERROR, msg, ButtonType.CANCEL).showAndWait();
    }

    /* End */
}
