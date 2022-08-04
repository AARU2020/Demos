package com.insurejoy.hello.my_first_system;


import org.testng.Assert;  
import org.testng.annotations.Test;  
public class Dem01 {  
@Test  
public void sum() {  
System.out.print("Sum method");  
System.out.print("Sum2 method"); 
System.out.print("Sum3 method"); 
System.out.print("Sum4 method"); 
System.out.println("y2 methods");
int p=10;  
int q=20;  
Assert.assertEquals(30, p+q);  
}  
@Test  
public void sub() {  
System.out.print("Sub method");  
int p=20;  
int q=10;  
Assert.assertEquals(10, p-q);  
}  
}  