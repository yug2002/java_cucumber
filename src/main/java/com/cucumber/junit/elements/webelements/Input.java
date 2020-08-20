package com.cucumber.junit.elements.webelements;

import com.cucumber.junit.elements.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Input extends Element {

    public Input(By _by) {
        super(_by);
    }

    public Input(WebElement element) {
        super(element);
    }

    public String Value = this.getAttribute("value");

    public void type(CharSequence... keysToSend) {
        this.element.sendKeys(keysToSend);
    }

    public void SendKeysWithTimeOut(String value, int timeOut)
    {
        char[] charArray = value.toCharArray();
        try{
            for (char ch : charArray)
            {
                this.type(ch+"");
                Thread.sleep(timeOut);
            }

        }catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}
