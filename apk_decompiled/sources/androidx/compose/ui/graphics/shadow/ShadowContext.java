package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ShadowContext {
    default DropShadowPainter createDropShadowPainter(Shape shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow);
    }

    default InnerShadowPainter createInnerShadowPainter(Shape shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow);
    }

    default void clearCache() {
    }
}
