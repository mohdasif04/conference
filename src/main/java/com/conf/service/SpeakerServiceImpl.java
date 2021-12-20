package com.conf.service;

import java.util.List;

import com.conf.model.Speaker;
import com.conf.repository.HibernateSpeakerRepositoryImpl;
import com.conf.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repositoryImpl = new HibernateSpeakerRepositoryImpl();

	public List<Speaker> findAll() {
		return repositoryImpl.findAll();
	}

}
