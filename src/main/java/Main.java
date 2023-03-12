import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        int members = 0;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Пожалуйства введите количество человек");
        while (members <= 1) {
            if (scanner.hasNextInt()) {
                members = scanner.nextInt();
                if (members <= 1) {
                    System.out.println("Количетсво введенных пользователей меньше или равно 1, пожалуйства попробуйте снова");
                }
            } else {
                System.out.println("Нужно ввести число!");
                scanner.next();

            }
        }  //конец цикла подсчета участников
            Product product = new Product(); //объект продукт
            Calculator calculator = new Calculator();

        while (true) { //начало подсчета товара
            System.out.println("Введите название товара");
            product.name = scanner.next();


            if (product.name.equalsIgnoreCase("Завершить")) {
                break;
            }

            System.out.println("Введите цену товара");
            while (!scanner.hasNextDouble()) {
                System.out.println("Неккоректный ввод, попробуйте снова");
                scanner.next();
            }
            product.price = scanner.nextDouble();

            while (product.price <= 0) {
                System.out.println("Пожалуйства введите цену больше 0");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Неккоректный ввод, попробуйте снова");
                    scanner.next();
                }
                product.price = scanner.nextDouble();

            }


                    product.priceList = calculator.calculate(members, product.price);
                    product.nameList = product.productList(product.name);
                    System.out.println("Вы хотите добавить новый товар?, либо введите Завершить");

        } //конец подсчета

        Formatter formatter = new Formatter();
        //объект формата строки
        System.out.println("Ваш товар: " + " \n" + product.nameList);

        System.out.println("На сумму: " + String.format("%.2f", product.priceList) + " " + formatter.numFormat(product.priceList));

        System.out.println("Каждый должен заплатить: " + String.format("%.2f", (product.priceList/members)) + " " + formatter.numFormat(product.priceList/members));
    }
}
