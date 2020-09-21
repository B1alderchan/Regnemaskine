import java.sql.SQLOutput;

public class Regnemaskine {
    public static void main(String[] args) {


        System.out.println("Indsæt to tal");
        java.util.Scanner input = new java.util.Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Vælg 1: for Addition ; Vælg 2: Multiplikation ; Vælg 3: Subtraction ; Vælg 4: Division");
        int choose;


        choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Resultat:");
                System.out.println(a + b);
                break;

            case 2:
                System.out.println("Resultat:");
                System.out.println(a * b);
                break;
            case 3:
                System.out.println("Resultat:");
                System.out.println(a - b);
                break;
            case 4:

                if ((a == 0) | (b == 0)) {
                    System.out.println("Syntax Error - Cannot divede by 0");
                } else {
                    System.out.println("Du får dette Resultat: ");
                    System.out.println(a / b);
                }

                break;



        }


        input.close();

    }
}
