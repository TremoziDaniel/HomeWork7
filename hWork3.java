import java.text.DecimalFormat;
import java.util.Scanner;

public class hWork3 {
    static final Scanner scan = new Scanner(System.in);
    static final DecimalFormat decFor = new DecimalFormat("######.##");
    public static void main(String[] args) {
        System.out.print("Пожалуйста введите срок вклада в месяцах: ");
        int monthAmount = Integer.parseInt(scan.nextLine());
        System.out.print("Пожалуйста введите сумму вклада: ");
        Double moneyAmount = scan.nextDouble();

        percentCalculation(monthAmount, moneyAmount);
    }

    static void percentCalculation(int monthAmount, Double moneyAmount) {
        String decVariable;
        Double calcVariable;
        for (int i = 0; i < monthAmount; i++) {
            calcVariable = moneyAmount + moneyAmount * 0.01;
            decVariable = decFor.format(calcVariable);
            moneyAmount = Double.parseDouble(decVariable.replace(",", ".")); //как я понял что то с
            // моими настройками пк, по этому ставит не американскую точку.
        }
        System.out.println(moneyAmount);
    }
}
