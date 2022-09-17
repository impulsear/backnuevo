/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.francisco.demo.Security.Dto;


public class JwtDto {
    private String token;
    
    //Constructor
    public JwtDto(){}

    public JwtDto(String token) {
        this.token = token;
    }
    
    //Getters and Setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
