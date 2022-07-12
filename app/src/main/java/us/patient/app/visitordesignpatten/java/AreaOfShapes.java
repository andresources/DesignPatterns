package us.patient.app.visitordesignpatten.java;

import android.util.Log;

public class AreaOfShapes implements Visitor{
    @Override
    public int visit(Circle circle) {
        return circle.getNum()*5;
    }

    @Override
    public int visit(Triangle triangle) {
        return triangle.getNum1()*7;
    }

    @Override
    public int visit(Square square) {
        return square.getNum()*9;
    }

    @Override
    public void display(Circle circle) {
        Log.i("VD","I am Circle");
    }

    @Override
    public void display(Triangle triangle) {
        Log.i("VD","I am Triangle");
    }

    @Override
    public void display(Square square) {
        Log.i("VD","I am Square");
    }
}
