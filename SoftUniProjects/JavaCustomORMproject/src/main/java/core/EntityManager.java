package core;

import annotation.Entity;
import annotation.Id;
import entities.User;
import interfaces.DbContext;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;

public class EntityManager<E> implements DbContext {

    private Connection connection;

    public EntityManager(Connection connection) {
        this.connection = connection;
    }

    public boolean persist(Object entity) throws IllegalAccessException, SQLException {
        Field primaryKey = getId(entity.getClass());
        primaryKey.setAccessible(true);
        Object value = primaryKey.get(entity);
        if ( value == null || (long) value <= 0){
            return doInsert(entity, primaryKey);
        }
        
        return doUpdate(entity, primaryKey);
    }

    private boolean doInsert(Object entity, Field primaryKey) throws SQLException, IllegalAccessException {

        String tableName = this.getTableName(entity.getClass());
        long id = ((User) entity).getId();
        String userName = ((User) entity).getUserName();
        int age = ((User) entity).getAge();
        LocalDate registration = ((User) entity).getRegistration();

        String query = "INSERT INTO " + tableName + " VALUES('" + id + "', '" + userName + "', '" + age + "', '" + registration + "')";

        PreparedStatement prep = connection.prepareStatement(query);

        return prep.execute();
    }

    private String getTableName(Class<?> entity) {

        return entity.getAnnotation(Entity.class).name();
    }

    private boolean doUpdate(Object entity, Field primaryKey) throws SQLException, IllegalAccessException {
        String tableName = this.getTableName(entity.getClass());
        long id = ((User) entity).getId();
        String userName = ((User) entity).getUserName();
        int age = ((User) entity).getAge();
        LocalDate registration = ((User) entity).getRegistration();

        String query = "UPDATE " + tableName + " SET ";


        return connection.prepareStatement(query).execute();
    }

    private Field getId(Class<?> entity) {
        return Arrays.stream(entity.getDeclaredFields())
                .filter(x -> x.isAnnotationPresent(Id.class))
                .findFirst()
                .orElseThrow(() -> new UnsupportedOperationException("Entity does not have primary key."));
    }

    public Iterable find(Class table) {
        return null;
    }

    public Iterable find(Class table, String where) {
        return null;
    }

    public Object findFirst(Class table) {
        return null;
    }

    public Object findFirst(Class table, String where) {
        return null;
    }
}
