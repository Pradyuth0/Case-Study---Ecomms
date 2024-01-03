package casestudy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import dao.OrderProcessorRepository;
import dao.OrderProcessorRepositoryImpl;
import entity.Customers;
import entity.Products;


public class AppTest 
{
    OrderProcessorRepository opr = new OrderProcessorRepositoryImpl();
	Random random = new Random();
	int id = random.nextInt(500);
	
    @BeforeEach
    public void removeData() {
        opr.deleteProduct(id);
    }
    
    @Test
    public void createProductTest() {
    	Products product = new Products(id, "Laptop", 50000, "Gaming PC", 99);
        boolean isDone = opr.createProduct(product);
        assertTrue(isDone);
    }
    
    @Test
    public void addProductToCartTest() {
        Customers customer = new Customers();
        customer.setCustomer_id(1);
        Products product = new Products(id, "book", 999, "Text book", 10);

        boolean isDone_pro = opr.createProduct(product);
        List<Products> before_list = opr.getAllFromCart(customer);

        boolean isDone = opr.addToCart(customer, product, 13);
        System.out.println(isDone);

        List<Products> after_list = opr.getAllFromCart(customer);

        assertTrue(isDone);
        assertEquals(before_list.size()+ 1, after_list.size());
    }
    
    @Test
    public void productOrderTest() {
        Customers customer = new Customers();
        customer.setCustomer_id(1);
        Products product = new Products();
        product.setProduct_id(id);

        boolean isDone_pro = opr.createProduct(product);

        List<Map<Products, Integer>> productsAndQuantities = new ArrayList<Map<Products, Integer>>();
        HashMap<Products, Integer> hs = new HashMap<Products, Integer>();
        hs.put(product, 3);

        productsAndQuantities.add(hs);

        String shippingAddress = "abc";

        boolean isDone = opr.placeOrder(customer, productsAndQuantities, shippingAddress);

        assertTrue(isDone);
    }

   

   
}
