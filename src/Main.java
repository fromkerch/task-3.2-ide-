public class Main {
    public static void main(String[] args) {
        int bonusRubles;

        int accountAdded = 1100;
        int accountBalance = 100;
        if (accountAdded >= 1000){
            bonusRubles = accountAdded / 100;
        }else {
            bonusRubles = 0;
        }
        int totalAccount = accountAdded + accountBalance + bonusRubles ;
        System.out.println(totalAccount);
    }

        }

