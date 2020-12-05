package ass4.que7;

public class SavingAccount {
    public static void main(String[] args) {
        SavingAccountEntity saver1 = new SavingAccountEntity(2000);
        SavingAccountEntity saver2 = new SavingAccountEntity(3000);

        saver1.modifyAnnualIntrestRate();
        saver1.monthlyIntrest();
        saver1.calculateMonthlyIntrest();
        saver1.displayData();

        saver1.modifyAnnualIntrestRate();
        saver1.monthlyIntrest();
        saver1.calculateMonthlyIntrest();
        saver1.displayData();


        saver2.modifyAnnualIntrestRate();
        saver2.monthlyIntrest();
        saver2.calculateMonthlyIntrest();
        saver2.displayData();

        saver2.modifyAnnualIntrestRate();
        saver2.monthlyIntrest();
        saver2.calculateMonthlyIntrest();
        saver2.displayData();

    }
}
