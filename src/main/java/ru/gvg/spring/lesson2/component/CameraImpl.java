package ru.gvg.spring.lesson2.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.gvg.spring.lesson2.mycamera.UsedCamera;
import ru.gvg.spring.lesson2.mycamera.UsedCameraImpl;

import javax.annotation.PostConstruct;

/**
 * Created by Valeriy on 30.05.2018.
 */
@Component("camera")
@Scope("prototype")
@UsedCamera(usingUsedCameraClass = UsedCameraImpl.class)
public class CameraImpl implements Camera {

    @Autowired
    @Qualifier("cameraRoll")
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;


    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }


    public void doPhotograph() {

        if (broken) {
            System.out.println("Фотоаппарат сломан!");
            return;
        } else {
            System.out.println("Сделана фотография!");
            cameraRoll.processing();
        }
    }

    public void breaking() {
        this.broken = true;
    }

    public boolean isBroken() {
        return broken;
    }

    @PostConstruct
    public void ready() {
        System.out.println("Фотоаппарат готов к использованию!");
    }


}
