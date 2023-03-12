public class Formatter {
        String numFormat (double num) {
            double lastNumber = num % 100;
            int ruble =(int) Math.floor(lastNumber);
            switch (ruble) {
                case 1:
                    return "рубль";
                case 2:
                case 3:
                case 4:
                    return "рубля";
                default:
                    return "рублей";
            }
        }


}
