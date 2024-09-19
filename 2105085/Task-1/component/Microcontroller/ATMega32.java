package component.Microcontroller;

import component.Controller.Controller;
import component.Controller.manualController;
import component.Indentification.Identification;
import component.Indentification.RFIDCards;

public class ATMega32 extends Microcontroller {
    // @Override
    // public void create() {
    //     System.out.println("ATMega32 added to the system.");
    //     System.out.println(storage);
    //     controller.create();
    //     identification.create();

    // }
    @Override
    public String addStorage(){
          
       this.storage = "Interface with SD card";
       return storage;
    }
    @Override
     public Controller addController(){
        this.controller = new manualController();
        return controller;

    }
    @Override
    public Identification addIdentification() {
       this.identification= new RFIDCards();
       return identification;
    }
    
}
