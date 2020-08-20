package com.cucumber.junit.elements;

import com.cucumber.junit.elements.webelements.Button;
import com.cucumber.junit.elements.webelements.Input;
import com.cucumber.junit.elements.webelements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.function.Supplier;

public class ElementFactory<E extends Element> {

    private Supplier<E> supplier;

    public ElementFactory(Supplier<E> supplier){
        this.supplier = supplier;
    }

    public E get(){
        return supplier.get();
    }

    public static ElementFactory<Input> input(By by){
        return new ElementFactory<Input>(() -> new Input(by));
    }

    public static ElementFactory<Link> link(By by){
        return new ElementFactory<>(() -> new Link(by));
    }

    public static ElementFactory<Link> link(WebElement element){
        return new ElementFactory<Link>(() -> new Link(element));
    }

    public static ElementFactory<Button> button(By by){
        return new ElementFactory<Button>(() -> new Button(by));
    }

    public static ElementFactory<Button> button(WebElement element){
        return new ElementFactory<Button>(() -> new Button(element));
    }

    public static ElementFactory<Component> component(WebElement element) { return new ElementFactory<Component>(() -> new Component(element));}

    public static Component component(By by) { return new ElementFactory<Component>(() -> new Component(by)).get();}

}
