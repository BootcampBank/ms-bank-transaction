package com.bc48.mstransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.logging.Logger;

@SpringBootApplication
public class TransactionApplication implements CommandLineRunner{

	private static final Logger logger = Logger.getLogger(TransactionApplication.class.toString());
	private static String apiGateway;

	@Autowired
	private Environment env;


	@Override
	public void run(String... args) throws Exception {

		logger.info("Application name: " + env.getProperty("spring.application.name"));

	}

	public static String getApiGateway() { return apiGateway; }



	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
	}

}
