package com.arsoft;

public class Main {
    public static void main(String[] args) {
        String nameOfFirstWorkPlace = "Office1";
        String nameOfSecondWorkPlace = "Office2";
        Staff firstWorker = new Staff();
        firstWorker.name = "Денис";
        firstWorker.surname = "Витовтов";
        firstWorker.position = "Lead";
        firstWorker.phoneNumber = 101;
        firstWorker.workPlace = nameOfFirstWorkPlace;
        Staff secondWorker = new Staff();
        secondWorker.name = "Ivan";
        secondWorker.surname = "Doroshev";
        secondWorker.position = "QA";
        secondWorker.phoneNumber = 112;
        firstWorker.workPlace = nameOfFirstWorkPlace;
        Staff thirdWorker = new Staff();
        thirdWorker.name = "Max";
        thirdWorker.surname = "Yrisov";
        thirdWorker.position = "developer";
        thirdWorker.phoneNumber = 131;
        thirdWorker.workPlace = nameOfFirstWorkPlace;


        firstWorker.sayNameOfWorkPlace();
        secondWorker.sayPhoneNumber();
        thirdWorker.sayPosition();











    }
}
