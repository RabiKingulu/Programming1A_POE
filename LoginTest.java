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


