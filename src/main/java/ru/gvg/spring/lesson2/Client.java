package ru.gvg.spring.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gvg.spring.lesson2.component.AppConfig;
import ru.gvg.spring.lesson2.component.Camera;

/**
 * Created by Valeriy on 30.05.2018.
 */
public class Client{
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Camera camera = context.getBean("camera",Camera.class);
        camera.breaking();
        camera.doPhotograph();

        camera = context.getBean("camera",Camera.class);
        camera.doPhotograph();
    }
}
