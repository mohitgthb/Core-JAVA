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