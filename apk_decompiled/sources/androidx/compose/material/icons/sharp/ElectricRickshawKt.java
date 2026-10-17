package androidx.compose.material.icons.sharp;

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
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElectricRickshawKt {
    private static ImageVector _electricRickshaw;

    public static final ImageVector getElectricRickshaw(Icons.Sharp sharp) {
        ImageVector imageVector = _electricRickshaw;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ElectricRickshaw", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = bv.i(21.0f, 11.18f, 9.0f, -5.0f, -6.0f);
        af0.u(i, 1.0f, 12.0f, 2.18f);
        i.curveTo(3.6f, 16.16f, 4.7f, 17.0f, 6.0f, 17.0f);
        i.reflectiveCurveToRelative(2.4f, -0.84f, 2.82f, -2.0f);
        i.horizontalLineToRelative(8.37f);
        i.curveToRelative(0.48f, 1.34f, 1.86f, 2.25f, 3.42f, 1.94f);
        i.curveToRelative(1.16f, -0.23f, 2.11f, -1.17f, 2.33f, -2.33f);
        i.curveTo(23.25f, 13.05f, 22.34f, 11.66f, 21.0f, 11.18f);
        c21.d(i, 18.4f, 9.0f, 16.0f, 6.12f);
        uo.l(i, 18.4f, 9.0f, 3.0f, 5.0f);
        gy.t(i, 4.0f, 4.0f, 3.0f, 5.0f);
        i.moveTo(6.0f, 15.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveTo(6.55f, 15.0f, 6.0f, 15.0f);
        uo.C(i, 9.0f, 13.0f, -2.0f, 3.0f);
        uo.m(i, 9.0f, 9.0f, 5.0f, 5.0f);
        kf0.n(i, 8.0f, 9.0f, 20.0f, 15.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 20.55f, 15.0f, 20.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(7.0f, 20.0f, 4.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        e.lineToRelative(6.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -4.0f, 0.0f, 0.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricRickshaw = build;
        build.getClass();
        return build;
    }
}
