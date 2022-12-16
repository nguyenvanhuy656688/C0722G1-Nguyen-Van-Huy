package com.example;

import com.example.model.EmailSetting;

import java.util.List;

public interface IEmailSettingService {
    List<String> getLanguages();

    List<String> getSize();

    List<EmailSetting> display();

    EmailSetting finById(int id);

    void edit(EmailSetting emailSetting);
}
