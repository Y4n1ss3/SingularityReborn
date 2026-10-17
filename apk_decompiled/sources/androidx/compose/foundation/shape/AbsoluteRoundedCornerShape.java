package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteRoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    /* renamed from: toRadius-Bz7bX_o, reason: not valid java name */
    private final long m1043toRadiusBz7bX_o(float f) {
        return CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteRoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo1039createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m4606toRectuvyYCjk(j));
        }
        return new Outline.Rounded(RoundRectKt.m4568RoundRectZAM2FJo(SizeKt.m4606toRectuvyYCjk(j), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return q10.b(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && q10.b(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && q10.b(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && q10.b(getBottomStart(), absoluteRoundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        if (q10.b(obj, RectangleShapeKt.getRectangleShape()) || obj == null) {
            obj = AbsoluteRoundedCornerShapeKt.AbsoluteRoundedCornerShape(0.0f);
        }
        if (obj instanceof AbsoluteRoundedCornerShape) {
            return AbsoluteRoundedCornerShapeKt.lerp(this, (AbsoluteRoundedCornerShape) obj, f);
        }
        return null;
    }

    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }
}
