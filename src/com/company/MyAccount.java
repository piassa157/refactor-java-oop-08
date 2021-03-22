package com.company;

import java.util.Scanner;

public class MyAccount implements account{

    private String cpf;
    private int phone;
    private float balance;
    private boolean status;

    public MyAccount(){
        this.setBalance(0);
        this.setStatus(false);
    }

    public MyAccount(String cpf, int phone, float balance, boolean status) {
        this.create(cpf, phone, balance);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void create(String cpf, int phone, float balance) {
        Menus M1 = new Menus();

        boolean confirm = M1.confirm();

        if(confirm)
        {
            M1.success();
        }else{
            M1.options();
        }

    }

    @Override
    public void delete(String cpf) {

    }

    @Override
    public void update(String cpf) {

    }

    @Override
    public void payment(String cpf) {

    }
}
