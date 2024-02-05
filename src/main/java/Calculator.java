import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private float totalAmount = 0;
    private final ArrayList<String> listOfFood = new ArrayList<>();

    public float getTotalAmount() {
        return totalAmount;
    }

    public ArrayList<String> getListOfFood() {
        return listOfFood;
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        String nameOfFood;
        String close = "";
        RubEnding rubEnding = new RubEnding();

        while (!close.equalsIgnoreCase("Завершить")) {
            System.out.println("Укажите название блюда");
            nameOfFood = scanner.nextLine();

            System.out.println("Блюдо добавлено!");
            listOfFood.add(nameOfFood);

            System.out.println("Укажите стоимость в рублях (Например: 100,50)");
            float price = 0f;

            while (price <= 0f) {
                while (!scanner.hasNextFloat()) {
                    scanner.nextLine();
                    System.out.println("Введён не верный формат стоимости, пожалуйста введите повторно! (Например: 100,50)");
                }

                price = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Введена отрицательная стоимость, пожалуйста введите повторно! (Например: 100,50)");
            }

            System.out.println("Цена добавлена!");
            totalAmount = totalAmount + price;
            String end = rubEnding.generateEnding(totalAmount);

            printListOfFood(listOfFood);
            String messageTemplate = "\nОБЩАЯ СУММА\n%.2f%s";
            System.out.printf((messageTemplate) + "%n", totalAmount, end);
            System.out.println("Не желаете ли добавить ещё блюдо? Введите название блюда. \nДля завершения операции введите слово \"Завершить\"");

            close = scanner.nextLine();
        }
    }

    public void printListOfFood(ArrayList<String> listOfFood) {
        System.out.println("\nДобавленные товары:");
        for (String item : listOfFood) {
            System.out.println(item);
        }
    }
}
