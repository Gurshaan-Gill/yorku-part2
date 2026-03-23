package com.yorku;

import com.yorku.coordinator.HeadLabCoordinator;
import com.yorku.coordinator.LabManager;
import com.yorku.gui.LoginScreen;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    private static LabManager labManager;

    @Override
    public void start(Stage stage) {
        HeadLabCoordinator head = HeadLabCoordinator.getInstance();
        labManager = head.generateLabManager("Alice"); // generates a LabManager

        LoginScreen login = new LoginScreen(stage,labManager);
        login.show();
    }

    public static void main(String[] args) {
        launch();
    }
     public static LabManager getLabManager() {
        return labManager;
    }
}