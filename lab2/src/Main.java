import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість абонентів: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Phone[] phones = new Phone[n];

        // Введення даних про кожного абонента
        for (int i = 0; i < n; i++) {
            System.out.println("Введіть дані для абонента " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // очищення буферу

            System.out.print("Прізвище: ");
            String lastName = scanner.nextLine();

            System.out.print("Ім'я: ");
            String firstName = scanner.nextLine();

            System.out.print("По батькові: ");
            String middleName = scanner.nextLine();

            System.out.print("Номер рахунку: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Час міських розмов (хв): ");
            int localCallTime = scanner.nextInt();

            System.out.print("Час міжміських розмов (хв): ");
            int longDistanceCallTime = scanner.nextInt();
            scanner.nextLine();

            phones[i] = new Phone(id, lastName, firstName, middleName, accountNumber, localCallTime, longDistanceCallTime);
        }


        System.out.println("\nВведені дані про абонентів:");
        printAllPhones(phones);


        System.out.print("Введіть мінімальний час міських розмов: ");
        int minLocalCallTime = scanner.nextInt();
        printLocalCallTimeExceeds(phones, minLocalCallTime);

        printUsersWithLongDistanceCalls(phones);

        System.out.print("Введіть мінімальний номер рахунку: ");
        int minAccount = scanner.nextInt();
        System.out.print("Введіть максимальний номер рахунку: ");
        int maxAccount = scanner.nextInt();
        printUsersInAccountRange(phones, minAccount, maxAccount);
    }

    // Виведення даних усіх абонентів
    public static void printAllPhones(Phone[] phones) {
        for (int i = 0; i < phones.length; i++) {
            System.out.println("Абонент " + (i + 1) + ":");
            System.out.println(phones[i]);
        }
    }

    // Виведення абонентів, у котрих час міських розмов перевищує заданий час
    public static void printLocalCallTimeExceeds(Phone[] phones, int minTime) {
        System.out.println("АБОНЕНТИ З ЧАСОМ МІСЬКИХ РОЗМОВ БІЛЬШЕ " + minTime + ":\n");
        boolean found = false;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getLocalCallTime() > minTime) {
                System.out.println("Абонент " + (i + 1) + ":");
                System.out.println(phones[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Немає таких абонентів" );
        }
    }

    // Виведення абонентів, які користувалися міжміським зв'язком
    public static void printUsersWithLongDistanceCalls(Phone[] phones) {
        System.out.println("АБОНЕНТИ, ЯКІ КОРИСТУВАЛИСЯ МІЖМІСЬКИМ ЗВ'ЯЗКОМ:\n");
        boolean found = false;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getLongDistanceCallTime() > 0) {
                System.out.println("Абонент " + (i + 1) + ":");
                System.out.println(phones[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Немає абонентів, які користувались міжміським зв'язком.");
        }
    }

    // Виведення абонентів, у яких номер рахунку попадає в заданий діапазон
    public static void printUsersInAccountRange(Phone[] phones, int minAccount, int maxAccount) {
        System.out.println("\nАБОНЕНТИ З НОМЕРОМ РАХУНКУ У ДІАПАЗОНІ ВІД " + minAccount + " ДО " + maxAccount + ":");
        boolean found = false;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getAccountNumber() >= minAccount && phones[i].getAccountNumber() <= maxAccount) {
                System.out.println("Абонент " + (i + 1) + ":");
                System.out.println(phones[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Немає таких абонентів");
        }
    }
}
