package ru.Albiz19.java2020.pr31;

import org.junit.Assert;
import org.junit.Test;

public class main {
    @Test
    public void test(){
        MyClass myClass = new MyClass(10, 30, '*');
        Assert.assertNotNull(myClass);
    }
    @Test
    public void test1(){
        MyClass myClass = new MyClass(200, 23,'-');
        Assert.assertEquals(178.0, myClass.getResult(),1.5); //сравниваем 178 и результат. Расхождение
        //меньше 1.5 - равны
    }
}
