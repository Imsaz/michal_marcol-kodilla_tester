public class Notebook {

    String weight;//TODO Review pls use int here
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This device is light");
        } else if (this.weight == "1500g") {
            System.out.println("This device is not too heavy");
        } else {
            System.out.println("This device is very heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.year >= 2015 && this.price < 1500) {
            System.out.println("This notebook is a good choice");
        } else if (this.year <= 2015 && this.price < 1500) {
            System.out.println("This notebook has a good price, but it is little old");
        } else if (this.year >= 2015 && this.price > 1500) {
            System.out.println("This notebook is not a good choice");
        } else {
            System.out.println("This notebook is a misunderstanding");
        }
    }

}
