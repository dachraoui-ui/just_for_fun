package org.newapp.just_for_fun.Implementation;

import org.newapp.just_for_fun.forms.FormsInterface;
import org.newapp.just_for_fun.forms.RectangleInterface;
import org.newapp.just_for_fun.forms.SquareInterface;
import org.springframework.stereotype.Component;

@Component
public class FormImpl implements FormsInterface {
    private RectangleInterface rectangleInterface;
    private SquareInterface squareInterface;

    public FormImpl(RectangleInterface rectangleInterface,SquareInterface squareInterface){
        this.rectangleInterface = rectangleInterface;
        this.squareInterface = squareInterface;
    }
    @Override
    public String print(){
        return " "+rectangleInterface.print()+"  "+squareInterface.print();
    }
}
