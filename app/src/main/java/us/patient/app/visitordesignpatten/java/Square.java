package us.patient.app.visitordesignpatten.java;

public class Square implements Visitable{
    private int num;

    public Square(int num) {
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
