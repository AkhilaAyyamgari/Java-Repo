import java.util.ArrayList;
import java.util.Iterator;
class Product{	
   int productId;
   String name;
   long price;
   String seller;
	public Product(int productId, String name, long price, String seller) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.seller = seller;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+ "\t"+ this.price + "\t"+ this.seller;
	}
}
class ProductManagement{
	 ArrayList<Product> al = new ArrayList<Product>();
	 public void addProduct(Product product) {
		   al.add(product);
	 }
	 public void deleteProduct(int productId) {
		 Product productToBeDeleted = null;
		 Iterator<Product> it = al.iterator();
		 while(it.hasNext()) {
			 Product product = it.next();
			 if(product.productId == productId) {
				 productToBeDeleted = product;
			 }
		 }
	   boolean result = al.remove(productToBeDeleted);
	   if(result == true) {
	   	 System.out.println("Product Deleted");
	   }
	   else {
	   	 System.out.println("Some issue in deleting the product");
	   }
	 }
	 public void updateProduct(int productId, String name, long price, String seller) {
		 Product productToBeUpdated = null;
		 Iterator<Product> it = al.iterator();
		 while(it.hasNext()) {
			 Product product = it.next();
			 if(product.productId == productId) {
				 productToBeDeleted = product;
			 }
		 } 
		 }
	 }
	 
	 public void showProducts() {
		  Iterator<Product> it = al.iterator();
		  System.out.println("------------------------------------");
		  System.out.println("Current List of Products");
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  System.out.println("------------------------------------");
	 }
}
public class ArrayListRealtime {
	public static void main(String[] args) {
		
		ProductManagement productManagement = new ProductManagement();
		
		 Product product1= new Product(101,"Product1", 9000,"Seller1");
		 Product product2= new Product(102,"Product2", 12000,"Seller2");
		
		 productManagement.addProduct(product1);
		 productManagement.addProduct(product2);
		
		 productManagement.showProducts();
		 Product product3= new Product(103,"Product3", 14000,"Seller1");
		 productManagement.addProduct(product3);
		 productManagement.showProducts();
		 productManagement.deleteProduct(101);
		 productManagement.showProducts();
		
		
		
		
		
		
		
		
	}
}