package com.mrol.funnySMS.controller;

import com.mrol.funnySMS.swing.SMSPanel;
import com.mrol.funnySMS.swing.View;

/**
 * Created with IntelliJ IDEA.
 * User: Илья
 * Date: 14.09.13
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */
public class SMSPanelController {
    private SMSPanel smsPanel;

    public View getView(){
        if (smsPanel == null){
            this.smsPanel = new SMSPanel(this);
        }
        return this.smsPanel;
    }
}
