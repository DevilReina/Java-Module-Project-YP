public class Calculator {
    int members;
    double price;
    double totalPrice;


        double calculate (int members, double productPrice) {
            this.members = members;
            this.price = productPrice;
            totalPrice += price;
            System.out.println("Товар добавлен в общий счет");
            return  totalPrice;
        }



}
