package component.Microcontroller;

import component.Controller.Controller;
import component.Indentification.Identification;

public abstract class Microcontroller{
   Identification identification;
   String storage;
   Controller controller;

      public void create() {
         System.out.println(getClass().getSimpleName()+"Added To the system"); 
         System.out.println(addStorage()); 
         addController().create(); 
         addIdentification().create(); 
     };
   public abstract Identification addIdentification();
   public abstract String addStorage();
   public abstract Controller addController();
}
