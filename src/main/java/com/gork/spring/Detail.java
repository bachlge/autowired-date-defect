package com.gork.spring;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;

@Component
public class Detail extends Dialog {

	Detail() {};

	@PostConstruct
	private void init() {
		add(new Label("Hi there"));

		// uncomment the next line and it won't compile!
//		DatePicker datePicker = new DatePicker();
//		add(datePicker);
	}
}
