/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

class Order_test {
  
  @Test
  public void test_total() {
    Product produc_1 = new Product("P_1", 12.50, "Product 1",100);
    Order order_1 = new Order("O_1");
    order_1.add_detail(produc_1, 50);
    assertThat(order_1.get_total(), equalTo(625.00));
  }
}

class Product_test {
  
  @Test
  public void test_stock() {
    Product produc_1 = new Product("P_1", 12.50, "Product 1",100);
    Order order_1 = new Order("O_1");
    order_1.add_detail(produc_1, 50);
    Payment payment_1 = new Payment(625.00);
    payment_1.check(order_1);
    assertThat(produc_1.get_stock(), equalTo(50));
  }
}

class Order_detail{
    private Product product;
    private int qty;
    
    Order_detail(Product product, int qty){
      this.product = product;
      this.qty = qty;
    }

    public Product producto(){
      return this.product;
    }

    public int qty(){
      return this.qty;
    }

  }

    enum ESTATUS {
      PEDING,
      COMPLETED,
    }

   class Order{
    private String id;
    private ArrayList<Order_detail> order_details = new ArrayList<Order_detail>();
    private ESTATUS status = ESTATUS.PEDING;
    
    Order(String id){
      this.id = id;
    }

    void add_detail(Product product, int qty){
      Order_detail order_detail = new Order_detail(product, qty);
      order_details.add(order_detail);
    }

    void complete_order(){
      this.status = ESTATUS.COMPLETED;
    }

    public ESTATUS get_status(){
      return this.status;
    }

    public double get_total(){
      double total = 0.00;
      for (Order_detail o : order_details){
        Product p = o.producto();
        total += (p.price() * o.qty());
      }
      return total;
    }

    public void update_stock(){
      for (Order_detail o : order_details){
        o.producto().reduce_stock(o.qty());
      }
    }

    public String get_id(){
      return this.id;
    }
    
  }

 class Product{

  private String id;
  private double price;
  private String name;
  private int stock;

  public Product(String id, double price, String name,int stock){
    this.id = id;
    this.price = price;
    this.name = name;
    this.stock = stock;
  }

  public String name(){
    return this. name;
  }

  public double price(){
    return this.price;
  }

  public void reduce_stock(int qty){
    this.stock -= qty;
  }

  public int get_stock(){
    return this.stock;
  }

 }

 class Payment{

    double amount = 0.0;

    public Payment(double amount){
      this.amount = amount;
    }

    public boolean check(Order order){

      if(order.get_status() == ESTATUS.COMPLETED){
         throw new Error("this order was completed");
      }
      else if(order.get_total() == this.amount){
        order.update_stock();
        order.complete_order();
        return true;
      }
      System.out.println("Amount is enogh");
      return false;
    }
 }

class Solution {
  public static void main(String[] args) {
     Order_test order_test = new Order_test();
     order_test.test_total();
     Product_test product_test = new Product_test();
     product_test.test_stock();
  }
}
