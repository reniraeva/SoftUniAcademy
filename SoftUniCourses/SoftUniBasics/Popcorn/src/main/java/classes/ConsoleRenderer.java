package classes;

import interfaces.IRenderable;
import interfaces.IRenderer;

public class ConsoleRenderer implements IRenderer {

    int renderContextMatrixRows;
    int renderContextMatrixCols;
    char[][] renderContextMatrix;

    @Override
    public void EnqueueForRendering(IRenderable obj) {

    }

    @Override
    public void RenderAll() {

    }

    @Override
    public void ClearQueue() {

    }
}
