public class LeapYear {
    public static void main (String []args)
    {
        int year = 1702;

        if (leapYear(year))
            System.out.println("Rok przestępny");
        else
            System.out.println("Rok nieprzestępny");

    }

    private static boolean leapYear (int year)
    {
        if (year % 4 == 0 && year % 100 == 0)
        {
            return year % 400 == 0;
        }
        else return year % 4 == 0 && year % 100 != 0;

    }
}
