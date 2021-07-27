
public class Order {

		  boolean filled;
		  double cost;
		  String shipping;
		  
		  public Order(boolean filled, double cost, String shipping) {
				if (cost > 24.00) {
		      System.out.println("High value item!");
		    } else {
		      System.out.println("Low value item!");
		    }
		    this.filled= filled; 
		    this. cost= cost;
		    this.shipping=shipping;
		  }
		  
		  public void ship() {
		    if (filled) {
		      System.out.println("Shipping");
		    } else {
		      System.out.println("Order not ready");
		    }
		    
		    double shippingCost = calculateShipping();
		    
		    System.out.println("Shipping cost: ");
		    System.out.println(shippingCost);
		  }
		  
		  public double calculateShipping() {
		    double shippingCost;
		    switch (shipping) {
		      case "Regular":
		        shippingCost = 0;
		        break;
		      case "Express":    
		        shippingCost = 1.75;
		        break;
		      default:
		        shippingCost = .50; 
		    }
		    return shippingCost;
		 	}
		  
		  
		  public static void main(String[] args) {
		    // create instances and call methods here!
			Order order1 = new Order(false, 28, "Express"); 
			
			order1.ship(); 
			
			
				 
		  }
		}
