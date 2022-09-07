import java.util.Scanner;

public class hWork2 {
    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int sparesCount = scan.nextInt();

        seeStatusValues(fillIntArray(sparesCount));
    }

    static int[] fillIntArray (int sparesCount) {
        int[] sparesStatus = new int[sparesCount];
        for (int i = 0; i < sparesCount; i++) {
            sparesStatus[i] = scan.nextInt();
            if (!(sparesStatus[i] == -1 || sparesStatus[i] == 0 || sparesStatus[i] == 1)) {
                System.out.println("Error. Wrong status value. Try again.");
                i--;
            }
        }
        return sparesStatus;
    }

    static void seeStatusValues(int[] sparesStatus) {
        int allowableSpares = 0;
        int tooWideSpares = 0;
        int tooTightSpares = 0;
        for (int i: sparesStatus) {
            switch(i) {
                case 0:
                {
                    allowableSpares++;
                    break;
                }
                case 1:
                {
                    tooWideSpares++;
                    break;
                }
                default:
                    tooTightSpares++;
            }
        }
        System.out.printf("%d %d %d", allowableSpares, tooWideSpares, tooTightSpares);
    }
}
