package com.conf.app;

import com.conf.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {

		SpeakerServiceImpl service = new SpeakerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstName());

	}

}
