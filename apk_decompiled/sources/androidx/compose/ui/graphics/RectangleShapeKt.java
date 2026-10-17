package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RectangleShapeKt {
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @Override // androidx.compose.ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
            return new Outline.Rectangle(SizeKt.m4606toRectuvyYCjk(j));
        }

        public String toString() {
            return "RectangleShape";
        }
    };

    public static final Shape getRectangleShape() {
        return RectangleShape;
    }

    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
