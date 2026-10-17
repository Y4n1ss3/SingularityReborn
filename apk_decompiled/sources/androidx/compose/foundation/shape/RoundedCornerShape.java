package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public RoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo1039createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m4606toRectuvyYCjk(j));
        }
        Rect m4606toRectuvyYCjk = SizeKt.m4606toRectuvyYCjk(j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long m4470constructorimpl = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long m4470constructorimpl2 = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long m4470constructorimpl3 = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new Outline.Rounded(RoundRectKt.m4568RoundRectZAM2FJo(m4606toRectuvyYCjk, m4470constructorimpl, m4470constructorimpl2, m4470constructorimpl3, CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return q10.b(getTopStart(), roundedCornerShape.getTopStart()) && q10.b(getTopEnd(), roundedCornerShape.getTopEnd()) && q10.b(getBottomEnd(), roundedCornerShape.getBottomEnd()) && q10.b(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        if (q10.b(obj, RectangleShapeKt.getRectangleShape()) || obj == null) {
            obj = RoundedCornerShapeKt.RoundedCornerShape(0.0f);
        }
        if (obj instanceof RoundedCornerShape) {
            return RoundedCornerShapeKt.lerp(this, (RoundedCornerShape) obj, f);
        }
        return null;
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
