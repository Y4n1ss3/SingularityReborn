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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CalculateKt {
    private static ImageVector _calculate;

    public static final ImageVector getCalculate(Icons.Filled filled) {
        ImageVector imageVector = _calculate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Calculate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        k4.r(d, 13.03f, 7.06f, 14.09f, 6.0f);
        d.lineToRelative(1.41f, 1.41f);
        d.lineTo(16.91f, 6.0f);
        d.lineToRelative(1.06f, 1.06f);
        d.lineToRelative(-1.41f, 1.41f);
        d.lineToRelative(1.41f, 1.41f);
        d.lineToRelative(-1.06f, 1.06f);
        d.lineTo(15.5f, 9.54f);
        d.lineToRelative(-1.41f, 1.41f);
        d.lineToRelative(-1.06f, -1.06f);
        gy.B(d, 1.41f, -1.41f, 13.03f, 7.06f);
        k4.C(d, 6.25f, 7.72f, 5.0f, 1.5f);
        uo.r(d, -5.0f, 7.72f, 11.5f, 16.0f);
        af0.z(d, -2.0f, 2.0f, 8.0f, -2.0f);
        uf.k(d, 6.0f, -1.5f, 2.0f, -2.0f);
        bv.l(d, 1.5f, 2.0f, 2.0f, 16.0f);
        k4.C(d, 18.0f, 17.25f, -5.0f, -1.5f);
        uo.r(d, 5.0f, 17.25f, 18.0f, 14.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(d, -5.0f, -1.5f, 5.0f, 14.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _calculate = build;
        build.getClass();
        return build;
    }
}
