module com.example.javafx_new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_new to javafx.fxml;
    exports com.example.javafx_new;
}