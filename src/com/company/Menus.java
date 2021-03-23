package com.company;

import java.util.Scanner;

public class Menus {

    public void options(){
        Scanner in = new Scanner(System.in);

        System.out.println("----------Options----------");
        System.out.println("1 - Create account");
        System.out.println("2 - Add balance");
        System.out.println("3 - Withdraw");
        System.out.println("0 - Exit");
        System.out.println("---------------------------");

        int option = in.nextInt();
        MyAccount account = new MyAccount();


        switch (option){
            case 1:
                System.out.println("Insert data");

                System.out.print("CPF: ");
                String cpf =  in.next();

                System.out.println("Phone: ");
                int phone = in.nextInt();

                System.out.println("Balance: ");
                float balance = in.nextFloat();

                account.create(cpf, phone, balance);

            break;

        }
    }

    public boolean confirm(){
        Scanner in = new Scanner(System.in);

        System.out.println("Confirm creation account?");
        System.out.println("1 - Yes || 2 - No");

        int confirm = in.nextInt();

        if(confirm == 1){
            return true;
        }else {
            return false;
        }
    }

    public void cancel(){

    }

    public void success(String document){
        System.out.println("Account created success! To document: " + document);

    }
}
