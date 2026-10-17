package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape, Interpolatable {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final CornerBasedShape copy(CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo1039createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float mo1047toPxTmRCtEA = this.topStart.mo1047toPxTmRCtEA(j, density);
        float mo1047toPxTmRCtEA2 = this.topEnd.mo1047toPxTmRCtEA(j, density);
        float mo1047toPxTmRCtEA3 = this.bottomEnd.mo1047toPxTmRCtEA(j, density);
        float mo1047toPxTmRCtEA4 = this.bottomStart.mo1047toPxTmRCtEA(j, density);
        float m4584getMinDimensionimpl = Size.m4584getMinDimensionimpl(j);
        float f = mo1047toPxTmRCtEA + mo1047toPxTmRCtEA4;
        if (f > m4584getMinDimensionimpl) {
            float f2 = m4584getMinDimensionimpl / f;
            mo1047toPxTmRCtEA *= f2;
            mo1047toPxTmRCtEA4 *= f2;
        }
        float f3 = mo1047toPxTmRCtEA2 + mo1047toPxTmRCtEA3;
        if (f3 > m4584getMinDimensionimpl) {
            float f4 = m4584getMinDimensionimpl / f3;
            mo1047toPxTmRCtEA2 *= f4;
            mo1047toPxTmRCtEA3 *= f4;
        }
        if (!(mo1047toPxTmRCtEA >= 0.0f && mo1047toPxTmRCtEA2 >= 0.0f && mo1047toPxTmRCtEA3 >= 0.0f && mo1047toPxTmRCtEA4 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Corner size in Px can't be negative(topStart = " + mo1047toPxTmRCtEA + ", topEnd = " + mo1047toPxTmRCtEA2 + ", bottomEnd = " + mo1047toPxTmRCtEA3 + ", bottomStart = " + mo1047toPxTmRCtEA4 + ")!");
        }
        return mo1039createOutlineLjSzlW0(j, mo1047toPxTmRCtEA, mo1047toPxTmRCtEA2, mo1047toPxTmRCtEA3, mo1047toPxTmRCtEA4, layoutDirection);
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }

    public Object lerp(Object obj, float f) {
        return null;
    }
}
