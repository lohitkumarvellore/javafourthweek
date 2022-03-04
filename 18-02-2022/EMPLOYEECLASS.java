public class EMPLOYEECLASS {
    String name;
    int emp_id;

    EMPLOYEECLASS(String name, int emp_id)
    {
        this.name = name;
        this.emp_id = emp_id;
    }

    public void display()
    {
        System.out.println("emp name is: " + name + " "
                + "and emp_id is: "
                + emp_id);
        System.out.println();
    }
}
