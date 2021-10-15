package com.fsoft.classobjectexample;

public class ProgramHinhTron {

	public static void main(String[] args) {
        // Cách khai báo HinhTron dựa vào constructor thứ nhất
        HinhTron hinhTron1 = new HinhTron(); 
        // Declaring an Object: HinhTron hinhTron1
        // Instantiating an Object: new
 
        // Cách khai báo HinhTron dựa vào constructor thứ hai
        HinhTron hinhTron2 = new HinhTron(10);
        // Initializing an Object: HinhTron(10) đặt r cho hình tròn là 10
 
        // Tính toán và in ra kết quả cho hinhTron1
        System.out.println("======== Kết quả hinhTron1 ========");
        hinhTron1.tinhChuVi();
        hinhTron1.tinhDienTich();
        hinhTron1.inChuVi();
        hinhTron1.inDienTich();
         
        // Tính toán và in ra kết quả cho hinhTron2
        System.out.println("======== Kết quả hinhTron2 ========");
        hinhTron2.tinhChuVi();
        hinhTron2.tinhDienTich();
        hinhTron2.inChuVi();
        hinhTron2.inDienTich();
    }
}
