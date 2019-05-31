package pitney;

class Vehicle{
     //private void run(){System.out.println("Vehicle is running");}
}

class Bike extends Vehicle {
    protected void run(){System.out.println("Bike is running");
    }
    public static void main(String args[]){
        Bike obj = new Bike();
        Vehicle obj1 = new Bike();
        //obj.run();
     //   obj1.run();
    }
}
