module org.example.studentmanagera {
    requires javafx.controls;
    requires javafx.fxml;


    opens loose.oose.fis.lab.student.manager to javafx.fxml;
    exports loose.oose.fis.lab.student.manager;
}