public class Main {
    public static void main(String[] args) {

        int account = 1000;
        int refill = 1500;


        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;

        } else {
            bonus = 0;
        }
        int sum = account + refill + bonus;

        System.out.println("Итоговый счет: " + sum);
        System.out.println("Сумма начисленного бонуса: " + bonus);


    }
}
