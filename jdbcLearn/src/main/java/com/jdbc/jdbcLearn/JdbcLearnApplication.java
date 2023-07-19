package com.jdbc.jdbcLearn;

import com.jdbc.jdbcLearn.entity.Person;
import com.jdbc.jdbcLearn.jdbc.PersonJDBC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JdbcLearnApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJDBC dao;
	public static void main(String[] args) {

		SpringApplication.run(JdbcLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 1=-> {}", dao.findById(1));
		logger.info("deleted id 3 number of rows effected is -> {}", dao.deleteById(3));
		logger.info("All users -> {}", dao.findAll());
		logger.info("insert id 3 ->{}",dao.insert(new Person(3,"Fadime","Berlin",new Date())));
		logger.info("update 2 ->{}", dao.update(new Person(2,"Ayşenur","fransa",new Date())));
		logger.info("All users -> {}", dao.findAll());
	}
}
