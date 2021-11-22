package interfaces;

import classes.CollisionData;
import classes.MatrixCoords;
import java.util.List;

public interface ICollidable {

    boolean CanCollideWith(String objectType);

    List<MatrixCoords> GetCollisionProfile();

    void RespondToCollision(CollisionData collisionData);

    String GetCollisionGroupString();
}
