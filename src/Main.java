public class Main {
    public static void main(String[] args) {

        int s = 1100;
        int p = 1001;

        int bonus;
        if (p >= 1001) {
            bonus = p / 100;
        } else {
            bonus = 0;
        }
        int b = s + p + bonus;

        System.out.println("Ваш счёт пополнен. Ваш баланс составляет " + b + " рублей");
        System.out.println("Вам начислено " + bonus + " рублей");
    }


}