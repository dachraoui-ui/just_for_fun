package org.newapp.just_for_fun;


import org.newapp.just_for_fun.config.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JustForFunApplication implements CommandLineRunner {

    private Pizza pizza;

   public JustForFunApplication(Pizza pizza){
       this.pizza = pizza;
   }
    private static final Logger log = LoggerFactory.getLogger(JustForFunApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JustForFunApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(
                String.format("I Want a %s crust pizza, with %s and %s sauce ",
                        pizza.getCrust(),
                        pizza.getTopping(),
                pizza.getSauce())
        );
    }
}


