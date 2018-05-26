package implementation;

import interfaces.GunInterface;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by GVG on 26.05.2018.
 */

public class MyGunFromJavaConfig implements GunInterface {

    @Autowired
    private MyAmmoFromJavaConfig gunAmmo;

    public void shoot() {
        gunAmmo.reloading();
    }

    public MyAmmoFromJavaConfig getGunAmmo() {
        return gunAmmo;
    }

    public void setGunAmmo(MyAmmoFromJavaConfig gunsAmmo) {
        this.gunAmmo = gunsAmmo;
    }
}
