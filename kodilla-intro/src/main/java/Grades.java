public class Grades {

    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value)
    {
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade()
    {
        return this.grades[this.size - 1];
    }

    public double averageGrade()
    {
        int sumOfRatings = 0;
        double average = 0;
        for (int i = 0; i < this.size; i++)
        {
            sumOfRatings += this.grades[i];
        }

        average = ((double)sumOfRatings / (double)this.size);

        return average;
    }
}
