public class variables {
    public static void main(String[] args) {
        System.out.println("Variables and data types");

        int age;
        age = 19;

        int our_age = 20;

        age = 20;
        System.out.println("My age:" + age + " is " + our_age);
        // byte - от -128 до 127 и занимает 1 байт
        // short - от -32768 до 32767 и занимает 2 байта
        // int - от -2147483648 до 2147483647 и занимает 4 байта
        // long - OT -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт

        float num = 4.98232f;
        double num2 = 5.982323232343;

        char ch = 'B';
        String user_name = "Baiysh";
        System.out.println("My name is: " + user_name);

        boolean isHappy = false; //true
    }
}
