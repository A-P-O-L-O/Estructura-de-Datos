package PQ.Grafos_Arboles;

import java.util.TreeMap;

class Employee {
    private int id;
    private String name;
    private Employee manager;
    private TreeMap<Integer, Employee> subordinates;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        subordinates = new TreeMap<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.put(subordinate.getId(), subordinate);
    }

    public void removeSubordinate(Employee subordinate) {
        subordinates.remove(subordinate.getId());
    }

    public TreeMap<Integer, Employee> getSubordinates() {
        return subordinates;
    }
}