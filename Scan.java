import java.util.Scanner;
public class Scan {

    public static void main(String[] args) {
        Scanner some_name = new Scanner(System.in); // Создаем объект с именем some_name
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, "+ username);

//        nextLine () - для ввода строки. Возвращаемый тип данных String;
//        nextInt () - для ввода целых чисел. Возвращаемый тип данных int;
//        nextFloat () - для ввода чисел с плавающей точкой. Возвращаемый тип данных float;
//        nextDouble () - для ввода больших чисел с плавающей точкой. Возвращаемый тип double.
        }
    }

}
