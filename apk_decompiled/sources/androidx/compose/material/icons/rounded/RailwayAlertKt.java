package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RailwayAlertKt {
    private static ImageVector _railwayAlert;

    public static final ImageVector getRailwayAlert(Icons.Rounded rounded) {
        ImageVector imageVector = _railwayAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RailwayAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        c.curveTo(2.0f, 18.43f, 3.57f, 20.0f, 5.5f, 20.0f);
        c.lineToRelative(-1.21f, 0.81f);
        c.curveTo(4.11f, 20.93f, 4.0f, 21.13f, 4.0f, 21.35f);
        c.verticalLineToRelative(0.0f);
        c.curveTo(4.0f, 21.71f, 4.29f, 22.0f, 4.65f, 22.0f);
        c.horizontalLineToRelative(10.7f);
        c.curveToRelative(0.36f, 0.0f, 0.65f, -0.29f, 0.65f, -0.65f);
        c.verticalLineToRelative(0.0f);
        c.curveToRelative(0.0f, -0.22f, -0.11f, -0.42f, -0.29f, -0.54f);
        c.lineTo(14.5f, 20.0f);
        c.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        c.verticalLineTo(13.0f);
        c.curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f);
        k4.w(c, 4.0f, 10.0f, 17.0f);
        c.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        c.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        c.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        c.curveTo(11.5f, 16.33f, 10.83f, 17.0f, 10.0f, 17.0f);
        c.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 1.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        b.close();
        b.moveTo(18.0f, 9.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        b.curveTo(17.5f, 8.22f, 17.72f, 8.0f, 18.0f, 8.0f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        b.curveTo(18.5f, 8.78f, 18.28f, 9.0f, 18.0f, 9.0f);
        b.close();
        b.moveTo(18.5f, 6.5f);
        b.curveTo(18.5f, 6.78f, 18.28f, 7.0f, 18.0f, 7.0f);
        b.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        b.verticalLineToRelative(-3.0f);
        b.curveTo(17.5f, 3.22f, 17.72f, 3.0f, 18.0f, 3.0f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 6.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _railwayAlert = build;
        build.getClass();
        return build;
    }
}
