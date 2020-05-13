import java.awt.*;

public class FirstClass {

    public static void main(String[] args)
    {
        Notebook notebook = new Notebook("600g",100, 2015);
        System.out.println(notebook.weight + "\n" + notebook.price + "\n" + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        System.out.println("\n" + "\n");

        Notebook heavyNotebook = new Notebook("2000g",2000, 2014);
        System.out.println(heavyNotebook.weight + "\n" + heavyNotebook.price + "\n" + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        System.out.println("\n" + "\n");

        Notebook oldNotebook = new Notebook("1500g",2000, 2020);
        System.out.println(oldNotebook.weight + "\n" + oldNotebook.price + "\n" + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

    }
}
