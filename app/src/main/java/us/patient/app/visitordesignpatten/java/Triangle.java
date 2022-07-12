package us.patient.app.visitordesignpatten.java;

public class Triangle implements Visitable{
    public Triangle(int num1) {
        this.num1 = num1;
    }

    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public int accept(Visitor visitor) {
       return visitor.visit(this);
    }

    @Override
    public void display(Visitor visitor) {
        visitor.display(this);
    }
}
