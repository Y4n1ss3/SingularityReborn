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
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Filled filled) {
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TouchApp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(9.0f, 11.24f, 7.5f);
        d.curveTo(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
        d.reflectiveCurveTo(14.0f, 6.12f, 14.0f, 7.5f);
        d.verticalLineToRelative(3.74f);
        d.curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        d.curveTo(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
        d.reflectiveCurveTo(7.0f, 5.01f, 7.0f, 7.5f);
        d.curveTo(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f);
        k4.x(d, 18.84f, 15.87f, -4.54f, -2.26f);
        d.curveToRelative(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
        d.horizontalLineTo(13.0f);
        d.verticalLineToRelative(-6.0f);
        d.curveTo(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f);
        d.reflectiveCurveTo(10.0f, 6.67f, 10.0f, 7.5f);
        d.verticalLineToRelative(10.74f);
        d.curveToRelative(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f);
        d.curveToRelative(-0.31f, 0.0f, -0.59f, 0.13f, -0.79f, 0.33f);
        d.lineToRelative(-0.79f, 0.8f);
        d.lineToRelative(4.94f, 4.94f);
        d.curveTo(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f);
        d.horizontalLineToRelative(6.79f);
        d.curveToRelative(0.75f, 0.0f, 1.33f, -0.55f, 1.44f, -1.28f);
        d.lineToRelative(0.75f, -5.27f);
        d.curveToRelative(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
        d.curveTo(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = build;
        build.getClass();
        return build;
    }
}
