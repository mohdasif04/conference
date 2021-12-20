package com.conf.repository;

import java.util.List;

import com.conf.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}
