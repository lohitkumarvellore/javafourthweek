public class accessemployeeclass {
    public static void main(String[] args) {
       EMPLOYEECLASS[] arr;
       arr = new EMPLOYEECLASS[5];
       arr[0] = new EMPLOYEECLASS("shiva", 1);
       arr[1] = new EMPLOYEECLASS("shiva", 2);
       arr[2] = new EMPLOYEECLASS("shiva", 3);
       arr[3] = new EMPLOYEECLASS("shiva", 4);
       arr[4] = new EMPLOYEECLASS("shiva", 5);

        System.out.println("employee 1 details are:");
        arr[0].display();
        System.out.println("employee 2 details are:");
        arr[1].display();
        System.out.println("employee 3 details are:");
        arr[2].display();
        System.out.println("employee 4 details are:");
        arr[3].display();
        System.out.println("employee 5 details are:");
        arr[4].display();
    }
}
