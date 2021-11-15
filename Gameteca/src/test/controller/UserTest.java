
package Test;


import context.GenerateString;
import controllers.UsersController;
import static controllers.UsersController.validation;
import database.DatabaseAdapter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import org.junit.jupiter.api.Test;
import utils.JPedidosException;
import static org.mockito.Mockito.*;


public class UsersTest {
    
        @Test
        public void UserTest(){
            
        UsersController user = new UsersController();
        DatabaseAdapter database = new DatabaseAdapter();
        Connection _connection;
        String generatedString = GenerateString.execute();
        
        
  
        user.login = "Philipe";
        user.ValidPassword = "123456 ";
        
        
        try {
                UsersController.create(user);
                
                
                UsersController.validation = UsersController.login(user.login);
                
                
                assertNotNull(validation);
                        
                
        } catch(Exception e) {
          
            throw new JPedidosException("Nop", e);
            
                
        }
     
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  