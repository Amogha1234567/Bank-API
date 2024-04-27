package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bank;
import com.example.demo.repository.BankRepo;


@Service

public class BankService {
    @Autowired
    BankRepo br;

    //post
    public Bank create(Bank b)
    {
       
        return br.save(b);
    }
    // get
    public List<Bank> getAll()
    {
        return br.findAll();
    }
    public Optional<Bank> getByid(int accountNumber)
    {
        return br.findById(accountNumber);
    }

    //getbyid
    public Bank getbyid(int accountNumber)
    {
        return br.findById(accountNumber).orElse(null);
    }
    //put
    public boolean updateDetails(int accountNumber,Bank b)
        {
            if(br.findById(accountNumber)==null)
            {
                return false;
            }
            try{
                br.save(b);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteEmployee(int accountNumber)
        {
            if(this.getbyid(accountNumber) == null)
            {
                return false;
            }
            br.deleteById(accountNumber);
            return true;
        }
}