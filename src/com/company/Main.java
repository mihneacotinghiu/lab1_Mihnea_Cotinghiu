package com.company;

public class Main {

    public static void main(String[] args) {

        //fetch Autorecord based on his roll no from the database
        Auto model  = retriveAutoFromDatabase();

        //Create a view : to write Auto details on console
        Autoview view = new AutoView();

        AutoController controller = new AutoController(model, view);

        controller.updateView();

        //update model data
        controller.setAutoName("Tesla");
        System.out.println("after update, auto details are:");

        controller.updateView();
    }

    private static Auto retriveAutoFromDatabase(){
        Auto Auto = new Auto();
        Auto.setName("Tesla");
        Auto.setId("wwwaaaazzzssss");
        Auto.setModel("Model X");
        return Auto;

        }
    }

