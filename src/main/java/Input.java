import java.util.Scanner;

public class Input {

    public int input() {
        System.out.println("На сколько человек разделить счёт?");
        Scanner scanner = new Scanner(System.in);

        int persons;

        while (true) {
            if (scanner.hasNextInt()) {
                persons = scanner.nextInt();
                if (persons < 1) {
                    System.out.println("А у вас руки жирные и крошки на брюках, всё же извольте ввести правельное кол-во гостей.");
                } else if (persons == 1) {
                    System.out.println("Вы так много накушали в одного... Возможно в другой раз стоит взять с собой друга, чтобы разделить счёт.");
                } else {
                    break;
                }
            } else {
                System.out.println("Введите числовое значение!");
                scanner.nextLine();
            }
        }
        return persons;
    }
}
