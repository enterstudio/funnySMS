package com.mrol.funnySMS;

import com.mrol.funnySMS.controller.SMSPanelController;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Илья
 * Date: 14.09.13
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class FunnySMS {

    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SMSPanelController smsPanelController = new SMSPanelController();
            smsPanelController.showView();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
