// package com.example.demo.model;

// public class Bank {
    
// }
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
    @Id
    int accountNo;
    String name,emailId,mobileNo,loginPass;
    
    public Bank()
    {
        
    }
    public Bank(int accountNo, String name, String emailId, String mobileNo, String loginPass) {
        this.accountNo = accountNo;
        this.name = name;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.loginPass =  loginPass;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }
    public String getLoginPass() {
        return loginPass;
    }
}
