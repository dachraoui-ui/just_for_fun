package org.newapp.just_for_fun.Implementation;

import org.newapp.just_for_fun.forms.SquareInterface;
import org.springframework.stereotype.Component;

@Component
public class SquareArabicImpl implements SquareInterface {

    @Override
    public String print() {
        return "moraba3";
    }


}
