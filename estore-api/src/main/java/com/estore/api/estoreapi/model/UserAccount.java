package com.estore.api.estoreapi.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAccount {

    static final String STRING_FORMAT = "UserAccount = [id=%d, name=%s]";

    @NotNull
    @JsonProperty
    private int id;

    @NotNull
    @JsonProperty
    private String username;

    // @JsonProperty
    // private Cart cart;

    @JsonProperty
    private Boolean isAdmin;

    public UserAccount(@NotNull @JsonProperty("id") int id,
            @NotNull @JsonProperty("username") String username) {
        this.id = id;
        this.username = username;
        // this.cart = null; // unsure how to set up cart
        this.isAdmin = false;
    }

    public String getUsername() {
        return this.username;
    }

    public int getId() {
        return this.id;
    }

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}