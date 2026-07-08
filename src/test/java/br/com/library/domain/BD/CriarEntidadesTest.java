package br.com.library.domain.BD;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class CriarEntidadesTest {

    @Test
    void DeveCriarEntidades() {
        SessionFactory sessionFactory = new Configuration()
                .configure().buildSessionFactory();

        sessionFactory.close();
    }
}
