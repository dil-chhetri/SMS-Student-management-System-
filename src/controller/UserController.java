package controller;

import DAO.UserDAO;
import DAO.impl.UserDAOImpl;
import model.UserModel;

public class UserController {

    String username;
    String password;
    String usertype;
    String email;
 
    public UserController(String username, String password,
            String email, String usertype) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.usertype = usertype;
    }
    
    public UserController(String username, String password, String usertype){
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }
    
    public boolean doLogin(UserController uc) {
        UserDAO ud = new UserDAOImpl();
        UserModel um = new UserModel();
        um.setUsername(uc.username);
        um.setPasskey(uc.password);
        um.setUsertype(uc.usertype);
        
        if (!ud.login(um)){
            return false;
        }
        return true;
    }

    public boolean doRegister(UserController uc) {
        UserDAO ud = new UserDAOImpl();
        UserModel um = new UserModel();
        um.setUsername(uc.username);
        um.setPasskey(uc.password);
        um.setHash_passkey(uc.password);
        um.setEmail(uc.email);
        um.setUsertype(uc.usertype);

        if (ud.register(um)) {
            return true;
        }
        return false;
    }
}
