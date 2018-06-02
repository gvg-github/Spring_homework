package ru.gvg.spring.lesson2.mycamera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import ru.gvg.spring.lesson2.component.Camera;
import ru.gvg.spring.lesson2.component.CameraRoll;

import javax.annotation.PostConstruct;

/**
 * Created by Valeriy on 30.05.2018.
 */
//@Component("camera")
//@Scope("prototype")
public class UsedCameraImpl implements Camera {

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
            System.out.println("Фотография некачественная!");
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
