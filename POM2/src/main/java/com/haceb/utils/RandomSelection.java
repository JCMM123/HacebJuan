package com.haceb.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomSelection {
    public static WebElement selectRandom(List<WebElement> items){
        Random random = new Random();
        int index = random.nextInt(items.size());
        return items.get(index);
    }
}
