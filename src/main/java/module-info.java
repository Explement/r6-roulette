module org.explement {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.explement to javafx.fxml;
    exports org.explement;
}
