public class Formatter {
        String numFormat (double num) {
            double lastNumber = (int) Math.floor(num);
            int ruble =(int) Math.floor(lastNumber);
            if (lastNumber % 100 >= 11 && lastNumber % 100 <= 14)  {
                return " рублей";
            }
            switch (ruble % 10) {
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
