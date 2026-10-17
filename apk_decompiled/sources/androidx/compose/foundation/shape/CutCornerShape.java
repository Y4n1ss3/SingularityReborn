package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public CutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public CutCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new CutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo1039createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m4606toRectuvyYCjk(j));
        }
        Path Path = AndroidPath_androidKt.Path();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        Path.moveTo(0.0f, f5);
        Path.lineTo(f5, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f = f2;
        }
        int i = (int) (j >> 32);
        Path.lineTo(Float.intBitsToFloat(i) - f, 0.0f);
        Path.lineTo(Float.intBitsToFloat(i), f);
        float f6 = layoutDirection == layoutDirection2 ? f3 : f4;
        int i2 = (int) (j & 4294967295L);
        Path.lineTo(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - f6);
        Path.lineTo(Float.intBitsToFloat(i) - f6, Float.intBitsToFloat(i2));
        if (layoutDirection == layoutDirection2) {
            f3 = f4;
        }
        Path.lineTo(f3, Float.intBitsToFloat(i2));
        Path.lineTo(0.0f, Float.intBitsToFloat(i2) - f3);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        return q10.b(getTopStart(), cutCornerShape.getTopStart()) && q10.b(getTopEnd(), cutCornerShape.getTopEnd()) && q10.b(getBottomEnd(), cutCornerShape.getBottomEnd()) && q10.b(getBottomStart(), cutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        if (q10.b(obj, RectangleShapeKt.getRectangleShape()) || obj == null) {
            obj = CutCornerShapeKt.CutCornerShape(0.0f);
        }
        if (obj instanceof CutCornerShape) {
            return CutCornerShapeKt.lerp(this, (CutCornerShape) obj, f);
        }
        return null;
    }

    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
