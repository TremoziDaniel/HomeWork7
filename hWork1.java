import java.util.Scanner;

public class hWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        if (len < 0) {
            len *= -1;
            System.out.println("Число было меньше 0, поэтому мы убрали минус.");
        }
        String[] marks = new String[len];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.next();
            if(!marks[i].matches("[ABCD]{1}")) {
                System.out.println("Error! Not an allowable value. Try again.");
                i--;
            }
        }

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (String i: marks) {
            if (i.equals("A")) {
                countA++;
            }
            else if (i.equals("B")) {
                countB++;
            }
            else if (i.equals("C")) {
                countC++;
            }
            else {
                countD++;
            }
        }

        System.out.printf("%d %d %d %d", countA, countB, countC, countD);
    }
}

