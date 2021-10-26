package com.fosft.solid.d.example;

//khi chưa áp dụng nguyên lý
//Cart là module cấp cao
public class Cart {
 public void Checkout(int orderId, int userId) {
     // Database, Logger, EmailSender là module cấp thấp
     Database db = new Database();
     db.Save(orderId);

     Logger log = new Logger();
     log.LogInfo("Order has been checkout");

     EmailSender es = new EmailSender();
     es.SendEmail(userId);
 }
}