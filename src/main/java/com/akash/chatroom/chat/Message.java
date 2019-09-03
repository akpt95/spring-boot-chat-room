package com.akash.chatroom.chat;

import com.alibaba.fastjson.JSON;

/**
 * WebSocket message model
 */
public class Message {

    private String type;
    private String username;
    private String msg;
    private int onlineCount;

    public Message(String type,String username, String msg, int onlineCount) {
        this.type = type;
        this.username = username;
        this.msg = msg;
        this.onlineCount = onlineCount;
    }

    public static String jsonString(String type,String username, String msg, int onlineTotal) {
        return JSON.toJSONString(new Message(type,username, msg, onlineTotal));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }
}
