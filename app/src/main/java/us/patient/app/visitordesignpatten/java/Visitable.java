package us.patient.app.visitordesignpatten.java;

public interface Visitable {
    int accept(Visitor visitor);
    void display(Visitor visitor);
}
