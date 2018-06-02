package ru.gvg.spring.lesson2.component;

import org.springframework.stereotype.Component;

/**
 * Created by Valeriy on 30.05.2018.
 */
@Component("cameraRoll")
public class ColorCameraRoll implements CameraRoll {
    public void processing() {
        // TODO Auto-generated method stub
        System.out.println("-1 цветной кадр");

    }
}
