package com.mrol.funnySMS.swing;

import com.mrol.funnySMS.controller.SMSPanelController;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Илья
 * Date: 14.09.13
 * Time: 23:33
 * To change this template use File | Settings | File Templates.
 */
public class SMSPanel extends JPanel implements View {
    private SMSPanelController controller;

    private JLabel phoneLabel;
    private JTextField phoneTextField;
    private JLabel senderLabel;
    private JTextField senderTextField;
    private JTextArea msgTextArea;
    private JButton sendButton;

    public SMSPanel(SMSPanelController controller) {
        super(new GridBagLayout());
        this.setVisible(true);
        this.setPreferredSize(new Dimension(640, 480));
        this.controller = controller;

        createComponents();
        layoutComponents();
        addListeners();
    }

    private void createComponents(){
        this.phoneLabel = new JLabel("Номер получателя:");
        this.phoneTextField = new JTextField();
        this.senderLabel = new JLabel("Отправитель:");
        this.senderTextField = new JTextField();
        this.msgTextArea = new JTextArea();
        this.sendButton = new JButton("Отправить");
    }

    private void layoutComponents(){

    }

    private void addListeners(){

    }
}
