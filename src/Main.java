//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int FREE_SHIPPING = 100;
        double itemPrice = 60;
        final double SHIPPING = 0.02;
        double shippingCost = 0;
        double finalPrice = 0;


        if (itemPrice >= FREE_SHIPPING)
        {
            System.out.println("You get free shipping! Your total is $" + itemPrice);
        }
        else
        {
            shippingCost = itemPrice * SHIPPING;

            finalPrice = shippingCost + itemPrice;

            System.out.println("Sorry! You don't qualify for free shipping." +
                    " Shipping will cost $" + shippingCost + ", and your final price will be $" + finalPrice);
        }
    }
}