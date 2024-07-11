public class Person {
    protected String firstName;
    protected String lastName;
    protected double height;

    public Person() {
        firstName = "Natalia";
        lastName = "Dias";
        height = 45.8;
    }

    public Person(String f, String l, double h) {
        firstName = f;
        lastName = l;
        height = h;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void display() {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Height: " + height);
    }

    //Step 4
    public String toString() {
        int feet = (int) height;
        int inches = (int) ((height - feet) * 12);
        return "Name: " + firstName + " " + lastName + "\n" +
                "They are " + feet + "’" + inches + "”\n";
    }
}