package component.Microcontroller;

import component.Controller.Controller;
import component.Controller.touchScreen;
import component.Indentification.Identification;
import component.Indentification.NFCCards;


public class RaspberryPie extends Microcontroller {

    // @Override
    // public void create() {
    //     System.out.println("Raspberry Pie added to the system.");
    //     System.out.println(storage);
    //     controller.create();
    //     identification.create();

    // }
    @Override
    public String addStorage(){
          
       this.storage = "Raspberry Pie SD card";
       return storage;
    }
    @Override
     public Controller addController(){
        this.controller = new touchScreen();
        return controller;

    }
    @Override
    public Identification addIdentification() {
       this.identification= new NFCCards();
       return identification;
    }
    
}