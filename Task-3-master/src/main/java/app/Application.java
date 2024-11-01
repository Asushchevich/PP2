package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalsCage animalsCage = context.getBean(AnimalsCage.class);

        animalsCage.whatAnimalSay();
        animalsCage.whatAnimalSay();
    }

}
