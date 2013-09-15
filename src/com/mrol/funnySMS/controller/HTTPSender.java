package com.mrol.funnySMS.controller;

import com.mrol.funnySMS.model.Message;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
    private final String USER_AGENT = "SMS magic/1.3 CFNetwork/609.1.4 Darwin/13.0.0";
    private String url = "http://web.5cl.info/vk_sms/index.php?api_url=http://api.vk.com/api.php&api_id=1853867&viewer_id=35918197&user_id=35918197&is_app_user=1&auth_key=9f42d44fe235a3ce0ae1931f2636155e";



    public void sendMessage(Message message) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(message.getRequest());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + message.getRequest());
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());
    }
}
