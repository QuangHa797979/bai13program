package com.fsoft.stackheapmomeryexpalin;

public class Method1 {

	public Method1() {
	int i = 4;
	int y = 2;
	Class cls = new Class(i, y);
	System.out.println(cls);
}
}

// Heap memory là bộ nhớ được sử dụng bởi Java Runtime để cấp phát bộ nhớ cho các đối tượng (object) và String.
// Stack memory được sử dụng cho quá trình thực thi của mỗi thread.
// Dòng thứ 6: khi khai báo int i = 4 nó sẽ đưa i = 4 vào stack
// Dòng thứ 7: khi khai báo y = 2 nó sẽ đưa y = 2 vào stack (xếp trên i = 4)
// Dòng thứ 8: khi khai báo Class cls = new Class(): đây là kiểu đối tượng nên nó sẽ tạo đối tượng cls1 trong heap đồng thời chưa tham chiếu của đối tượng cls1 vào stack (xếp trên cùng trong stack)
// Sau khi kết thúc method, bộ nhớ trong stack được giải phóng, còn bộ nhớ trong heap thì chưa. Bộ nhớ trong heap phải chờ cho tới khi garbage collector (bộ dọn rác) của Java quét qua để giải phóng.