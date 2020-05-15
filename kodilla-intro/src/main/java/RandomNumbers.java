import java.util.Random;

public class RandomNumbers {
    public int lotteryMachine ()
    {
        Random random = new Random();
        return random.nextInt(31);
    }

    public int min (int min, int minNew)
    {
        if (minNew < min)
            min = minNew;
        return min;
    }

    public int max (int max, int maxNew)
    {
        if(maxNew > max)
            max = maxNew;
        return max;
    }

    public static void main (String[] args)
    {
        RandomNumbers random = new RandomNumbers();

        int min = 0;
        int max = 0;
        int sum = 0;

        while (sum <= 5000)
        {
            sum += random.lotteryMachine();
            min = random.min(min, random.lotteryMachine());
            max = random.max(max, random.lotteryMachine());
        }

        System.out.println(min + "\n" + max + "\n" + sum);
    }
}
