//Step 1.a
public class Employee extends Person {
    //Step 1.c
    private int id;
    private double hourlyPay;
    private double newHourlyPay;

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
        id = 10050;
        hourlyPay = 20;
    }

    public Employee(int i, double hp) {
        id = i;
        hourlyPay = hp;
    }

    //Step 2.a
    public double getRaise() {
        newHourlyPay = hourlyPay * 1.15;
        return newHourlyPay;
    }

    //Step 3.a
    public double payDay(double hoursWorked) {
        double totalPay = 0;

        if (hoursWorked > 40) {
            double extraHours = hoursWorked - 40;
            totalPay = (40 * hourlyPay) + (extraHours * newHourlyPay);
        } else {
            totalPay = hoursWorked * hourlyPay;
        }

        return totalPay;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ID: " + id);
        System.out.println("Hourly Payment: " + hourlyPay);
    }

    //Step 4
    @Override
    public String toString() {
        String person = super.toString();
        return person +
                "They make $" + hourlyPay + "\n" +
                "They have the employee ID " + id + "\n";
    }
}
