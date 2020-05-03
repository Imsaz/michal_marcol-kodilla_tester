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
            if (year % 400 == 0)
                return true;
        }
        else if (year % 4 == 0 && year % 100 != 0)
        {return true;}

        return false;

    }
}
