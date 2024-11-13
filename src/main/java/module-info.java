module dk.haliimo.versioncontrolsnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.haliimo.versioncontrolsnew to javafx.fxml;
    exports dk.haliimo.versioncontrolsnew;
}