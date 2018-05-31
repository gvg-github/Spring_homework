package ru.gvg.spring.example_from_manual;

import org.springframework.stereotype.Component;
import ru.gvg.spring.CameraRoll;
import ru.gvg.spring.ColorCameraRoll;

/**
 * Created by Valeriy on 30.05.2018.
 */
//@Component("cameraRoll")
//@UnproducableCameraRoll(usingCameraRollClass = ColorCameraRoll.class)
public class BlackAndWhiteCameraRoll implements CameraRoll {
    public void processing() {

        System.out.println("-1 черно-белый кадр");

    }
}
