package lesson25.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(new Class[]{AppConfig.class});
        Camera camera = (Camera)context.getBean(Camera.class);
        camera.doPhotograph();
    }
}

