package com.mrol.funnySMS;

import com.mrol.funnySMS.controller.SMSPanelController;

/**
 * Created with IntelliJ IDEA.
 * User: Илья
 * Date: 14.09.13
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class FunnySMS {

    public static void main(String[] args){
        SMSPanelController smsPanelController = new SMSPanelController();
        smsPanelController.getView();
    }
}
