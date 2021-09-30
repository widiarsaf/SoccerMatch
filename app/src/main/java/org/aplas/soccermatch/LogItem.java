package org.aplas.soccermatch;

public class LogItem {
    private String name;
    private String time;
    private String player;

    public LogItem(String name, String time, String player) {
        name = name;
        time = time;
        player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String value) {
        this.time = value;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String value) {
        this.player = value;
    }
}