//Step 1.a
public class Employee extends Person {
    //Step 1.c
    private int id;
    private double hourlyPay;

    //Step 1.d
    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Step 1.b
    public Employee() {
        super();
        this.id = 0;
        this.hourlyPay = 20;
    }

    //Step 2.a
    public double getRaise() {
        hourlyPay *= 1.15;
        return hourlyPay;
    }

    //Step 3.a
    public double payDay(double hoursWorked) {
        double totalPay = 0;

        if (hoursWorked > 40) {
            double extraHours = hoursWorked - 40;
            totalPay = (40 * hourlyPay) + (extraHours * hourlyPay * 1.15);
        } else {
            totalPay = hoursWorked * hourlyPay;
        }

        return totalPay;
    }
}
