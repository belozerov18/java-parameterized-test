module com.example.thirdsprint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thirdsprint to javafx.fxml;
    exports com.example.thirdsprint;
}