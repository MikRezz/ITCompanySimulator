import java.util.Scanner;

public class Main {

    public static void main (String args[]) {

        System.out.println("-------------------------------");
        System.out.println("Twoja kasa : " + Player.getBudget()   );
        System.out.println("-------------------------------");
        System.out.println("Co chcesz zrobić? ");
        System.out.println("1. Zobacz dostępne projekty");
        System.out.println("2. Zatrudnij pracownika");
        System.out.println("3. Rozpocznij nowy projekt");
        System.out.println("4. Zakończ projekt");
        System.out.println("5. Zobacz stan konta");
        System.out.println("6. Zobacz aktualne projekty");
        System.out.println("7. Zobacz pracowników");
        System.out.println("8. Zobacz klientów");
        System.out.println("9. Zakoncz");
        System.out.println("-------------------------------");

        boolean startLoop = true;
        while (startLoop) {
            int choice;
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Wybrano opcję 1: Zobacz dostępne projekty");
                    showAvailableProjects();
                    break;
                case 2:
                    System.out.println("Wybrano opcję 2: Zatrudnij pracownika");
                    hireEmployee();
                    break;
                case 3:
                    System.out.println("Wybrano opcję 3: Rozpocznij nowy projekt");
                    startNewProject();
                    break;
                case 4:
                    System.out.println("Wybrano opcję 4: Zakończ projekt");
                    finishProject();
                    break;
                case 5:
                    System.out.println("Wybrano opcję 5: Zobacz stan konta");
                    showBudget();
                    break;
                case 6:
                    System.out.println("Wybrano opcję 6: Zobacz aktualne projekty");
                    showCurrentProjects();
                    break;
                case 7:
                    System.out.println("Wybrano opcję 7: Zobacz pracowników");
                    showEmployees();
                    break;
                case 8:
                    System.out.println("Wybrano opcję 8: Zobacz klientów");
                    showClients();
                    break;
                case 9:
                    startLoop = false;
                    return;
                default:
                    System.out.println("Niepoprawny wybór");
                    break;
            }
        }
    }

        private static void showAvailableProjects () {
            // Implementacja
        }

    private static void hireEmployee () {
        boolean startLoop2 = true;
        while (startLoop2) {
            Scanner scanner2 = new Scanner(System.in);
            int choice2 = scanner2.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("1. Wojtek Student | Koszt 300$");
                    Workers worker1 = new Workers("Wojtek", 1, 300, false);
                    if (Player.getBudget() < 300) {
                        System.out.println("Nie masz tyle kasy !");
                        break;
                    } else {
                        System.out.println("Zakupiono pracownika ! ");
                        Player.setBudget(Player.getBudget()-300);
                        worker1.setHired(true);
                        break;

                    }

                case 2:
                    Workers worker2 = new Workers("Maciej", 2, 500, false);
                    System.out.println("1. Wojtek Student | Koszt 300$");

                    if (Player.getBudget() < 500) {
                        System.out.println("Nie masz tyle kasy !");
                        break;
                    } else {
                        System.out.println("Zakupiono pracownika ! ");
                        Player.setBudget(Player.getBudget()-500);
                        worker2.setHired(true);
                        break;

                    }
                case 3:
                    System.out.println("1. Wojtek Student | Koszt 300$");
                    Workers worker3 = new Workers("Brajan", 3, 1000, false);
                    if (Player.getBudget() < 500) {
                        System.out.println("Nie masz tyle kasy !");
                        break;
                    } else {
                        System.out.println("Zakupiono pracownika ! ");
                        Player.setBudget(Player.getBudget()-500);
                        worker3.setHired(true);
                        break;

                    }
            }
        }
    }
    private static void startNewProject () {
            // Implementacja
        }
    private static void finishProject () {
            // Implementacja
        }

    private static void showBudget () {
        System.out.println("Masz " + Player.getBudget()+ " zł");
        }

    private static void showCurrentProjects () {
            // Implementacja
        }
    private static void showEmployees () {
        System.out.println("Nie masz pracowników");
        }
    private static void showClients () {
            // Implementacja
        }

        //Losowanie typu
        int random = new Random().Rand();

    //===============Pracownicy===================================




    }
