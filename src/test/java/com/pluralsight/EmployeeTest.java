package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void whenEmployeePunchInAndOut_SaveCorrectHoursWorked(){
        //Create Employee object
        Employee newbie = new Employee("Marq",20);

        //clock in and out employee
        newbie.punchTimeCard(10);
        newbie.punchTimeCard(20);

        //Check time card hours
        assertEquals(10, newbie.getRegularHours());
    }

    @Test
    void calculateAccuratePayForEmployee() {

        //Create Employee object to test
        Employee newbie = new Employee("Marq",50,20);

        // Call method to get total pay from employee
        newbie.getTotalPay();

        //Verify calculation
        assertEquals(1100,newbie.getTotalPay());

    }
}