public class Main {
   public static void main(String[] args) {
      Input input = new Input();
      int getPersons = input.input();

      Calculator calculator = new Calculator();
      calculator.calculate();

      Output output = new Output();
      output.output(calculator.getListOfFood(), calculator.getTotalAmount(), getPersons);
   }
}