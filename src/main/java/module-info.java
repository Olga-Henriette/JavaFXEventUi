module org.example.javafxeventui {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.javafxeventui.basicform to javafx.fxml;
    exports org.example.javafxeventui.basicform;

    opens org.example.javafxeventui.contactform to javafx.fxml;
    exports org.example.javafxeventui.contactform;
}