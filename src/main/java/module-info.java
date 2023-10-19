module com.example.it4202324 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.it4202324 to javafx.fxml;
    exports com.example.it4202324;
}