module me.heartalborada.bilibili.downloader.bilidownloader {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.google.gson;
    requires org.apache.commons.codec;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires com.google.zxing;
    requires com.google.zxing.javase;

    exports me.heartalborada.bilidownloader.gui;
    opens me.heartalborada.bilidownloader.gui to javafx.fxml;
}