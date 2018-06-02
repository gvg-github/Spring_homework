package ru.gvg.spring.lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gvg.spring.lesson3.dao.AdDAO;
import ru.gvg.spring.lesson3.entity.Ad;

import java.util.List;

/**
 * Created by Valeriy on 02.06.2018.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigLesson3.class);
        AdDAO adDAO = context.getBean(AdDAO.class);
        List<Ad> adList = adDAO.getListAd();
        if (adList != null && adList.size() > 0){
            for(Ad ad : adList){
                System.out.println(ad.getName() + ", " + ad.getId() + ", " + ad.getCompany().getName() + ", " + ad.getCategory().getName());
            }
        }
    }
}
