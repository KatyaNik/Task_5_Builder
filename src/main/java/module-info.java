module com.example.builder_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.builder_task5 to javafx.fxml;
    exports com.example.builder_task5;
}