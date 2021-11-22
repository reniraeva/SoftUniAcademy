package interfaces;

import classes.MatrixCoords;

public interface IRenderable {
    MatrixCoords GetTopLeft();

    char[][] GetImage();
}
