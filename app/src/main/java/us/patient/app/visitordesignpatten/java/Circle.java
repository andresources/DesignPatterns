package us.patient.app.visitordesignpatten.java;

public class Circle implements Visitable{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Circle(int num) {
        this.num = num;
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
