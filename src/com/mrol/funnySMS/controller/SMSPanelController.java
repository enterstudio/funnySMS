package com.mrol.funnySMS.controller;

import com.mrol.funnySMS.swing.SMSPanel;
import com.mrol.funnySMS.swing.View;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Илья
 * Date: 14.09.13
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */
public class SMSPanelController {
    private SMSPanel smsPanel;

    public void showView(){
        if (smsPanel == null){
            this.smsPanel = new SMSPanel(this);
        }
        JFrame frame = new JFrame("funnySMS");
        frame.add(smsPanel);
        frame.setVisible(true);
        frame.setBounds(400, 400, 250, 210);

    }
}
