package com.example.learnboot.LearnSpringBoot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learnboot.LearnSpringBoot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
