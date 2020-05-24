import java.util.Scanner;

public class UserDialogs {

    public static String getUsername()
    {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2)
            {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A - add, S - subtract, D - divide, M - multiply:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch(calc) {
                case "A" : return "ADD";
                case "B" : return "SUB";
                case "C" : return "DIV";
                case "D" : return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValuer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        return scanner.nextInt();
    }
}
