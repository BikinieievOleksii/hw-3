package ua.goit.module3;

public class ATM {
    public int countBanknotes(int sum) {
        int banknotes = 0;

        while (sum >= 500) {
            sum -= 500;
            banknotes++;
        }
        while (sum >= 200) {
            sum -= 200;
            banknotes++;
        }
        while (sum >= 100) {
            sum -= 100;
            banknotes++;
        }
        while (sum >= 50) {
            sum -= 50;
            banknotes++;
        }
        while (sum >= 20) {
            sum -= 20;
            banknotes++;
        }
        while (sum >= 10) {
            sum -= 10;
            banknotes++;
        }
        while (sum >= 5) {
            sum -= 5;
            banknotes++;
        }
        while (sum >= 2) {
            sum -= 2;
            banknotes++;
        }
        while (sum >= 1) {
            sum -= 1;
            banknotes++;
        }

        return banknotes;
    }

    public static void main(String[] args) {
        ATM bank = new ATM();
        System.out.println(bank.countBanknotes(578));
    }
}
