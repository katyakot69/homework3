public class Main {
    public static void main(String[] args) {
        int check = 1100;
        int payment = 1001;

        int bonus;
        if (payment >= 1001) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int balance = check + payment + bonus;

        System.out.println("Ваш счёт пополнен. Ваш баланс составляет " + balance + " рублей");
        System.out.println("Вам начислено " + bonus + " рублей");
    }
}