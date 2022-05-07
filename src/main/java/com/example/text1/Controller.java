package com.example.text1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField fileSearch;

    @FXML
    private ListView<String> sampleText;

    ObservableList<String> rowList = FXCollections.observableArrayList();

    File fileObject;

    @FXML
    void addFile(ActionEvent event) {

        Node source = (Node) event.getSource();
        Stage prinaryStage = (Stage) source.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter tXTFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(tXTFilter);
        fileChooser.getExtensionFilters().addAll(tXTFilter);
        fileChooser.setTitle("Выбор файла ");
        fileObject = fileChooser.showOpenDialog(prinaryStage);
        try {
            fileSearch.setText(fileObject.getPath());
        } catch (Exception e) {

        }
    }

    @FXML
    void innFile(ActionEvent event) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileObject),"cp1251"));
            String line = reader.readLine();
            rowList.add(line);

            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    rowList.add(line);
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }

        sampleText.setItems(rowList);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}