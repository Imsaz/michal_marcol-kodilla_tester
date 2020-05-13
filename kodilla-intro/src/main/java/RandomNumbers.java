import java.util.Random;

public class RandomNumbers {

    public static int lotteryMachine ()
    {
        Random random = new Random();
        int result = random.nextInt(31);
        return result;
    }

    public static int min (int min, int minNew)
    {
        if (minNew < min)
            min = minNew;
        return min;
    }

    public static int max (int max, int maxNew)
    {
        if(maxNew > max)
            max = maxNew;
        return max;
    }

    public static void main (String[] args)
    {
        int min = 0;
        int max = 0;
        int sum = 0;

        while (sum <= 5000)
        {
            sum += lotteryMachine();
            min = min(min, lotteryMachine());
            max = max(max, lotteryMachine());
        }

        System.out.println(min + "\n" + max + "\n" + sum);
    }
}
