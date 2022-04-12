module com.example.javafx_new {
    requires javafx.controls;
    requires javafx.fxml;


    //opens com.example.javafx_new to javafx.fxml;

    opens com.example.javafx_new to javafx.fxml;
   // exports com.example.javafx_new.Client;
    exports com.example.javafx_new;
    exports com.example.javafx_new.Client;
    opens com.example.javafx_new.Client to javafx.fxml;
}