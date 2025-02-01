import java.util.ArrayList;
import java.util.List;

public class ObservableEmployeeList {
    private List<Employee> employees = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // Add observer to the list
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Add employee and notify observers
    public void addEmployee(Employee employee) {
        employees.add(employee);
        notifyObservers("New employee added: " + employee.getName());
    }

    // Notify all observers
    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
