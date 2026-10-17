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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BusAlertKt {
    private static ImageVector _busAlert;

    public static final ImageVector getBusAlert(Icons.Sharp sharp) {
        ImageVector imageVector = _busAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BusAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(4.0f, 11.0f, 8.0f, 7.29f);
        c.curveToRelative(-0.77f, -2.6f, 0.21f, -4.61f, 0.37f, -4.97f);
        c.curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f);
        c.verticalLineToRelative(9.5f);
        c.curveToRelative(0.0f, 0.95f, 0.38f, 1.81f, 1.0f, 2.44f);
        uf.p(c, 22.0f, 3.0f, -2.0f, 8.0f);
        kf0.z(c, 2.0f, 3.0f, -3.06f);
        c.curveToRelative(0.62f, -0.63f, 1.0f, -1.49f, 1.0f, -2.44f);
        c.verticalLineTo(13.0f);
        c.curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f);
        k4.w(c, 4.0f, 6.5f, 17.0f);
        c.curveTo(5.67f, 17.0f, 5.0f, 16.33f, 5.0f, 15.5f);
        c.reflectiveCurveTo(5.67f, 14.0f, 6.5f, 14.0f);
        c.reflectiveCurveTo(8.0f, 14.67f, 8.0f, 15.5f);
        c.reflectiveCurveTo(7.33f, 17.0f, 6.5f, 17.0f);
        c.close();
        c.moveTo(15.0f, 15.5f);
        c.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        c.reflectiveCurveTo(12.0f, 16.33f, 12.0f, 15.5f);
        c.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 15.0f, 14.67f, 15.0f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 1.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        af0.r(b, 18.5f, 9.0f, -1.0f, 8.0f);
        uo.r(b, 1.0f, 9.0f, 18.5f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(b, -1.0f, 3.0f, 1.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _busAlert = build;
        build.getClass();
        return build;
    }
}
