package com.example.learnboot.LearnSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learnboot.LearnSpringBoot.entity.User;
import com.example.learnboot.LearnSpringBoot.service.UserDAOService;
import com.example.learnboot.LearnSpringBoot.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner2 implements CommandLineRunner {

	@Autowired
	UserDAOService userService;

	@Autowired
	UserRepository userRepo;

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner2.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Jill", "User");
		//Long insert = userService.insert(user);
		
		User jill = userRepo.save(user);
		log.info("New User is created :" + jill);

	}

}
