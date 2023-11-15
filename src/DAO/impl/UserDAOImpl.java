package DAO.impl;

import DAO.UserDAO;
import model.UserModel;
import dbconfig.DatabaseConnection;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {

    public UserDAOImpl() {
        DatabaseConnection.getConnection();
    }

    @Override
    public boolean register(UserModel um) {
        try {
            String sql = "INSERT INTO sms_user (username, passkey, email, hash_passkey)"
                    + "VALUES('" + um.getUsername() + "', '" + um.getPasskey() + "', " + "'" + um.getEmail() + "', '" + um.getHash_passkey() + "')";
            int status = DatabaseConnection.iud(sql);
            if (status == 1) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean login(UserModel um) {
        String sql = "SELECT username, passkey, usertype FROM sms_user WHERE username='"+ um.getUsername() +"'";
        boolean status = false;
        try {
            ResultSet rs = DatabaseConnection.select(sql);
            while (rs.next()) {
                if (rs.getString("username").equals(um.getUsername()) && 
                        rs.getString("passkey").equals(um.getPasskey()) &&
                        rs.getString("usertype").equals(um.getUsertype())){
                    status = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return status;
    }

    @Override
    public boolean view(UserModel um) {
        return true;
    }

    @Override
    public boolean update(UserModel um) {
        return true;
    }

    @Override
    public boolean edit(UserModel um) {
        return true;
    }
}
