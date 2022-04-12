package com.example.javafx_new.Client;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button toolBarButton1;

    @FXML
    private VBox userBox;

    @FXML
    private Button exit;
    @FXML
    private Label userLabel;
    @FXML
    private VBox messegeBox;
    @FXML
    private Button sendMessage;
    @FXML
    private TextField clientMessageArea;

    @FXML
    private void exitButtonAction(){

        FXMLLoader loader = new FXMLLoader(HelloController.class.getResource("Register-UI.fxml"));

        try {
            Parent  anotherRoot = loader.load();
            Stage anotherStage = new Stage();
            anotherStage.setTitle("Another Window Triggered by Clicking");
            anotherStage.setScene(new Scene(anotherRoot, 600, 329));
            anotherStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.exit(0);
    }

    @FXML
    private void onHelloButtonClick() {
        userBox.getChildren().add(addNewUserToUserBox("lolik"));
    }

    @FXML
    private void sendMessage(){
        messegeBox.getChildren().add(addNewMessege2("мое сообщение", clientMessageArea.getText()));
        final ScrollPane.ScrollBarPolicy vbarPolicy = scrollPaneMessageBox.getVbarPolicy();

        clientMessageArea.clear();
    }

    private Button addNewUserToUserBox(String userName){
        Button user = new Button();
        user.setDefaultButton(true);
        user.setText(userName);
        user.autosize();
        user.setPrefWidth(130);
        user.setMinWidth(130);
        user.setMinHeight(40);
        user.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if (e.getButton() == MouseButton.SECONDARY) {
                    userBox.getChildren().remove(user);
                    userLabel.setText("...");
                }else if (e.getButton() == MouseButton.PRIMARY){
                    userLabel.setText(user.getText());
                }
//                else {
//                    System.out.println("No right click");
//                }
            }
        });


        return user;
    }
    @FXML
    private ScrollPane scrollPaneMessageBox;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> nickTableRow;

    @FXML
    private TableColumn<?, ?> statusTableRow;

    @FXML
    private ToolBar toolBar;

    @FXML
    private TableView<?> usersTable;

    @FXML
    void initialize() {

       // scrollPaneMessageBox.setPannable(true);


        


        messegeBox.getChildren().add(addNewMessege2(userLabel.getText(), "asdfasdfasdf"));
        for (int i = 0; i < 4; i++) {
            userBox.getChildren().add(addNewUserToUserBox("lolik" + i));
        }


    }
    private VBox addNewMessege2(String user, String message){
        final VBox vBox = new VBox();
        final Label userName = new Label(user);
        //userName.setEditable(false);
        //userName.setMaxHeight(16);

        final TextArea textArea = new TextArea(message);
        textArea.setEditable(false);


        vBox.getChildren().addAll(userName, textArea);

        return vBox;
    }


    private TitledPane addNewMessege(String user, String message) {
        TitledPane pane = new TitledPane();
        pane.setMinWidth(495);
        pane.setMaxWidth(495);
        pane.setCollapsible(false);
        pane.setTextAlignment(TextAlignment.RIGHT);
        pane.setText(user);

        TextArea msg = new TextArea();
        msg.setEditable(false);
        msg.setText(message);

        TextField textField = new TextField(message);
        textField.setEditable(false);


        pane.setContent(textField);






        return pane;
    }

}