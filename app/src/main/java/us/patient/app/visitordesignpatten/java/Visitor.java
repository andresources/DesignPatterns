package us.patient.app.visitordesignpatten.java;

public interface Visitor {
    int visit(Circle circle);
    int visit(Triangle triangle);
    int visit(Square square);
    void display(Circle circle);
    void display(Triangle triangle);
    void display(Square square);
}
