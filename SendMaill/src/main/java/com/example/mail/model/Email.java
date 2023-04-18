/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mail.model;

/**
 *
 * @author kmd
 */
 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    //người nhận
    private String recipient;
    //nội dung emaillúc
    private String msgBody;
    //tiêu đề
    private String subject;
    //tệp đính kèm(có thể tùy chỉnh để thêm được nhiều file 1 lúc)
    private String attachment;
    
}