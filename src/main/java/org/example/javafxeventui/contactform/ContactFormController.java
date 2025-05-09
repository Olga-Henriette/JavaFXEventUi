package org.example.javafxeventui.contactform;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ContactFormController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private ToggleGroup genderToggleGroup;

    @FXML
    private ComboBox<String> countryComboBox;

    @FXML
    private TextArea messageTextArea;

    @FXML
    private CheckBox newsletterCheckBox;

    @FXML
    private Button sendButton;

    @FXML
    private Label resultLabel;

    @FXML
    public void initialize() {
        ObservableList<String> countries = FXCollections.observableArrayList(
                "Madagascar",
                "France",
                "United States",
                "Canada",
                "Japan"
        );
        countryComboBox.setItems(countries);
        countryComboBox.setValue("Madagascar");
    }

    @FXML
    protected void handleSendButtonAction() {
        String name = nameTextField.getText();
        String firstName = firstNameTextField.getText();
        String gender = maleRadioButton.isSelected() ? "Male" : (femaleRadioButton.isSelected() ? "Female" : "Not specified");
        String country = countryComboBox.getValue();
        String message = messageTextArea.getText();
        boolean subscribe = newsletterCheckBox.isSelected();

        String output = "Name :  " + name + "\n" +
                "First Name :  " + firstName + "\n" +
                "Gender :  " + gender + "\n" +
                "Country :  " + country + "\n" +
                "Message :  " + message + "\n" +
                "Subscribe to newsletter :  " + (subscribe ? "Yes" : "No");

        resultLabel.setText(output);
    }
}