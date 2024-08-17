package org.newapp.just_for_fun.Implementation;

import org.newapp.just_for_fun.forms.FormsInterface;
import org.newapp.just_for_fun.forms.RectangleInterface;
import org.newapp.just_for_fun.forms.SquareInterface;

public class FormImpl implements FormsInterface {
    private RectangleInterface rectangleInterface;
    private SquareInterface squareInterface;

    public FormImpl(){
        this.rectangleInterface = new RectangleImpl();
        this.squareInterface = new SquareImpl();
    }
    @Override
    public String print(){
        return " "+rectangleInterface.print()+squareInterface.print();
    }
}
