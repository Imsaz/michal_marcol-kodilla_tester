public class Application {

    private String name;
    private double age;
    private double height;

    public String getName()
    {
        return this.name;
    }

    public double getAge()
    {
        return this.age;
    }

    public double getHeight()
    {
        return this.height;
    }
    public Application (String name, double age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public static void main(String[] args) {

        Application person1 = new Application("Adam", 40.5, 178);

        if (person1.getName() != null) {
            if (person1.getAge() > 30 && person1.getHeight() > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
