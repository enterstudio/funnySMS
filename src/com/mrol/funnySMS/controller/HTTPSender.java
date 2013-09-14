package com.mrol.funnySMS.controller;

import com.mrol.funnySMS.model.Message;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Илья
 * Date: 15.09.13
 * Time: 0:20
 * To change this template use File | Settings | File Templates.
 */
public class HTTPSender {
    private String urlParameters = "http://web.5cl.info/vk_sms/index.php?api_url=http://api.vk.com/api.php&api_id=1853867&viewer_id=35918197&user_id=35918197&is_app_user=1&auth_key=9f42d44fe235a3ce0ae1931f2636155e";
//    private String request = "http://example.com/index.php";

    public void sendMessage(Message message) throws IOException {
        URL url = new URL(urlParameters);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setInstanceFollowRedirects(false);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("charset", "utf-8");

//        connection.setRequestProperty("Content-Length", "" + Integer.toString(request.getBytes().length));
        //params = {'sms_phone' : sms_phone,'sms_sender' : sms_sender,'sms_msg' : sms_msg,'sms_send.x' : '23','sms_send.y' : '10'}
        connection.setRequestProperty("sms_phone", message.getPhone());
        connection.setRequestProperty("sms_sender", message.getSender());
        connection.setRequestProperty("sms_msg", message.getMessage());
        connection.setRequestProperty("sms_send.x", "23");
        connection.setRequestProperty("sms_send.y", "10");
        connection.setUseCaches (false);

        DataOutputStream wr = new DataOutputStream(connection.getOutputStream ());
        String s = "";
        wr.writeBytes(s);
        wr.flush();
        wr.close();
        connection.disconnect();
    }
}
