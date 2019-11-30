package com.morajavier.chat;

public class Mensaje {
    String nickName, message;
    Mensaje(String nickName, String message){
        this.nickName = nickName;
        this.message = message;
    }
    public String getNickname() {
        return nickName;
    }

    public void setNickname(String nickname) {
        this.nickName = nickname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
