package com.example.taskmanagement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class TaskManagementController {
    @FXML
    private ListView<Task> listView;

    private ObservableList<Task> tasks = FXCollections.observableArrayList();

    public void initialize() {
        // Инициализируйте ListView
        listView.setItems(tasks);
    }
    @FXML
    private Label selectedText;

    @FXML
    protected void onListClicked() {
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Task selectedTask = tasks.get(selectedIndex);
            selectedText.setText(selectedTask.toString());
        } else {
            selectedText.setText("");
        }
    }
    @FXML
    private RadioButton homeworkRadioButton;

    @FXML
    private RadioButton meetingRadioButton;

    @FXML
    private RadioButton shoppingRadioButton;
}
