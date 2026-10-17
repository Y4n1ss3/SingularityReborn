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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmartToyKt {
    private static ImageVector _smartToy;

    public static final ImageVector getSmartToy(Icons.Sharp sharp) {
        ImageVector imageVector = _smartToy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SmartToy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(20.0f, 9.0f, 5.0f, -5.0f, 2.0f);
        af0.o(c, 9.0f, 3.0f, 4.0f, 4.0f);
        uf.k(c, 1.0f, 6.0f, 3.0f, 6.0f);
        af0.w(c, 16.0f, -6.0f, 3.0f, 9.0f);
        k4.w(c, 20.0f, 7.5f, 11.5f);
        c.curveTo(7.5f, 10.67f, 8.17f, 10.0f, 9.0f, 10.0f);
        c.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        c.reflectiveCurveTo(9.83f, 13.0f, 9.0f, 13.0f);
        c.reflectiveCurveTo(7.5f, 12.33f, 7.5f, 11.5f);
        uo.q(c, 16.0f, 17.0f, 8.0f, -2.0f);
        uo.r(c, 8.0f, 17.0f, 15.0f, 13.0f);
        c.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        c.reflectiveCurveTo(14.17f, 10.0f, 15.0f, 10.0f);
        c.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 15.83f, 13.0f, 15.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartToy = build;
        build.getClass();
        return build;
    }
}
