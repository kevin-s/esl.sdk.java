package com.silanis.esl.sdk;

import java.io.Serializable;

/**
 * Created by chi-wing on 5/16/14.
 */
public class Placeholder implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private int signingOrder;

    public Placeholder(String id){
        this.id = id;
        this.name = id;
    }

    public Placeholder(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Placeholder(String id, String name, Integer signingOrder){
        this.id = id;
        this.name = name;
        if(signingOrder != null) this.signingOrder = signingOrder;
    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSigningOrder() {
        return signingOrder;
    }

    public void setSigningOrder(int signingOrder) {
        this.signingOrder = signingOrder;
    }
}
