package com.company;

public interface account {
    public abstract void create(String cpf, int phone, float balance);
    public abstract void delete(String cpf);
    public abstract void update(String cpf);
    public abstract void payment(String cpf);
}
