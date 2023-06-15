/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.helloworld.mathutil.core.test;

import static org.helloworld.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilityAdvancedTest {
    //Tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    //gồm n đưa vào và expected trả về
    //int               long -> object (wrapper class
    //                                  Integer Long
    public static Object[][] initTestData(){
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 120}};
        return  testData;
    }
    
    //ngồi data này vào hàm assertE()
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        //assertEquals(69,69);
        assertEquals(expected, getFactorial(n));
    }
} 
//TDD: Test Driven Development là kĩ thuật lập trình mà 
// gắn với việc viết các test case để kiểm thử ngay những hàm dev mình vừa viết
// Viết code chính và viết code test (JUnit, Unit Test) xen kẽ với nhau.
// 2 màu xảnh đỏ liên tục diễn ra

//DDT: sự mở rộng thêm cho quá trình viết code test (JUnit)
// Data Driven Testing
// kĩ thuật tách bộ test data ra 1 chỗ riêng, tách vào mảng
// , tách vào file Excel, hay table, sau đó nhồi/fill/map cái data từ mảng này
//vào trong hàm so sánh assertEquals() 
//Giúp code dễ đọc hơn, dễ kiểm tra xem còn thiếu test case nào hay do