package org.example.memento.exercise;


//memento
public class EmployeeMemento {
    private String name;
    private String phone;

    // cel care creaza memento copy
    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento emp) {
        this.name = emp.getName();
        this.phone = emp.getPhone();
    }

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return name + " " + phone;
    }
}
