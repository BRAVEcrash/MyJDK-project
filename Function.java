public class Function {
    public static void main(String[] args) {

        //Методы в Java (ФУНКЦИИ)
//        info("Hello");
//        String java = "Java";
//        info(java);
//        info("");

        short num = 7;
        summa((short) 5, num);
        short num2 = 8;
        summa((short) 4, num2);
        }
    public static void summa (short a, short b) {
        int res = a + b;
//        System.out.println("Результат: " + res);
        String result = "Результат: " + res;
        info(result);

    }

    public static void info(String word){
        System.out.println(word);
        System.out.print("!");
    }
}
