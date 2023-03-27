package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @Test
    public void shouldRemainAdd100IfAmount900() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAdd700IfAmount300() {
        CashBackHacker service = new CashBackHacker();
        int amount = 300;
        int actual = service.remain(300);
        int expected = 700;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAdd1000IfAmount0() {
        CashBackHacker service = new CashBackHacker();
        int amount = 0;
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAdd600IfAmount400() {
        CashBackHacker service = new CashBackHacker();
        int amount = 400;
        int actual = service.remain(400);
        int expected = 600;
        Assert.assertEquals(actual, expected);
    }
}
