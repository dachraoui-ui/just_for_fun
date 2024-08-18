package org.newapp.just_for_fun;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class JustForFunApplication implements CommandLineRunner {


    private DataSource dataSource;

    public JustForFunApplication(DataSource dataSource){
        this.dataSource = dataSource;
    }

    private static final Logger log = LoggerFactory.getLogger(JustForFunApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JustForFunApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("DataSource {}", dataSource.toString());
        final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("select 1");
    }
}


