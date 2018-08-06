package com.deepu.backend.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deepu.backend.dao.UserDAO;
import com.deepu.backend.dto.Address;
import com.deepu.backend.dto.Cart;
import com.deepu.backend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.deepu.backend");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	

	@Test
	public void testAddUser() {
		
		user = new User() ;
		user.setFirstName("deepu");
		user.setLastName("Singh");
		user.setEmail("deep@gmail.com");
		user.setContactNumber("777777777");
		user.setRole("ADMIN");
		user.setEnabled(true);
		//user.setPassword("123");
		assertTrue("Failed to add the user!",  userDAO.add(user));
		
	}
}
		
		/*address = new Address();
		address.setAddressLineOne("401/B jankalyan Nagar");
		address.setAddressLineTwo("Near Firebrigade");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400095");
		address.setBilling(true);
		
		cart = new Cart();
		
		// linked the address with the user
		address.setUser(user);
		
		// linked the cart with the user
		cart.setUser(user);
		// link the user with the cart
		user.setCart(cart);
		
		// add the user
		assertEquals("Failed to add the user!", true, userDAO.add(user));	
		// add the address
		assertEquals("Failed to add the billing address!", true, userDAO.addAddress(address));

				
		// add the shipping address
		address = new Address();
		address.setAddressLineOne("401/B jankalyan Nagar");
		address.setAddressLineTwo("Near Firebrigade");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400095");
		address.setUser(user);
		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));
		
	}
	
	*/

	// working for uni-directional
/*
	@Test
	public void testAddAddress() {
		user = userDAO.get(1);
		
		address = new Address();
		address.setAddressLineOne("puja nagar");
		address.setAddressLineTwo("Near Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
				
		address.setUser(user);
		// add the address
		assertEquals("Failed to add the address!", true, userDAO.addAddress(address));	
	}
	
	@Test
	public void testUpdateCart() {
		user = userDAO.get(1);
		cart = user.getCart();
		cart.setGrandTotal(10000);
		cart.setCartLines(1);
		assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));			
	} 

*/
	

	

