package com.example.javafx_new;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.*;

public class ThreeHundredGramsController {


    String url = "https://upload.wikimedia.org/wikipedia/commons/b/b5/%D0%98%D0%BC%D0%BF%D0%BE%D1%80%D1%82%D0%BE%D0%B7%D0%B0%D0%BC%D0%B5%D1%89%D0%B5%D0%BD%D0%B8%D0%B5.png";
    String url2 = "https://addons-media.operacdn.com/media/CACHE/images/themes/55/75155/1.0-rev1/images/cc59b5be-7c67-42b5-9726-e9f9b0af93cd/923d058bdf9bd9af44ae196624776b4c.jpg";


    @FXML
    private TextArea allMessege;

    @FXML
    private TextField messegeTextField;

    @FXML
    private AnchorPane messegePane;

    @FXML
    private Pane pane;

    @FXML
    private void sendMessegeButtonAction(ActionEvent actionEvent){

        allMessege.appendText("\n");
        allMessege.appendText("mamkinHatzker: " + messegeTextField.getText());
        if (allMessege.getText().toCharArray().length > 40){
            allMessege.appendText("\nК беседе присоединился новый участник - майор Шевчук А.Б. \"ФСБ-сила\" !");
        }

        messegeTextField.clear();
    };

    @FXML
    void initialize() {
        pane.setBackground(new Background(new BackgroundImage(new Image(url), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        messegePane.setBackground(new Background(new BackgroundImage(new Image(url2), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
    }

}
class MatiEgoAnimatzia implements Runnable{

    Pane pane;
    String [] imgUrl;
    Integer delay;

    public MatiEgoAnimatzia(Pane pane, String[] imgUrl, Integer delay) {
        this.pane = pane;
        this.imgUrl = imgUrl;
        this.delay = delay;
    }

    @Override
    public void run() {
        String url = null;


        pane.setBackground(new Background(new BackgroundImage(new Image(url), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));





    }
}