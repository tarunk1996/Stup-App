package com.example.ta.stup2;

/**
 * Created by TA on 29-08-2017.
 */

public class PlanGroups {

    private String title;
    private String lastMessage;
    private String lastTime;
    private String groupImg;

    public PlanGroups(String title, String lastMessage, String lastTime,String groupImg) {
        this.title = title;
        this.lastMessage = lastMessage;
        this.lastTime = lastTime;
        this.groupImg = groupImg;
    }

    public String getTitle() {
        return title;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getLastTime() {
        return lastTime;
    }

    public String getGroupImg() {
        return groupImg;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public void setGroupImg(String groupImg) {
        this.groupImg = groupImg;
    }
}
