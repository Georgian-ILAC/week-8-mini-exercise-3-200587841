public class Main {
    public static void main(String[] args) {
        //Step 5:
        //Testing the method display()
        System.out.println("--- Employee Information: ");
        Employee e = new Employee();
        e.display();

        //Testing the method getRaise()
        System.out.println("--- Method getRaise() ");
        double newHourlyPay = e.getRaise();
        System.out.println("New Hourly Pay: " + newHourlyPay);


        //Testing the method payDay()
        System.out.println("--- Method payDay() ");
        double hoursWorked = 45.0;

        double totalPay = e.payDay(hoursWorked);
        System.out.println("Total Pay: " + totalPay);

        //Testing Step 4
        System.out.println("--- Testing the Step 4 toString");
        System.out.println(e.toString());
    }
}