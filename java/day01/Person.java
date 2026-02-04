public class Person {

    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {

    private int employeeId;

    private String jobTitle;

    Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeDetails() {
        return getLastName() + " - " + jobTitle;
    }
}

 class PersonDemo {
    public static void main(String[] args) {

        Employee emp = new Employee("Apurbo", "Debnath", 3008, "Developer");

        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Employee Info: " + emp.getEmployeeDetails());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
