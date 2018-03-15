package model;

import org.bson.types.ObjectId;

public class Provider {

    private final String name;
    private ObjectId id = null;

    public Provider(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ObjectId getId(){
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String toString(){
        return name;
    }
}
