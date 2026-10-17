package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class VerticalScrollableClipShape implements Shape {
    public static final VerticalScrollableClipShape INSTANCE = new VerticalScrollableClipShape();

    private VerticalScrollableClipShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        return new Outline.Rectangle(new Rect(-mo361roundToPx0680j_4, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + mo361roundToPx0680j_4, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
