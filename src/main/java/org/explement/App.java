package org.explement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 ____   __     ____   ___  _   _ _     _____ _____ _____ _____ 
|  _ \ / /_   |  _ \ / _ \| | | | |   | ____|_   _|_   _| ____|
| |_) | '_ \  | |_) | | | | | | | |   |  _|   | |   | | |  _|  
|  _ <| (_) | |  _ <| |_| | |_| | |___| |___  | |   | | | |___ 
|_| \_\\___/  |_| \_\\___/ \___/|_____|_____| |_|   |_| |_____|

 */

public class App extends Application {

    private static Scene scene;

    @Override @SuppressWarnings("exports")
    public void start(Stage stage) throws IOException { // Start stage
        scene = new Scene(loadFXML("primary"));

        stage.setMinHeight(520);
        stage.setMinWidth(300);

        stage.setTitle("R6 Roulette");

        Image cardPath = new Image(App.class.getResourceAsStream("icon.png"));
        stage.getIcons().add(cardPath);

        PrimaryController.stage = stage;

        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException { // Set scene root
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException { // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) { // Launch app
        launch();
    }

}