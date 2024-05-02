package org.howard.edu.lsp.oopfinal.question2;
//PaymentStrategyDriver to demonstrate the usage
public class PaymentStrategyDriver {
 public static void main(String[] args) {
     // Create instances of payment strategies
     PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
     PaymentStrategy payPalPayment = new PayPalPayment("amarkc9702.com");
     PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

     // Create a ShoppingCart and checkout with different payment strategies
     ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
     cart1.checkout(100.0);

     ShoppingCart cart2 = new ShoppingCart(payPalPayment);
     cart2.checkout(50.0);

     ShoppingCart cart3 = new ShoppingCart(bitcoinPayment);
     cart3.checkout(75.0);
 }
}
