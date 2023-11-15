package DAO;

import model.UserModel;

public interface UserDAO {
    public abstract boolean register(UserModel um);
    
    public abstract boolean login(UserModel um);
    
    public abstract boolean view(UserModel um);
    
    public abstract boolean update(UserModel um);
    
    public abstract boolean edit(UserModel um);
}
