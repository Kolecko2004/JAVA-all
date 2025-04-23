package org.example.cv6;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class ActionEventHandlerInt implements EventHandler<ActionEvent> {
    private Label label1;

    public ActionEventHandlerInt(Label label1) {
        this.label1 = label1;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
