import core.EntityManager;
import entities.User;
import orm.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class ApplicationStarter {

    public static void main(String[] args) throws SQLException, IllegalAccessException {
        Connector.createConnection("root", "1324", "home");

        Connection connection = Connector.getConnection();
        EntityManager<User> entityManager = new EntityManager<User>(connection);

        User user = new User("Gosho", 30, LocalDate.of(2021, 11, 21));

        entityManager.persist(user);

    }
}
