package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragHandleShapes {
    public static final int $stable = 0;
    private final Shape draggedShape;
    private final Shape pressedShape;
    private final Shape shape;

    public DragHandleShapes(Shape shape, Shape shape2, Shape shape3) {
        this.shape = shape;
        this.pressedShape = shape2;
        this.draggedShape = shape3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleShapes)) {
            return false;
        }
        DragHandleShapes dragHandleShapes = (DragHandleShapes) obj;
        return q10.b(this.shape, dragHandleShapes.shape) && q10.b(this.pressedShape, dragHandleShapes.pressedShape) && q10.b(this.draggedShape, dragHandleShapes.draggedShape);
    }

    public final Shape getDraggedShape() {
        return this.draggedShape;
    }

    public final Shape getPressedShape() {
        return this.pressedShape;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return this.draggedShape.hashCode() + ((this.pressedShape.hashCode() + (this.shape.hashCode() * 31)) * 31);
    }
}
