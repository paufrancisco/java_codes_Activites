public class TestStrategy{

    public static void main(String[] args) {
        Cart cart = new Cart(1512.75);

        cart.pay(new Online("mark.reyes@gmail.com", "Wasd8456!")); 

        cart = new Cart(375.25);

        cart.pay(new Mobile("09610248540", 123)); 


    }

    interface Payment{
        public void pay(double amount);
    }

    static class Online implements  Payment{
        private String email;
        private String password;

        public Online(String email, String password){
            this.email = email;
            this.password = password;
        }
       
        @Override
        public void pay(double amount) {
            // TODO Auto-generated method stub
            System.out.println("Paid using online account: "+amount);
        }


    }

    static class Mobile implements Payment{

        private String number;
        private int pin;

        public Mobile(String number, int pin){
            this.number = number;
            this.pin = pin;
        }


        @Override
        public void pay(double amount) {
            // TODO Auto-generated method stub
            System.out.println("Paid using mobile account: "+amount);
        }

    }

    static class Cart {
        private double amount;

        public Cart(double amount){
            this.amount = amount;
        }

        public void pay(Payment mode) {

            mode.pay(amount);
          
          }

    }

}