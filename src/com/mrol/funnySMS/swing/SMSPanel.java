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
        this.msgTextArea = new JTextArea(3, 15);
        this.sendButton = new JButton("Отправить");
    }

    private void layoutComponents(){
        add(this.phoneLabel,
                new GridBagConstraints(0, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 0, 0));
        add(this.phoneTextField,
                new GridBagConstraints(1, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 0, 0));
        add(this.senderLabel,
                new GridBagConstraints(0, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 0, 0));
        add(this.senderTextField,
                new GridBagConstraints(1, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 0, 0));
        JScrollPane scrollPane = new JScrollPane(this.msgTextArea);
        add(scrollPane,
                new GridBagConstraints(0, 2, 2, 2, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 0, 0));
        add(this.sendButton,
                new GridBagConstraints(1, 4, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5), 0, 0));
    }

    private void addListeners(){

    }
}
