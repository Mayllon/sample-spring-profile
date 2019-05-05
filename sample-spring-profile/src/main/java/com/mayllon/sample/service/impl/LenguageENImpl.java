package com.mayllon.sample.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.mayllon.sample.service.Lenguage;

@Profile("EN")
@Component
public class LenguageENImpl implements Lenguage {

	@Override
	public String hello(String name) {
		return "Hi "+name;
	}

}
