package Prctice_Abstraction_Interface;

interface Bank {
    int amount = 2500;

    public int deposite(int amount, int deposit);

    public int withdraw(int amount, int withdraw);

}    class Halifax implements Bank {
    public int deposite(int amount, int deposite) {
        amount = amount + deposite;
        return amount;
    }

    public int withdraw(int amount, int withdraw) {

        amount = amount - withdraw;
        return amount;

    }
    

}   class LloydsBank implements Bank {
        public int deposite(int amount, int deposite) {
            amount = amount + deposite;
            return amount;
        }

        public int withdraw(int amount, int withdraw) {

            amount = amount - withdraw;
            return amount;
        }
    }
 class IciciBank implements Bank{
        public int deposite(int amount, int deposite) {
            amount = amount + deposite;
            return amount;
    class TestBank {
        public static void main(String[] args) {
            Halifax B = new Halifax();
            int amount = B.deposite(2500, 1200);
            int amount1 = B.withdraw(2500, 1000);

            LloydsBank L = new LloydsBank();
            int amount3 = L.deposite(2500, 2200);
            int amount4 = L.withdraw(2500, 500);

            IciciBank I = new IciciBank();
            int amount5 = I.deposite(300,100);
            System.out.println("Halifax deposite:" + amount);
            System.out.println("Halifax withdraw:" + amount1);
            System.out.println("LloydsBank deposite:" + amount3);
            System.out.println("LloydsBank withdraw:" + amount4);


        }
    }






