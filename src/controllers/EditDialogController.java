package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by alex on 10.09.2016.
 */
public class EditDialogController {

    @FXML
    private Label labelFio;

    @FXML
    private Label labelPhone;

    @FXML
    private TextField txtFio;

    @FXML
    private TextField txtPhone;

    @FXML
    private Button btnOK;

    @FXML
    private Button btnCancel;

    public void btnOK(ActionEvent actionEvent) {
        System.out.println("Вау работает что то там");
    }
}
