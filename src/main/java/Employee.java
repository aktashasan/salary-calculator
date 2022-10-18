import java.util.Scanner;

public class Employee {

    String name;
    Double salary;
    Double workHours;
    Integer hireYear;

    Employee(String name, Double salary, Double workHours, Integer hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Double tax(Double salary) {
        Double tax = 0.0;
        if (salary > 1000) {
            tax = (salary * 3 / 100);
        }
        return tax;
    }

    public Double bonus(Double workHours) {

        Double diff = 0.0;
        Double bonus = 0.0;
        if (workHours > 40) {
            diff = workHours - 40;
            bonus = diff * 30;
        }
        return bonus;
    }

    public Double raiseSalary(Integer hireYear) {
        Integer diff = 0;
        Double raise = 0.0;
        diff = 2021 - hireYear;
        if (diff < 10) {
            raise = (salary * 5) / 100;
        } else if (diff > 9 && diff < 20) {
            raise = (salary * 10) / 100;
        } else if (diff > 19) {
            raise = (salary * 15) / 100;
        }
        return raise;

    }

    public String toString() {
        Double lastTotal = 0.0;
        Double total = 0.0;
        lastTotal = (salary - tax(salary)) + bonus(workHours);
        total = lastTotal + raiseSalary(hireYear);

        String sName = "Adı: " + this.name + "\n";
        String sSalary = "Maaşı : " + this.salary + "\n";
        String sWorkHour = "Çalışma Saati : " + this.workHours + "\n";
        String sHireYear = "Başlangıç Yılı : " + this.hireYear + "\n";
        String sTax = "Vergi : " + tax(this.salary) + "\n";
        String sBonus = "Bonus : " + bonus(this.workHours) + "\n";
        String sRaiseSalary = "Maaş Artışı : " + raiseSalary(hireYear) + "\n";
        String sLastTotal = "Vergi ve Bonuslar ile birlikte maaş : " + lastTotal + "\n";
        String sTotal = "Toplam Maaş :" + total + "\n";

        return sName + sSalary + sWorkHour + sHireYear + sTax + sBonus + sRaiseSalary + sLastTotal + sTotal;


    }


}
