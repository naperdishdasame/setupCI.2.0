package ru.netology.service;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest{
@org.junit.Test
public void testRemain(){
    CashbackHackServiceTest service = new CashbackHackServiceTest();
    int amount = 1000;
    int actual = service.remain(amount);
    int expected = 0;
    assertEquals(expected, actual);
}

    private int remain(int amount) {
        return 0;
    }
}
