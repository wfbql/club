import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class GetConnection {
    @SuppressWarnings("resource")
    @Test
    public void testDataSources() throws SQLException {

        ApplicationContext ac = null;
        {
            ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        }
        DataSource dataSource=ac.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}

