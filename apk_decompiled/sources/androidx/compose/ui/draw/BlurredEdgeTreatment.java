package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion(null);
    private static final Shape Rectangle = m4282constructorimpl(RectangleShapeKt.getRectangleShape());
    private static final Shape Unbounded = m4282constructorimpl(null);
    private final Shape shape;

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m4281boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4283equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && q10.b(shape, ((BlurredEdgeTreatment) obj).m4287unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4284equalsimpl0(Shape shape, Shape shape2) {
        return q10.b(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4285hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4286toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m4283equalsimpl(this.shape, obj);
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m4285hashCodeimpl(this.shape);
    }

    public String toString() {
        return m4286toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m4287unboximpl() {
        return this.shape;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m4288getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m4289getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m4282constructorimpl(Shape shape) {
        return shape;
    }
}
