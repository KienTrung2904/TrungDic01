module com.example.trungdic01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.trungdic01 to javafx.fxml;
    exports com.example.trungdic01;
}