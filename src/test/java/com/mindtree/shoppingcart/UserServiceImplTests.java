package com.mindtree.shoppingcart;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.shoppingcart.dto.Response;
import com.shoppingcart.entities.User;
import com.shoppingcart.repository.UserRepository;
import com.shoppingcart.service.impl.UserServiceImpl;
import com.shoppingcart.util.ShoppingUtil;

public class UserServiceImplTests 
{

	@Mock
	UserRepository userRepository;
	
	@Mock
	ShoppingUtil shoppingUtil;	

	@InjectMocks
	UserServiceImpl userServiceImpl;	


	@Test
	public void getUserDetaisByIdTest() {
		MockitoAnnotations.initMocks(this);
		int userId=1;
		User user=new User(1,"Shantha Raaki",null,0);
		Response response= new Response();
		response.setUser(user);
		response.setMessage("User has to pay toatal amount of "+user.getTotalAmount()+" Rupees");
		when(userRepository.findById(userId)).thenReturn(Optional.of(new User(1,"Shantha Raaki",null,0)));
		//when(shoppingUtil.formResponse(null, "Sorry !! User Not found with Id "+" "+userId)).thenReturn(response);
		assertEquals((userServiceImpl.getUserDetaisById(userId)),response);
	}

}
