package com.example;

import com.example.model.EmailSetting;

import java.util.ArrayList;
import java.util.List;

public class EmailSettingService implements IEmailSettingService {

    @Override
    public List<String> getLanguages() {
        List<String> list = new ArrayList<>();
        list.add("English");
        list.add("Vietnamese");
        list.add("Japanese");
        list.add("Chinese");
        return list;
    }

    @Override
    public List<String> getSize() {
        List<String> list = new ArrayList<>();
        list.add("5");
        list.add("10");
        list.add("15");
        list.add("30");
        list.add("50");
        list.add("100");
        return list;
    }

    @Override
    public List<EmailSetting> display() {
        List<EmailSetting> emailSettings = new ArrayList<>();
        emailSettings.add(new EmailSetting(1,"English",5,true,"king"));
        emailSettings.add(new EmailSetting(2,"Vietnamese",10,true,"king"));
        emailSettings.add(new EmailSetting(3,"Japanese",15,true,"king"));
        emailSettings.add(new EmailSetting(4,"Chinese",20,true,"king"));
        return emailSettings;
    }

    @Override
    public EmailSetting finById(int id) {
        for (EmailSetting e: display()
             ) {
            if(id==e.getId()){
                return e;
            }
        }
        return null;
    }

    @Override
    public void edit(EmailSetting emailSetting) {

    }
}
