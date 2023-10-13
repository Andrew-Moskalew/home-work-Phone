public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.model = "iPhone14";
        phone1.number = "+375295555555";
        phone1.weight = 120;

        Phone phone2 = new Phone();
        phone2.model = "SamsungGalaxyS20";
        phone2.number = "+375293577777";
        phone2.weight = 145;

        Phone phone3 = new Phone();
        phone3.model = "XiaomiMi9";
        phone3.number = "+375296458888";
        phone3.weight = 115;

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        Phone.receiveCall("Петя");
        Phone.receiveCall2("Вася","+375298888888");

        System.out.println(phone1.getNumber());

        Phone phone4 = new Phone("+375298888888","SiemensA50",90);
        System.out.println(phone4);
        Phone phone5 = new Phone("+375292222222","Nokia3310");
        System.out.println(phone5);
    }
}
