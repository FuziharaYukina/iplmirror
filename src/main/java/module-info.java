module top.fyukina.iplmirror {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens top.fyukina.iplmirror to javafx.fxml;
    exports top.fyukina.iplmirror;
}