package com.mrol.funnySMS.model;

/**
 * Created with IntelliJ IDEA.
 * User: Илья
 * Date: 14.09.13
 * Time: 23:34
 * To change this template use File | Settings | File Templates.
 */
public class Message {
    String phone;
    String sender;
    String message;

    public Message() {
    }

    public Message(String phone, String sender, String message) {
        this.phone = phone;
        this.sender = sender;
        this.message = message;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public String getRequest(){
//        String request = "'sms_phone' : sms_phone,'sms_sender' : sms_sender,'sms_msg' : sms_msg,'sms_send.x' : '23','sms_send.y' : '10'";
//    }



}
