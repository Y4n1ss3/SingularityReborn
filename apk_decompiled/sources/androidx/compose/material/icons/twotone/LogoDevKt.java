package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LogoDevKt {
    private static ImageVector _logoDev;

    public static final ImageVector getLogoDev(Icons.TwoTone twoTone) {
        ImageVector imageVector = _logoDev;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LogoDev", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        c21.d(d, 7.68f, 14.98f, 6.0f, 9.0f);
        d.horizontalLineToRelative(1.71f);
        d.curveToRelative(1.28f, 0.0f, 1.71f, 1.03f, 1.71f, 1.71f);
        d.lineToRelative(0.0f, 2.56f);
        d.curveTo(9.42f, 13.95f, 9.0f, 14.98f, 7.68f, 14.98f);
        uo.C(d, 12.38f, 11.46f, 1.07f, -1.18f);
        r6.D(d, 1.39f, 1.93f, 1.07f, -2.25f);
        d.curveToRelative(-0.4f, 0.01f, -0.74f, -0.31f, -0.75f, -0.71f);
        d.verticalLineTo(9.75f);
        d.curveToRelative(-0.01f, -0.4f, 0.31f, -0.74f, 0.71f, -0.75f);
        kf0.B(d, 2.28f, 0.0f, 1.07f, -1.92f);
        kf0.n(d, 1.39f, 12.38f, 16.88f, 14.23f);
        d.curveToRelative(-0.48f, 1.11f, -1.33f, 0.89f, -1.71f, 0.0f);
        d.lineTo(13.77f, 9.0f);
        d.horizontalLineToRelative(1.18f);
        d.lineToRelative(1.07f, 4.11f);
        d.lineTo(17.09f, 9.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(d, 1.18f, 16.88f, 14.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(7.77f, 10.12f, 7.14f, 3.77f, 0.63f);
        i.curveToRelative(0.14f, 0.0f, 0.28f, -0.05f, 0.42f, -0.16f);
        i.curveToRelative(0.14f, -0.1f, 0.21f, -0.26f, 0.21f, -0.47f);
        i.verticalLineToRelative(-2.52f);
        i.curveToRelative(0.0f, -0.21f, -0.07f, -0.37f, -0.21f, -0.47f);
        i.curveTo(8.05f, 10.17f, 7.91f, 10.12f, 7.77f, 10.12f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _logoDev = build;
        build.getClass();
        return build;
    }
}
