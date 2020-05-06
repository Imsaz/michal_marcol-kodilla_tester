public class Loops
{
    public static void main (String[] args)
    {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;
        
        for (int i = array.length - 1; i >= 0; i--)
        {
          suma += array[i];
        }

        System.out.println(suma);
    }
}
