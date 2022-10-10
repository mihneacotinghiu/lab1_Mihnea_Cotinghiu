package com.company;

public class AutoController {
    private Auto model;
    private Autoview view;

    public AutoController(Auto model, Autoview view){
        this.model = model;
        this.view = view;
    }

    public void setAutoName(String name){
        model.setName(name);
    }

    public String getAutoName(){
        return model.getName();
    }

    public void setAutoId(String id){
        model.setId(id);
    }

    public String getAutoId(){
        return model.getId();
    }

    public void setAutoModel(String model){
        model.setModel(model);
    }

    public String getAutoModel(){
        return model.getModel();
    }
    public void updateView(){
        view.printAutoDetails(model.getName(), model.getId(), model.getModel());
    }
}
