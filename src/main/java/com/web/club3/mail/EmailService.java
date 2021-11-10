package com.web.club3.mail;

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
}
