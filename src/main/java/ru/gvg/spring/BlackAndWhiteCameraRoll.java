package ru.gvg.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Valeriy on 30.05.2018.
 */
@Component("cameraRoll")
@UnproducableCameraRoll(usingCameraRollClass = ColorCameraRoll.class)
public class BlackAndWhiteCameraRoll implements CameraRoll {
    public void processing() {

        System.out.println("-1 черно-белый кадр");

    }
}
