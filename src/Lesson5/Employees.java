package Lesson5;

public class Employees {
    private String fullName;
    private  String position;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employees(String fullName, String position, String email, String phoneNumber, float salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("%s, %s, %s, %s, '%5.2f', %d\n",fullName,position,email,phoneNumber,salary,age);
    }
}
