package androidx.compose.material.icons.outlined;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RailwayAlertKt {
    private static ImageVector _railwayAlert;

    public static final ImageVector getRailwayAlert(Icons.Outlined outlined) {
        ImageVector imageVector = _railwayAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RailwayAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(10.0f, 15.5f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(4.0f, 11.0f, 8.0f, 7.29f);
        c.curveTo(11.1f, 7.37f, 11.0f, 6.7f, 11.0f, 6.0f);
        c.horizontalLineTo(4.43f);
        c.curveToRelative(0.9f, -0.77f, 3.28f, -1.08f, 6.65f, -0.98f);
        c.curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.99f);
        c.curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f);
        c.verticalLineToRelative(9.5f);
        c.curveTo(2.0f, 18.43f, 3.57f, 20.0f, 5.5f, 20.0f);
        af0.m(c, 4.0f, 21.0f, 1.0f, 12.0f);
        c.verticalLineToRelative(-1.0f);
        c.lineToRelative(-1.5f, -1.0f);
        c.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        c.verticalLineTo(13.0f);
        c.curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f);
        k4.w(c, 4.0f, 16.0f, 16.5f);
        c.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        c.horizontalLineToRelative(-9.0f);
        c.curveTo(4.67f, 18.0f, 4.0f, 17.33f, 4.0f, 16.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(c, 13.0f, 12.0f, 16.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(18.0f, 1.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        af0.r(b2, 18.5f, 9.0f, -1.0f, 8.0f);
        uo.r(b2, 1.0f, 9.0f, 18.5f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(b2, -1.0f, 3.0f, 1.0f, 7.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _railwayAlert = build;
        build.getClass();
        return build;
    }
}
