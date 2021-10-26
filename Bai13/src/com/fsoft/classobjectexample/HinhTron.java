package com.fsoft.classobjectexample;

import java.util.Scanner;

public class HinhTron {
	// public thể hiện quyền truy cập (access_modifier)
 
    final float PI = 3.14f;
    
    // Khai báo các thuộc tính (instance variable) của hình tròn
 
    float r; // float là declaration, r là variable
    float cv;
    float dt;
 
    // Constructor không có tham số truyền và có giá trị trả về
    public HinhTron() {
        nhapBanKinh();  // Thử gọi hàm nhapBanKinh()
    }
 
    
    // Constructor có một tham số r truyền vào
    // Phương thức này có tên HinhTron và có giá trị trả về theo r
    public HinhTron(float r) {
        this.r = r; // Gán biến r vào thuộc tính r
    }
 
    public void nhapBanKinh() {
        System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }
 
    public void tinhChuVi() {
        cv = 2 * PI * r;
    }
 
    public void tinhDienTich() {
        dt = PI * r * r;
    }
 
    public void inChuVi() {
        System.out.println("Chu vi Hình tròn: " + cv);
    }
 
    public void inDienTich() {
        System.out.println("Diện tích Hình tròn: " + dt);
    }
}