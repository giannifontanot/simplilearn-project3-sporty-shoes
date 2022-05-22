package com.javabootcamp.project3.sportyshoes;

import com.javabootcamp.project3.sportyshoes.jdbc.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportyShoesApplication implements CommandLineRunner {
private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserDao dao;

	public static void main(String[] args)  {
		SpringApplication.run(SportyShoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" - FindAll() ---> {}",dao.getAllUsers());
		logger.info(" - getString() ---> {}",dao.getString());
	}
}
