class car {
    String color;
    int speed;

    void Drive() {
        System.out.println("Car is driving");
    }
}

class basic {
    public static void main(String[] args){
        car obj = new car();

        obj.Drive();
    }
}


// When JVM loads this class:

// Class metadata → stored in Method Area

// Static variables → stored in Method Area

// Methods → stored in Method Area

// 🔹 Object

// An object is an instance created in Heap Memory.

// Car c1 = new Car();


// Memory breakdown:

// c1 → stored in Stack (reference)

// Actual object → stored in Heap

// Object variables → stored inside Heap object