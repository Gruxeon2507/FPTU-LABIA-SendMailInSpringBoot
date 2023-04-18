/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mail.controller;

/**
 *
 * @author kmd
 */
// Importing required classes
import com.example.mail.model.Email;
import com.example.mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    //gửi mail chỉ có nội dung
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Email details) {
        String status = emailService.sendSimpleMail(details);
        return status;
    }

    // gửi mail với tệp đính kèm 
        @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody Email details) {
        String status = emailService.sendMailWithAttachment(details);
        return status;
    }
}
