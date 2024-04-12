module com.alilopez.gestionimagen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alilopez.gestionimagen to javafx.fxml;
    exports com.alilopez.gestionimagen;
    exports com.alilopez.gestionimagen.controllers;
    opens com.alilopez.gestionimagen.controllers to javafx.fxml;
}