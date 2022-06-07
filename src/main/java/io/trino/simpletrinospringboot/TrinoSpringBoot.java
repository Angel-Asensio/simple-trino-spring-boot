package io.trino.simpletrinospringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TrinoSpringBoot implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(TrinoSpringBoot.class);

	public static void main(String args[]) {
		SpringApplication.run(TrinoSpringBoot.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... strings) {
		log.info("Querying Trino to verify connection ...");
		int result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
		log.info("Result: {}", result);
	}
}