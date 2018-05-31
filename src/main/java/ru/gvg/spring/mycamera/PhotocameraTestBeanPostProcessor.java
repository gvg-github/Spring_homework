package ru.gvg.spring.mycamera;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.gvg.spring.Camera;

/**
 * Created by Valeriy on 30.05.2018.
 */
@Component
public class PhotocameraTestBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // В данном методе просто возвращаем бин
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // Находим бин класса фотокамеры
        if (bean instanceof Camera) {
            // Делаем пробное фото
            System.out.println("Делаю пробное фото!");
            ((Camera) bean).doPhotograph();
//            System.out.println("Отлично! Работает!");
        }
        return bean;
    }
}
