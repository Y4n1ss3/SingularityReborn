package androidx.compose.ui.text;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CircleShape implements Shape {
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float m4584getMinDimensionimpl = Size.m4584getMinDimensionimpl(j) / 2.0f;
        long m4470constructorimpl = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(m4584getMinDimensionimpl) << 32) | (Float.floatToRawIntBits(m4584getMinDimensionimpl) & 4294967295L));
        return new Outline.Rounded(RoundRectKt.m4568RoundRectZAM2FJo(SizeKt.m4606toRectuvyYCjk(j), m4470constructorimpl, m4470constructorimpl, m4470constructorimpl, m4470constructorimpl));
    }
}
