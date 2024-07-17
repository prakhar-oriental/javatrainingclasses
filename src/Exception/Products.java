package Exception;

 class ProductNotFound extends Exception {
 static String notfound = "Product key invalid, Try some other way";
 public ProductNotFound() {
	 super("notFound");
 }
}

public class Products{
	
static String[] productlist = {"phone","washing machine","gayser","laptop"};
static int validkey = productlist.length;
public static void bring(int productno) throws ProductNotFound{
	if(productno>=validkey || productno<0)
		throw new ProductNotFound();
	else System.out.println(productlist[productno-1]);
}
public static void main(String args[]) throws ProductNotFound
{
	System.out.println(); 
	bring(2);
	bring(6);
}
}
