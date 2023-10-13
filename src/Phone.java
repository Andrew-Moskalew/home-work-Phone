public class Phone {
    public String number;
    public String model;
    public int weight;

    public static void receiveCall(String Name) {
        System.out.println("Звонит: " + Name);
    }

    public static void receiveCall2(String Name, String number) {
        System.out.println("Звонит: " + Name + " его номер телефона " + number);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
