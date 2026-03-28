/*
References:


1. Unit Testing Reference (YouTube):
   
JUnit Testing Tutorial (assertTrue & assertFalse)
   
https://youtu.be/MOhiM2SXZl0?si=ps2bhLHlUickfZjw

*/

import static 
org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
  
public class LoginTest {
     Login login;
	 
	 @BeforeEach
	 void setup() {
	     login = new Login();
    
	  }

	  @Test
	  void testUsernameMessages() {
	      assertEquals("Username successfully captured.", login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976"));
		  assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.",
 login.registerUser("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976"));
    
      }
	  @Test
	  void testPasswordMessages() {
	      assertEquals("Password successfully captured.", login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976"));
		  assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
 login.registerUser("kyl_1", "password", "+27838968976"));
    
	  }
	  
	  @Test
	  void testCellphoneMessages() {
	  assertEquals("Cell number successfully captured.", login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976"));
	  assertEquals("Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.",
 login.registerUser("kyl_1", "Ch&&sec@ke99!", "08966553"));
    
	  }
	  
	  @Test
	  void testBooleanLogic() {
	  assertTrue(login.checkUserName("kyl_1"));
	  assertFalse(login.checkUserName("kyle!!!!!!!"));
	  assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
	  assertFalse(login.checkPasswordComplexity("password"));
	  assertTrue(login.checkCellPhoneNumber("+27838968976"));
	  assertFalse(login.checkCellPhoneNumber("08966553"));
    
	  }

	  @Test
	  void testLoginStatus() {
	  assertTrue(login.loginUser("kyl_1", "kyl_1", "Ch&&sec@ke99!", "Ch&&sec@ke99!"));
	  assertFalse(login.loginUser("wrongUser", "kyl_1", "wrongPass", "Ch&&sec@ke99!"));
	  
	  }
}


