/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Project {
   
    private Integer id;
    private String name;
    private String description;
    private String datetime; 
    private Integer condition;
    private Integer teams;
    private String color;
    private byte[] coverImage;
    private String nickname;
    private List<team> members = new ArrayList<>();
    
      //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
    

    //</editor-fold>

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public Integer getTeams() {
        return teams;
    }

    public void setTeams(Integer teams) {
        this.teams = teams;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte[] getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(byte[] coverImage) {
        this.coverImage = coverImage;
    }

    public List<team> getMembers() {
        return members;
    }

    public void setMembers(List<team> members) {
        this.members = members;
    }

    
    
}
