import java.util.ArrayList;

public class Output {

    public void output(ArrayList<String> listOfFood, float totalAmount, int persons) {
        Calculator calculator = new Calculator();
        RubEnding rubEnding = new RubEnding();

        float score = totalAmount / persons;

        String end = rubEnding.generateEnding(score);
        String end2 = rubEnding.generateEnding(totalAmount);

        calculator.printListOfFood(listOfFood);

        String messageTemplate = "\nОБЩАЯ СУММА\n%.2f%s";
        System.out.printf((messageTemplate) + "%n", totalAmount, end2);

        String messageTemplate2 = "Каждый человек должен заплатить %.2f%s";
        System.out.printf((messageTemplate2) + "%n", score, end);
    }
}
