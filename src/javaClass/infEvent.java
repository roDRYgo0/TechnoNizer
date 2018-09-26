package javaClass;

import java.util.ArrayList;
import java.util.List;

public class infEvent {
    private Integer id;
    private String eventName;
    private String nicknameCreator;
    private byte[] profilePicture;
    private byte[] coverPicture;
    private byte[] mapImage;
    private Integer price;
    private Integer quantityTicket;
    private Integer visibility;
    private String startDateTime;
    private String endDateTime;
    private Integer staff;
    private Integer invitation;
    private String place;
    private String color;
    private Integer condition;
    private List<classPrice> prices;
    private List<guest> guests;
    private List<staff> staffs = new ArrayList<>();
    private List<activity> activities = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();
    private List<problem> problems = new ArrayList<>();
    private List<announcement> announcements = new ArrayList<>();

    public byte[] getMapImage() {
        return mapImage;
    }

    public void setMapImage(byte[] mapImage) {
        this.mapImage = mapImage;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getNicknameCreator() {
        return nicknameCreator;
    }

    public void setNicknameCreator(String nicknameCreator) {
        this.nicknameCreator = nicknameCreator;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public byte[] getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(byte[] coverPicture) {
        this.coverPicture = coverPicture;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantityTicket() {
        return quantityTicket;
    }

    public void setQuantityTicket(Integer quantityTicket) {
        this.quantityTicket = quantityTicket;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Integer getStaff() {
        return staff;
    }

    public void setStaff(Integer staff) {
        this.staff = staff;
    }

    public Integer getInvitation() {
        return invitation;
    }

    public void setInvitation(Integer invitation) {
        this.invitation = invitation;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public List<classPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<classPrice> prices) {
        this.prices = prices;
    }

    public List<guest> getGuests() {
        return guests;
    }

    public void setGuests(List<guest> guests) {
        this.guests = guests;
    }

    public List<staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<staff> staffs) {
        this.staffs = staffs;
    }

    public List<activity> getActivities() {
        return activities;
    }

    public void setActivities(List<activity> activities) {
        this.activities = activities;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<problem> getProblems() {
        return problems;
    }

    public void setProblems(List<problem> problems) {
        this.problems = problems;
    }

    public List<announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<announcement> announcements) {
        this.announcements = announcements;
    }
    
    
}
