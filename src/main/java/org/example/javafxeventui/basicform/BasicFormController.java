package org.example.javafxeventui.basicform;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BasicFormController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private Button validateButton;

    @FXML
    private Label messageLabel;

    @FXML
    protected void handleValidateButtonAction() {
        String name = nameTextField.getText();
        String firstName = firstNameTextField.getText();
        messageLabel.setText("Hello " + name + " " + firstName);
    }
}