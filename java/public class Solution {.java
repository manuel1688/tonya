public class Solution {
    public static void main(String[] args) {
  
      Item apple = new Item("apple", 0.50);
      Item orange = new Item("orange", 0.40);
      Item banana = new Item("banana", 0.20);
  
      Tax MO = new Tax("MO",1.225);
      Tax OR = new Tax("OR",0);
      Tax GA = new Tax("GA",4);
      Tax IL = new Tax("Others",2);
  
      CartItem[] cart = new CartItem[] {
        new CartItem(apple, 6),
        new CartItem(orange, 3),
        new CartItem(banana, 4)
      };
      
      //Part 1
      System.out.println(checkout(cart, null, null));
      CheckoutResult a = new CheckoutResult(checkout(cart, null, null));
      System.out.print(a.toString());
      
      //Part 2
      System.out.println(checkout(cart,MO, null));
      
      //Part 3
      System.out.println(checkout(cart,IL,"tenpercentoff"));
      
      //Part 4
      System.out.println(checkout(cart,GA,"2dollarsoff"));
      
      //Part 5
      System.out.println(checkout(cart,MO,"buyonegetonefree"));
    }
    
    private static class Item{
      private String name;
      private double price;
  
      Item(String name, double price){
        this.price = price;
        this.name = name;
      }
  
      public double get_price(){
        return this.price;
      }
  
      public double get_price_with_discount(double discount){
        return this.price - this.price * (discount/100);
      }
    }
  
    private static class Tax{
      private String name;
      private double percentage;
  
      Tax(String name, double percentage){
        this.percentage = percentage;
        this.name = name;
      }
  
      public double get_percentage(){
        return this.percentage;
      }
    }
  
    private static class CartItem {
      private Item item;
      private int count;
  
      public CartItem(Item item, int count) {
        this.item = item;
        this.count = count;
      }
  
      public Item getItem() { return item; }
      public int getCount() { return count; }
  
      public int getCountWithDiscount() {
        if(this.count == 1){
          return 1;
        }else if(this.count % 2 == 0){
          return this.count/2;
        }else{
          return (int)(this.count/2);
        }
      }
    }
  
    private static double checkout(CartItem[] cart, Tax tax, String discountCode) {
      System.out.println("Hello, world!");
      double sub_total = 0.00;
      double tax_value = 0.00;
      if(tax != null){
        tax_value = tax.get_percentage()/100;
      }
     
      for(int i=0; i< cart.length;i++){
  
          if(discountCode == "tenpercentoff"){
            sub_total += cart[i].getCount() * cart[i].getItem().get_price_with_discount(10);
          }else if(discountCode == "buyonegetonefree"){
            sub_total += cart[i].getCountWithDiscount() * cart[i].getItem().get_price();
          }else{
            sub_total += cart[i].getCount() * cart[i].getItem().get_price();
          }
        }
  
      if(tax_value > 0){
        sub_total += sub_total * tax_value;
      }
  
      if(sub_total > 5 && discountCode == "2dollarsoff"){
        sub_total = sub_total - 2;
      }
      return sub_total;
    }
  
    private static class CheckoutResult {
      private double subtotal;
      private double discount;
      private double tax;
      private double total;
  
      public CheckoutResult(double subtotal){
        this.subtotal = subtotal;
      }
  
      public double getSubtotal() { return subtotal; }
      public void setSubtotal(double value) { subtotal = value; }
  
      public double getDiscount() { return discount; }
      public void setDiscount(double value) { discount = value; }
  
      public double getTax() { return tax; }
      public void setTax(double value) { tax = value; }
  
      public double getTotal() { return total; }
      public void setTotal(double value) { total = value; }
  
      @Override
      public String toString() {
        return String.format(
          "Subtotal: %f%nDiscount: %f%nTax:      %f%nTotal:    %f",
          subtotal, discount,tax,total);
      }
    }
  }