/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.helloworld.mathutil.core.test;

import static org.helloworld.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69,69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }
}

//DDT Là 1 phần mở rộng của các unit test framework
//Data Driven Testing
        //Không nhầm với TDD: test driven development
                            //viết code và viết test case song hành
                            //với nhau, đã học xong
//Nhưng code test bốc mùi (bad smells) trùng code nhiều
//nên người ta chế ra cách viết code test đẹp hơn, gọn hơn, dễ bảo trì hơn
