package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Shapes {
    public static final int $stable = 0;
    private DragHandleShapes defaultVerticalDragHandleShapesCached;
    private final CornerBasedShape extraExtraLarge;
    private final CornerBasedShape extraLarge;
    private final CornerBasedShape extraLargeIncreased;
    private final CornerBasedShape extraSmall;
    private final CornerBasedShape large;
    private final CornerBasedShape largeIncreased;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8, int i, dq dqVar) {
        this((i & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5, (i & 32) != 0 ? ShapeDefaults.INSTANCE.getLargeIncreased$material3() : cornerBasedShape6, (i & 64) != 0 ? ShapeDefaults.INSTANCE.getExtraLargeIncreased$material3() : cornerBasedShape7, (i & Fields.SpotShadowColor) != 0 ? ShapeDefaults.INSTANCE.getExtraExtraLarge$material3() : cornerBasedShape8);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        if ((i & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        if ((i & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        if ((i & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        CornerBasedShape cornerBasedShape6 = cornerBasedShape5;
        CornerBasedShape cornerBasedShape7 = cornerBasedShape3;
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape7, cornerBasedShape4, cornerBasedShape6);
    }

    public static /* synthetic */ Shapes copy$material3$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        if ((i & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        if ((i & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        if ((i & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        if ((i & 32) != 0) {
            cornerBasedShape6 = shapes.largeIncreased;
        }
        if ((i & 64) != 0) {
            cornerBasedShape7 = shapes.extraLargeIncreased;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            cornerBasedShape8 = shapes.extraExtraLarge;
        }
        CornerBasedShape cornerBasedShape9 = cornerBasedShape7;
        CornerBasedShape cornerBasedShape10 = cornerBasedShape8;
        CornerBasedShape cornerBasedShape11 = cornerBasedShape5;
        CornerBasedShape cornerBasedShape12 = cornerBasedShape6;
        return shapes.copy$material3(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape11, cornerBasedShape12, cornerBasedShape9, cornerBasedShape10);
    }

    public final Shapes copy(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5) {
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5);
    }

    public final Shapes copy$material3(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8) {
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5, cornerBasedShape6, cornerBasedShape7, cornerBasedShape8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return q10.b(this.extraSmall, shapes.extraSmall) && q10.b(this.small, shapes.small) && q10.b(this.medium, shapes.medium) && q10.b(this.large, shapes.large) && q10.b(this.extraLarge, shapes.extraLarge) && q10.b(this.largeIncreased, shapes.largeIncreased) && q10.b(this.extraLargeIncreased, shapes.extraLargeIncreased) && q10.b(this.extraExtraLarge, shapes.extraExtraLarge);
    }

    public final DragHandleShapes getDefaultVerticalDragHandleShapesCached$material3() {
        return this.defaultVerticalDragHandleShapesCached;
    }

    public final CornerBasedShape getExtraExtraLarge$material3() {
        return this.extraExtraLarge;
    }

    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    public final CornerBasedShape getExtraLargeIncreased$material3() {
        return this.extraLargeIncreased;
    }

    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
    }

    public final CornerBasedShape getLarge() {
        return this.large;
    }

    public final CornerBasedShape getLargeIncreased$material3() {
        return this.largeIncreased;
    }

    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return this.extraExtraLarge.hashCode() + ((this.extraLargeIncreased.hashCode() + ((this.largeIncreased.hashCode() + ((this.extraLarge.hashCode() + ((this.large.hashCode() + ((this.medium.hashCode() + ((this.small.hashCode() + (this.extraSmall.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setDefaultVerticalDragHandleShapesCached$material3(DragHandleShapes dragHandleShapes) {
        this.defaultVerticalDragHandleShapesCached = dragHandleShapes;
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", largeIncreased=" + this.largeIncreased + ", extraLarge=" + this.extraLarge + ", extralargeIncreased=" + this.extraLargeIncreased + ", extraExtraLarge=" + this.extraExtraLarge + ')';
    }

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8) {
        this.extraSmall = cornerBasedShape;
        this.small = cornerBasedShape2;
        this.medium = cornerBasedShape3;
        this.large = cornerBasedShape4;
        this.extraLarge = cornerBasedShape5;
        this.largeIncreased = cornerBasedShape6;
        this.extraLargeIncreased = cornerBasedShape7;
        this.extraExtraLarge = cornerBasedShape8;
    }

    public Shapes() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i, dq dqVar) {
        this((i & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5) {
        this(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5, r0.getLargeIncreased$material3(), r0.getExtraLargeIncreased$material3(), r0.getExtraExtraLarge$material3());
        ShapeDefaults shapeDefaults = ShapeDefaults.INSTANCE;
    }
}
