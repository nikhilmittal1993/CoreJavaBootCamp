public class ControlFlow {

    public static void main(String[] args) {

        Boolean isCar = Boolean.TRUE;

        if (isCar) {
            System.out.println("I am a Car");
        }

        isCar = Boolean.FALSE;
        if (isCar) {
            System.out.println("I am a Car");
        } else {
            System.out.println("I am not a Truck");
        }

        String vehicle = "Car";

        if (vehicle.equals("Car")) {
            System.out.println("I am a Car");

        } else if (vehicle.equals("Truck")) {
            System.out.println("I am a Truck");

        } else {
            System.out.println("I am a Bike");
        }

    }
}

class SwitchDemo {
    public static void main(String[] args) {
        int age = 2;
        String yourAge;
        switch (age) {
            case 1:
                System.out.println("You are one yr old");
                break;
            case 2:
                System.out.println("You are two yr old");
                break;
            case 3:
                System.out.println("You are three yr old");
                break;
            default:
                System.out.println("You are more than three yr old");
                break;
        }
    }
}


class SwitchDemo1 {
    public static void main(String[] args) {
        int age = 2;
        String yourAge;
        switch (age) {
            case 1:
            case 2:
            case 3:
                System.out.println("You are three or less than three yr old");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("You are six or less than six yr old");
                break;
            default:
                System.out.println("You are more than six yr old");
                break;
        }
    }
}

class Loop {

    public static void main(String[] args) {
        int counter = 0;

        // while Example
        while (counter < 5) {
            System.out.println("Inside the while loop, counting: " + counter);
            counter++;
        }

// Do while example
        do {
            System.out.println("Inside the do while while loop, counting: " + counter);
            counter--;
        } while (counter > 0);

//        For Loop Example
//        for (initialization; termination condition; increment/decrement) {
//            //java statement(s)
//        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing using for loop. Count is: " + i);
        }

        String[] people = {"Madhav", "Shikha", "Anmol"};
        for (String person : people) {
            System.out.println("Hi, I am " + person);
        }

//        Break Example

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the for loop.");
                break;
            }
            System.out.println("Printing using for loop. Count is: " + i);
        }

//        Continue Example

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                continue;
            }
            System.out.println(nums[i] + " is even");
        }

    }
}

class Label {

    public static void main(String[] args) {
//        Label Example
        outer:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 10; j++) {
                if (i + j >= 10) {
                    System.out.println(i + j);
                    break outer;
                } else {
                    System.out.println( i+j + "-->>");
                    continue inner;
                }
            }
        }
    }
}
