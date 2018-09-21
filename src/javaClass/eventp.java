package javaClass;

import java.util.ArrayList;
import java.util.List;

/** @author rodri */

public class eventp {
    
    private Integer id;
    private String title;
    private String place;
    private String Dstart;
    private String Dend;
    private String note;
    private String color;
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDstart() {
        return Dstart;
    }

    public void setDstart(String Dstart) {
        this.Dstart = Dstart;
    }

    public String getDend() {
        return Dend;
    }

    public void setDend(String Dend) {
        this.Dend = Dend;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}