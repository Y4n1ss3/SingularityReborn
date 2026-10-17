package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LineStyleKt {
    private static ImageVector _lineStyle;

    public static final ImageVector getLineStyle(Icons.Filled filled) {
        ImageVector imageVector = _lineStyle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LineStyle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(3.0f, 16.0f, 5.0f, -2.0f, 3.0f);
        k4.D(d, 16.0f, 9.5f, 16.0f, 5.0f);
        k4.p(d, -2.0f, -5.0f, 16.0f);
        k4.C(d, 16.0f, 16.0f, 5.0f, -2.0f);
        uo.r(d, -5.0f, 16.0f, 3.0f, 20.0f);
        gy.t(d, 2.0f, -2.0f, 3.0f, 20.0f);
        k4.C(d, 7.0f, 20.0f, 2.0f, -2.0f);
        bv.s(d, 7.0f, 20.0f, 11.0f, 20.0f);
        bv.l(d, 2.0f, -2.0f, -2.0f, 20.0f);
        k4.C(d, 15.0f, 20.0f, 2.0f, -2.0f);
        uo.r(d, -2.0f, 20.0f, 19.0f, 20.0f);
        bv.l(d, 2.0f, -2.0f, -2.0f, 20.0f);
        k4.C(d, 3.0f, 12.0f, 8.0f, -2.0f);
        bv.s(d, 3.0f, 12.0f, 13.0f, 12.0f);
        bv.l(d, 8.0f, -2.0f, -8.0f, 12.0f);
        bv.y(d, 3.0f, 4.0f, 4.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(d, 4.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lineStyle = build;
        build.getClass();
        return build;
    }
}
