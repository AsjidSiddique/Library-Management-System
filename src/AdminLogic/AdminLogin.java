
package AdminLogic;

import Common.AccountControl;


public class AdminLogin extends AccountControl {
    
   public AdminLogin(String email, String password){
        super(email,password);
    }
    public boolean login() {
        if(email.equals("admin") && password.equals("admin"))
            return true;
        else return false;
        
    }
}