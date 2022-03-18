package com.arsoft;

public class Staff {
    String name;
    String surname;
    String position;

    int phoneNumber;




    void sayName(){
        System.out.println(name);
    }
    void saySurname(){
        System.out.println(surname);
    }
    void  sayPosition(){
        System.out.println(position);
    }
    void sayPhoneNumber(){
        System.out.println(phoneNumber);
    }
    void sayNameOfWorkPlace(){
        System.out.println(workPlace);
    }

    String workPlace;


     static void sayFirstWorkPlace(){
         System.out.println("Office1");
     }
     static  void saySecondWorkPlace(){
         System.out.println("Office2");
     }






}
