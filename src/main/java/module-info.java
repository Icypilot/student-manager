module org.example.studentmanagera {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.studentmanagera to javafx.fxml;
    exports org.example.studentmanagera;
}