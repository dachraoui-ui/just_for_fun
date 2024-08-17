package org.newapp.just_for_fun.Implementation;

import org.newapp.just_for_fun.forms.RectangleInterface;
import org.springframework.stereotype.Component;

@Component
public class RectangleArabicImpl implements RectangleInterface {

    @Override
    public String print() {
        return "mostatil";
    }
}
