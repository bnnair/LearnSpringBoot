package com.example.learnboot.LearnSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learnboot.LearnSpringBoot.entity.User;
import com.example.learnboot.LearnSpringBoot.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	UserDAOService userService;
	
	private static final Logger log = 
			LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Jack", "ADMIN");
		Long insert = userService.insert(user);
		
		log.info("New User is created :" + user);

	}

}
