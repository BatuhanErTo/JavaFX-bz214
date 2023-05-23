module com.spaghetti.visfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spaghetti.visfx to javafx.fxml;
    exports com.spaghetti.visfx;
}