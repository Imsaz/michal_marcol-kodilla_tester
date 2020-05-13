public class User {

    private String name;
    private int age;

    public User (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public static double average (User[] user) {
        int i = 0;
        int sumOfAge = 0;

        while (i < user.length) {
            sumOfAge += user[i].age;
            i++;
        }

        return (double) (sumOfAge / user.length);
    }

    public static void main (String[] args)
    {
        User[] user = new User[5];

        user[0] = new User("Toamsz", 25);
        user[1] = new User("Karol", 30);
        user[2] = new User("Katarzyna", 27);
        user[3] = new User("Aleksandra", 56);
        user[4] = new User("Barbara", 72);

        for (int i = 0; i < user.length; i++)
        {
            if ((double)(user[i].age) < average(user))
            {
                System.out.println(user[i].name);
            }

        }
    }
}
