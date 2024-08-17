package org.newapp.just_for_fun.config;

import org.newapp.just_for_fun.Implementation.FormImpl;
import org.newapp.just_for_fun.Implementation.RectangleImpl;
import org.newapp.just_for_fun.Implementation.SquareImpl;
import org.newapp.just_for_fun.forms.FormsInterface;
import org.newapp.just_for_fun.forms.RectangleInterface;
import org.newapp.just_for_fun.forms.SquareInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FormConfig {

    @Bean
    public FormsInterface formsInterface(RectangleInterface rectangleInterface,SquareInterface squareInterface){
        return new FormImpl(rectangleInterface,squareInterface);
    }
    @Bean
    public RectangleInterface rectangleInterface(){
        return new RectangleImpl();
    }
    @Bean
    public SquareInterface squareInterface(){
        return new SquareImpl();
    }

}
