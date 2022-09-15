//Defining Employee class

public class employee {

    //Defining the attributes of the class
    int eId;
    String eName;
    int eSalary;
    int eAge;

    //Defining the Default constructor of the class
    public employee(){
        eId = 0;
        eName = "";
        eSalary = 0;
        eAge = 0;
    }

    //Defining the Parameterized constructor of the class
    public employee(int eId, String eName, int eSalary, int eAge) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
        this.eAge = eAge;
    }

    //Defining the getter and setter methods of the class
    public void getData(){
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Employee ID : " + this.eId);
        System.out.println("Employee Name : " + this.eName);
        System.out.println("Employee Salary : " + this.eSalary);
        System.out.println("Employee Age : " + this.eAge);
        System.out.println("------------------------------------------------------------------------------------");
    }

    public void setData(int eId, String eName, int eSalary, int eAge){
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
        this.eAge = eAge;
    }

    //Defining the main function
    public static void main(String[] args){
//
//        employee e1 = new employee(1, "Lokesh", 10000, 20);
//        employee e2 = new employee(2, "Shreyansh", 20000, 21);
//        employee e3 = new employee(3, "Piyush", 30000, 22);
//        employee e4 = new employee(4, "Rajendra", 40000, 23);
//        employee e5 = new employee(5, "Vikram", 50000, 24);
//

        employee e1 = new employee();
        employee e2 = new employee();
        employee e3 = new employee();
        employee e4 = new employee();
        employee e5 = new employee();

        e1.setData(1, "Lokesh", 10000, 20);
        e2.setData(2, "Shreyansh", 20000, 21);
        e3.setData(3, "Piyush", 30000, 22);
        e4.setData(4, "Rajendra", 40000, 23);
        e5.setData(5, "Vikram", 50000, 24);


        e1.getData();
        e2.getData();
        e3.getData();
        e4.getData();
        e5.getData();

    }
}
