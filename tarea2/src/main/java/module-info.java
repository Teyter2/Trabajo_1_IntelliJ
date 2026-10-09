module com.example.tarea2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tarea2 to javafx.fxml;
    exports com.example.tarea2;
}