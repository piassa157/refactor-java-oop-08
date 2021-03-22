package com.company;

import java.util.Scanner;

public class Menus {

    public void options(){

    }

    public boolean confirm(){
        Scanner in = new Scanner(System.in);

        System.out.println("Confirm creation account?");
        System.out.println("1) Yes || 2) No");

        int confirm = in.nextInt();

        if(confirm == 1){
            return true;
        }else {
            return false;
        }
    }

    public void cancel(){

    }

    public void success(){

    }




}
