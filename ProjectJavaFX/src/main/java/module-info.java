module com.myprojectfx.projectjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myprojectfx.projectjavafx to javafx.fxml;
    exports com.myprojectfx.projectjavafx;
}
