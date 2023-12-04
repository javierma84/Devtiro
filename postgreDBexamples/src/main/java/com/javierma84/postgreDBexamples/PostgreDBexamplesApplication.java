package com.javierma84.postgreDBexamples;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class PostgreDBexamplesApplication implements CommandLineRunner {

	private final DataSource dataSource;

	public PostgreDBexamplesApplication(final DataSource dataSource) { this.dataSource = dataSource; }

	public static void main(String[] args) {
		SpringApplication.run(PostgreDBexamplesApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("Datasource: " + dataSource.toString());
		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("select 1");
	}
}
