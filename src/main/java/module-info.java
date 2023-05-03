module com.example.registration {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.registration to javafx.fxml;
    exports com.example.registration;
}