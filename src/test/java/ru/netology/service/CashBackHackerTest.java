package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void shouldRemainAdd100IfAmount900() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(900);
        int expected = 200;
        Assert.assertEquals(actual, expected);
        }
    }
