package com.example.rahul.mshack.Data;

import java.util.List;

public class SingleUser {

    public String name;

    public String password;

    public String alias;

    public List<String> technicals;

    public List<String> links;

    public SingleUser(String name, String password, String alias, List<String> technicals, List<String> links) {
        this.name = name;
        this.password = password;
        this.alias = alias;
        this.technicals = technicals;
        this.links = links;
    }
}
