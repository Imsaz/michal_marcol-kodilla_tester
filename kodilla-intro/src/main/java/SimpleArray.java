public class SimpleArray
{
    public static void main (String[] args)
    {
        String variable;
        int numberOfElements;

        String[] array = new String[] {"jeden","dwa","trzy","cztery","pięć"};

        variable = array[3];
        numberOfElements = array.length;
        System.out.println(variable + "\nTablica ma długość: " + numberOfElements);
    }
}
