package com.example.Maeschalck_Sharma.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentTeam {

    @SerializedName("name")
    @Expose
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
