package ru.gvg.spring;

/**
 * Created by Valeriy on 30.05.2018.
 */
public interface Camera {

    CameraRoll getCameraRoll();

    void setCameraRoll(CameraRoll cameraRoll);

    void doPhotograph();

    void breaking();

    boolean isBroken();

    void ready();

}
