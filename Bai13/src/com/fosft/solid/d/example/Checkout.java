package com.fosft.solid.d.example;

public class Checkout {

	// Hàm checkout mới sẽ như sau
	public void Checkout(int orderId, int userId) {
	    // Nếu muốn thay đổi database, logger ta chỉ cần thay đổi code ở dưới các module này mà không ảnh hưởng đến hàm checkout
	    //IDatabase db = new XMLDatabase(); 
	    //IDatebase db = new SQLDatabase();
	    IDatabase db = new Database();
	    db.Save(orderId);
	 
	    ILogger log = new Logger();
	    log.LogInfo("Order has been checkout");
	 
	    IEmailSender es = new EmailSender();
	    es.SendEmail(userId);
	}

}


// Dependency Inversion Principle
// 1. Các module cấp cao không nên phụ thuộc vào các modules cấp thấp. 
// Cả 2 nên phụ thuộc vào abstraction.
// 2. Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại.
// ( Các class giao tiếp với nhau thông qua interface, 
// không phải thông qua implementation.)