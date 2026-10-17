package androidx.compose.ui.graphics;

import defpackage.ac;
import defpackage.dq;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorMatrixColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private float[] colorMatrix;

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m4621actualColorMatrixColorFilterjHGOpc(fArr), null);
    }

    /* renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m4837copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = ColorMatrix.m4818constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m4839copyColorMatrixgBh15pI(fArr);
    }

    /* renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m4838obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return fArr;
        }
        float[] actualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics());
        this.colorMatrix = actualColorMatrixFromFilter;
        return actualColorMatrixFromFilter;
    }

    /* renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m4839copyColorMatrixgBh15pI(float[] fArr) {
        ac.N(r1, fArr, 0, 0, (r3 & 8) != 0 ? m4838obtainColorMatrixp10uLo().length : 6);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(m4838obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m4838obtainColorMatrixp10uLo());
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m4824hashCodeimpl(fArr);
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        sb.append((Object) (fArr == null ? "null" : ColorMatrix.m4835toStringimpl(fArr)));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, dq dqVar) {
        this(fArr, colorFilter);
    }

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, dq dqVar) {
        this(fArr);
    }
}
