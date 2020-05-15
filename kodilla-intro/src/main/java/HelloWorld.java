public class HelloWorld {

    public static void main (String []args)
    {
        Grades first = new Grades();

        first.add(5);
        first.add(5);
        first.add(5);
        first.add(5);
        first.add(5);
        first.add(1);
        first.add(1);
        first.add(1);
        first.add(1);
        first.add(1);
        first.add(1);
        first.add(1);


        System.out.println("\n" + "\n");

        System.out.println(first.lastGrade());
        System.out.println(first.averageGrade());
    }
}
