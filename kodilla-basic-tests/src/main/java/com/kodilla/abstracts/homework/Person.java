package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private Job job;
    private int age;

    public Person ( String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public Job getJob(){
        return job;
    }

    public void getResponsibilities (Job job)
    {
        System.out.println("Resoponsibilities: " + job.getResponsibilities());
    }

    public static void main(String[] args) {
        Job teacher = new Teacher();
        Fitter fitter = new Fitter();

        Person person = new Person("Adam", 50, teacher);
        Person person1 = new Person("Kamil", 35, fitter);

        person.getResponsibilities(person.getJob());
        person1.getResponsibilities(person1.getJob());
    }

}
