module org.example.cv6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.cv6 to javafx.fxml;
    exports org.example.cv6;
}