package PQ.Grafos_Arboles;

import java.util.TreeMap;

public class EmployeeManager {
    private TreeMap<Integer, Employee> employeeTreeMap;

    public EmployeeManager() {
        employeeTreeMap = new TreeMap<>();
    }

    public void addEmployee(int id, String name, int managerId) {
        Employee employee = new Employee(id, name);
        employeeTreeMap.put(id, employee);

        // If managerId is provided and exists, set the manager for the employee
        if (managerId != 0 && employeeTreeMap.containsKey(managerId)) {
            Employee manager = employeeTreeMap.get(managerId);
            manager.addSubordinate(employee);
            employee.setManager(manager);
        }
    }

    public void deleteEmployee(int id) {
        Employee employee = employeeTreeMap.remove(id);
        if (employee != null) {
            // Remove the employee from their manager's subordinate list
            Employee manager = employee.getManager();
            if (manager != null) {
                manager.removeSubordinate(employee);
            }

            // Remove the employee from the subordinate list of other employees
            for (Employee e : employeeTreeMap.values()) {
                e.removeSubordinate(employee);
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeTreeMap.values()) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
            System.out.println("Manager: " + (employee.getManager() != null ? employee.getManager().getName() : "None"));
            System.out.println("Subordinates:");
            for (Employee subordinate : employee.getSubordinates().values()) {
                System.out.println("  - ID: " + subordinate.getId() + ", Name: " + subordinate.getName());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Agregar empleados
        manager.addEmployee(1, "John", 0);
        manager.addEmployee(2, "Alice", 1);
        manager.addEmployee(3, "Bob", 1);
        manager.addEmployee(4, "Carol", 2);
        manager.addEmployee(5, "David", 3);

        // Eliminar un empleado
        manager.deleteEmployee(4);

        // Mostrar la información de los empleados
        manager.displayEmployees();
    }
}

