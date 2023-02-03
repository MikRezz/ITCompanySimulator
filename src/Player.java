import java.util.ArrayList;
import java.util.List;

public class Player {
    private static double budget = 1000;
    private static List<String> employees;
    private List<String> availableProjects;
    private List<String> currentProjects;
    private List<String> clients;

    public static double getBudget() {
        return budget;
    }

    public static void setBudget(double budget) {
        Player.budget = budget;
    }

    public static List<String> getEmployees() {
        return employees;
    }

    public void Player(double budget) {
        this.budget = budget;
        this.employees = new ArrayList<>();
        //this.availableProjects = generateProjects();
        this.currentProjects = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
}
