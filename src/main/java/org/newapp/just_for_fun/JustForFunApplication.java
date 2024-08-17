package org.newapp.just_for_fun;

import org.newapp.just_for_fun.Implementation.FormImpl;
import org.newapp.just_for_fun.forms.FormsInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JustForFunApplication implements CommandLineRunner {
    private final FormsInterface formsInterface;

    public JustForFunApplication (FormsInterface formsInterface) {
        this.formsInterface = formsInterface;
    }

    private static final Logger log = LoggerFactory.getLogger(JustForFunApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JustForFunApplication.class, args);
    }
    @Override
    public void run(final String... args){
        log.info(formsInterface.print());
    }
}
