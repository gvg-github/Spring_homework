package implementation;

import interfaces.AmmoInterface;
import org.springframework.stereotype.Component;

/**
 * Created by GVG on 26.05.2018.
 */

@Component("standartAmmo")
public class MyAmmo implements AmmoInterface {

    public void reloading() {
        System.out.println("gun reloaded!");
    }
}
