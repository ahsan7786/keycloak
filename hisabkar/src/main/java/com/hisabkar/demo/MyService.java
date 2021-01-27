package com.hisabkar.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired
	private MyRepo myrepo;
	
	@Transactional
	 public void test(MyTable t) {
		myrepo.save(t);
	}
}
