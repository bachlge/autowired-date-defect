package com.gork.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	@Autowired Detail detail;

	public MainView() {
        Button button = new Button("Click me",
                e -> detail.open());
        add(button);
    }

}
