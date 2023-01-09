package javaOOP2.композиция;

public class Person {
    //используем отношение has-a
    private final Job job;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

}
