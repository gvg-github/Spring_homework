import implementation.MyGun;
import implementation.MyGunFromJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GVG on 26.05.2018.
 */
public class Client {

    private MyGun leftGun;
    private MyGunFromJavaConfig rigthGun;

    public void setLeftGun(MyGun leftGun) {
        this.leftGun = leftGun;
    }

    public void setRigthGun(MyGunFromJavaConfig rigthGun) {
        this.rigthGun = rigthGun;
    }

    public void shoot() {
        if (leftGun != null) {
            leftGun.shoot();
        }
        if (rigthGun != null) {
            rigthGun.shoot();
        }
    }

    public static void main(String[] args) {

        Client newClient = new Client();

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        MyGun gun = context.getBean("gun", MyGun.class);

        ApplicationContext contextConfig = new AnnotationConfigApplicationContext(AppConfig.class);
        MyGunFromJavaConfig gunConfig = contextConfig.getBean("gun", MyGunFromJavaConfig.class);

        newClient.setLeftGun(gun);
        newClient.setRigthGun(gunConfig);

        newClient.shoot();
        newClient.shoot();
    }
}
