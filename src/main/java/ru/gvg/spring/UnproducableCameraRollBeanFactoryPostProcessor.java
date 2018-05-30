package ru.gvg.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Valeriy on 30.05.2018.
 */
@Component
public class UnproducableCameraRollBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // Получаем имена всех BeanDefinition для доступа к каждому из них
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        // Перебираем все имена
        for (String name : beanDefinitionNames) {
            // Получаем BeanDefinition по имени
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            /*Получаем имя класса создаваемого бина, чтобы проверить,
            * содержит ли он аннотацию UnsupportedCameraRoll
            */
            String className = beanDefinition.getBeanClassName();
            try {
                // Получаем класс по имени
                Class<?> beanClass = Class.forName(className);
                /*Пытаемся получить объект аннотации и ее значение,
                * если класс не содержит данную аннотацию, то метод вернет null
                */
                UnproducableCameraRoll annotation = beanClass.getAnnotation(UnproducableCameraRoll.class);
                // Проверяем, содержал ли класс эту аннотацию
                if (annotation != null) {
                    // Получаем значение, указанное в параметрах аннотации (класс пленки, которую необходимо использовать)
                    Class usingCameraRollName = annotation.usingCameraRollClass();
                    // Меняем класс будущего бина
                    beanDefinition.setBeanClassName(usingCameraRollName.getName());
                }
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
