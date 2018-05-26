
import implementation.MyAmmoFromJavaConfig;
import implementation.MyGunFromJavaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by GVG on 26.05.2018.
 */
@Configuration
public class AppConfig {

    @Bean()
    public MyAmmoFromJavaConfig ammo() {
        return new MyAmmoFromJavaConfig();
    }

    @Bean(name = "gun")
    public MyGunFromJavaConfig gun() {
        MyGunFromJavaConfig gun = new MyGunFromJavaConfig();
        return gun;
    }

}
