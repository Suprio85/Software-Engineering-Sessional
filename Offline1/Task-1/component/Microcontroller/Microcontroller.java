package component.Microcontroller;

import component.Controller.Controller;
import component.Indentification.Identification;

public abstract class Microcontroller{
   Identification identification;
   String storage;
   Controller controller;

      public String create() {
        return getClass().getSimpleName() + " added to the system."
        + "\n"
        +addIdentification().create()
        + "\n"
        +addStorage()
         + "\n"
        +addController().create(); 
     };
   public abstract Identification addIdentification();
   public abstract String addStorage();
   public abstract Controller addController();
}
