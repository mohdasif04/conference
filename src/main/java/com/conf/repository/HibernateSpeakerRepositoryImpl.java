package com.conf.repository;

import java.util.ArrayList;
import java.util.List;

import com.conf.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	public List<Speaker> findAll() {

		List<Speaker> speakers = new ArrayList<Speaker>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("Mohd");
		speaker.setLastName("Asif");

		speakers.add(speaker);

		return speakers;

	}

}
