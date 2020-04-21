package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employees[] empList = new Employees[5];
        empList[0] = new Employees("C.J. Caesar","Imperator","caesar@palatin.gov","(CXLIII)XVI II IX",1000000,50);
        empList[1] = new Employees("Petrov S.N","Designer","petrov@x-design.com","(999)567 89 32",80000,34);
        empList[2] = new Employees("Einstain A.","Phisicist","genius@laboratory.secret","(---)--- -- --",0,58);
        empList[3] = new Employees("A.I. Bolit","Veterinar","doctor@bolnitsa.ru","03",35000,60);
        empList[4] = new Employees("Kolesov N.P.","Director","boss@chief.org","(666)666 01 31",1000000,39);

        for(Employees employee: empList){
            if (employee.getAge() > 40)
                employee.info();
        }
    }
}
