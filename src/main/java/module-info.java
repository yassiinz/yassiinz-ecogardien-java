module GestionRecyclage {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.sql;
    requires qrgen;
    requires com.gluonhq.maps;
    requires javafx.web;
    requires jdk.jsobject;
    requires java.mail;
    requires twilio;
    requires com.google.gson;
    requires java.persistence;
    requires profanity.filter;
    requires java.desktop;
    requires bcrypt;
    requires org.jfree.jfreechart;
    requires org.jfree.chart.fx;
    requires okhttp3;
    requires stripe.java;
    requires AnimateFX;
    requires kernel;
    requires layout;
    requires org.apache.pdfbox;
    requires io;
    requires com.dlsc.formsfx;
    requires org.controlsfx.controls;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires json.simple;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;
    requires itextpdf;
    exports EDU.evenements.entities;
    exports EDU.evenements.controllers;
    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    opens Recyclage.entities;
    opens Recyclage.controllers;
    opens Recyclage.services;
    opens Recyclage.interfaces;
    opens Recyclage.tests;
    opens Recyclage.tools;
    opens org.example.controller;
    opens org.example.entity;
    opens org.example.service;
    opens EDU.userjava1.controllers;
    opens EDU.evenements.tests;
    opens EDU.evenements.entities;
    opens EDU.userjava1.entities to javafx.base;
    opens EDU.evenements.controllers;
    exports org.example;
    exports org.example.entity;
    exports org.example.controller;
    exports org.example.service;

}