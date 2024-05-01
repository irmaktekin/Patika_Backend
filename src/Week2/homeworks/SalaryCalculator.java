package Week2.homeworks;

public class SalaryCalculator {
    String name;
    double salary;
    int workHours;
    int hireYear;
    static final int CURRENT_YEAR = 2021;

    public SalaryCalculator(String name, double salary, int workHours, int year){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=year;
    }

    double tax(){
        double tax=0;
        if(salary>=1000){
            tax=salary*0.03;

        }
        return tax;
    }

    double bonus(){
        double bonus = (workHours-40)*30;
        return bonus;
    }
    double calculateSalaryIncrease(){
        int yearDifference=CURRENT_YEAR-hireYear;
        double newSalary;
        if(yearDifference<10){
            newSalary=salary*0.05;
            return newSalary;
        }
        else if(9<yearDifference && yearDifference<20){
            newSalary=salary*0.10;
            return newSalary;
        }
        else{
            newSalary=salary*0.15;
            return newSalary;
        }
    }

    @Override
    public String toString() {
        //local variables are created for some calculations
        double calculatedTax = tax();
        double calculatedBonus = bonus();
        double calculatedSalaryIncrease = calculateSalaryIncrease();
        double totalSalary = salary + calculatedBonus + calculatedSalaryIncrease - calculatedTax;

        return String.format("Name: %s\nSalary is: %.1f\nWorkhours: %d\nYear: %d\nTax: %.1f\nBonus: %.1f\nSalary Increase: %.1f\nSalary with tax and bonus: %.1f\nTotal Salary: %.1f",
                name, salary, workHours, hireYear, calculatedTax, calculatedBonus, calculatedSalaryIncrease, (salary - calculatedTax+ calculatedBonus), totalSalary);
    }


    public static void main(String[] args) {
        SalaryCalculator emp1 = new SalaryCalculator("Irmak",3000,42,1990);
        //It calls the tostring method and print the values.
        System.out.println(emp1);

    }
}