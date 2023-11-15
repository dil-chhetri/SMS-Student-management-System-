
package model;

public class UserModel {
    private int user_id;
    private String username;
    private String email;
    private String passkey;
    private String hash_passkey; 
    private String usertype;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasskey() {
        return passkey;
    }

    public void setPasskey(String passkey) {
        this.passkey = passkey;
    }

    public String getHash_passkey() {
        return hash_passkey;
    }

    public void setHash_passkey(String hash_passkey) {
        this.hash_passkey = hash_passkey;
    }

    @Override
    public String toString() {
        return "UserModel{" + "user_id=" + user_id + ", username=" + username + ", email=" + email + ", passkey=" + passkey + ", hash_passkey=" + hash_passkey + '}';
    }
    
    
}
