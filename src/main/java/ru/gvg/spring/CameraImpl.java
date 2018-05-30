package ru.gvg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Valeriy on 30.05.2018.
 */
@Component("camera")
public class CameraImpl implements Camera{

    @Autowired
    @Qualifier("cameraRoll")
    private CameraRoll cameraRoll;


    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }


    public void doPhotograph() {

        System.out.println("Сделана фотография!");

        cameraRoll.processing();


    }

    public void breaking() {

    }

    public boolean isBroken() {
        return false;
    }
}
