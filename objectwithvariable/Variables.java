package objectwithvariable;

public class Variables {



        int staff;
        double hours;

        String name = "Barnet";
        String department = "ImergencyWard";


        public static void main(String[] args) {

            Variables obj1 = new Variables();
            obj1.staff = 12;
            obj1.hours = 22.5;


            System.out.println("no of staff = " + obj1.staff);
            System.out.println("no of hours = " + obj1.hours);
            System.out.println("Name of the Hospital = " + obj1.name);
            System.out.println("no of Department = " + obj1.department);


        }
    }
