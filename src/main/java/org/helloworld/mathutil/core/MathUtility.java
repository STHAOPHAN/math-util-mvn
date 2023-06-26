/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.helloworld.mathutil.core;

//class này clone lại class huyền thoại java.util.Math
//với các hàm nổi tiếng Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    public static final double PI = 3.1415;
    
    //class này chứa hàm static, chấm xài luôn
    //Tính n giai thừa n! = 1.2.3....n
    //Quy ước thiết kiế hàm nay như sau
    //0! = 1! = 1
    //Không có giai thừa số âm. Nếu đưa số âm, chửi
    //Giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    //Do đó 21! không dùng kiểu long được. Nếu đưa > 21, chửi
    //CHỬI: không trả về giá trị gì cả mà NÉM RA NGOẠI LỆ EXCEPTION
//    public static long getFactorial(int n){
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
//        if (n == 0 || n == 1)
//            return 1;
//        long product = 1; //Tích phân dồn khởi động từ 1
//        for (int i = 2; i <= n; i++)
//            product *=i;
//        return product;
//    }
    
    public static long getFactorial(int n){
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        if (n == 0 || n == 1)
            return 1;
        return n*getFactorial(n-1);
    }
}

//5! = 1.2.3.4.5 = 5.4!
//4! = 4.3!
//3! = 3.2!
//2! = 2.1!
//1! = 1 dừng lại, hồi ngược lên trên
//N! = N x (N - 1)!

//TDD: Test Driven Development phát triển phần mềm theo phong cách
//code đến đâu kiểm thử đến đó, viết code và viết test case/test run diễn ra song song, đan xen

//Cứ có hàm là có test case
//VIết ra các test case đủ bao quát các tình huống xài hàm
//Test case: là bộ dữ liệu dùng để đưa vào app/hàm để mô phỏng lại
//1 tình huống xài app/hàm. Nó có input data, giải thích cách dùng hàm/app
//và có giá trị trả về expected
//lát hồi run (test run/ test execution) để luận đúng sai

//Dân dev giống dân QC ở chỗ này:
//Đêu phải viết/tạo ra test case, đều phải tiến hành run/chạy test
//và đều phải đọc kết quả đúng sai
//dev khác tester là phải viết code làm app!!!

//test case không viết tự do mà viết tho template
//Viết tự do:0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 5! -> 120;
//Viết chuẩn lại test case (XUẤT HIỆN TRONG ĐỀ THI PE< KHÓA LUẬN T/N và ĐI LÀM
//Test case #1: (mục tiêu test) check getF() with n = 0;
//Steps-Procedures (Cách tiến hành test -input/output...)
//          1. Given n = 0
//          2. Call the getF(n) (getF(1))
//Expected results: (kết quả kì vọng)
//          getF(1) must return 1