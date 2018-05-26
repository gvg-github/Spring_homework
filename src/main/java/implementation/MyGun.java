package implementation;

import interfaces.AmmoInterface;
import interfaces.GunInterface;
import org.springframework.stereotype.Component;

/**
 * Created by GVG on 26.05.2018.
 */
public class MyGun implements GunInterface {

    private MyAmmo gunAmmo;

    public void shoot() {
        gunAmmo.reloading();
    }

    public MyAmmo getGunAmmo() {
        return gunAmmo;
    }

    public void setGunAmmo(MyAmmo gunsAmmo) {
        this.gunAmmo = gunsAmmo;
    }
}
