module com.example.assignment3java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment3java to javafx.fxml;
    exports com.example.assignment3java;
}