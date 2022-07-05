package com.storage.warehouse.users;

import com.storage.warehouse.users.validation.UserInsertValid;

import java.io.Serializable;

@UserInsertValid // validates users fields acessing db if needed
public class UserInsertDTO extends UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String password;

    public UserInsertDTO(){
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
