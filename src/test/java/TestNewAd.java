import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import ru.gvg.spring.lesson3.AppConfigLesson3;
import ru.gvg.spring.lesson3.dao.AdDAO;
import ru.gvg.spring.lesson3.dao.CategoryDAO;
import ru.gvg.spring.lesson3.dao.CompanyDAO;
import ru.gvg.spring.lesson3.entity.Ad;
import ru.gvg.spring.lesson3.entity.Category;
import ru.gvg.spring.lesson3.entity.Company;

/**
 * Created by Valeriy on 02.06.2018.
 */
public class TestNewAd {

    final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigLesson3.class);
    final CompanyDAO companyDAO = context.getBean(CompanyDAO.class);
    final CategoryDAO categoryDAO = context.getBean(CategoryDAO.class);
    final AdDAO adDAO = context.getBean(AdDAO.class);

    @Test
    public void createNewAd() {
        final Company company = companyDAO.merge(new Company("Company1", "Company1", "Address1"));
        final Category category = categoryDAO.merge(new Category("Category1"));
        Ad ad = new Ad();
        ad.setCategory(category);
        ad.setCompany(company);
        ad.setContent("Content1");
        ad.setName("Ad1");
        ad.setPhoneNumber("Number1");
        adDAO.merge(ad);
    }
}
