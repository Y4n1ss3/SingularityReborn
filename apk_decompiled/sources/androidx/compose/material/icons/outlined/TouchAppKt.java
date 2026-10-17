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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Outlined outlined) {
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TouchApp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.19f, 12.44f, -3.24f, -1.62f);
        e.curveToRelative(1.29f, -1.0f, 2.12f, -2.56f, 2.12f, -4.32f);
        e.curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f);
        e.reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f);
        e.curveToRelative(0.0f, 2.13f, 1.22f, 3.98f, 3.0f, 4.89f);
        e.verticalLineToRelative(3.26f);
        e.curveToRelative(-2.15f, -0.46f, -2.02f, -0.44f, -2.26f, -0.44f);
        e.curveToRelative(-0.53f, 0.0f, -1.03f, 0.21f, -1.41f, 0.59f);
        e.lineTo(4.0f, 16.22f);
        e.lineToRelative(5.09f, 5.09f);
        e.curveTo(9.52f, 21.75f, 10.12f, 22.0f, 10.74f, 22.0f);
        e.horizontalLineToRelative(6.3f);
        e.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        e.lineToRelative(0.8f, -4.71f);
        e.curveTo(20.03f, 14.32f, 19.38f, 13.04f, 18.19f, 12.44f);
        k4.r(e, 17.84f, 15.29f, 17.04f, 20.0f);
        e.horizontalLineToRelative(-6.3f);
        e.curveToRelative(-0.09f, 0.0f, -0.17f, -0.04f, -0.24f, -0.1f);
        e.lineToRelative(-3.68f, -3.68f);
        e.lineToRelative(4.25f, 0.89f);
        e.verticalLineTo(6.5f);
        e.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        gy.C(e, 6.0f, 1.76f, 3.46f, 1.73f);
        e.curveTo(17.69f, 14.43f, 17.91f, 14.86f, 17.84f, 15.29f);
        e.close();
        e.moveTo(8.07f, 6.5f);
        e.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        e.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        e.curveToRelative(0.0f, 0.95f, -0.38f, 1.81f, -1.0f, 2.44f);
        e.verticalLineTo(6.5f);
        e.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        e.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        e.verticalLineToRelative(2.44f);
        e.curveTo(8.45f, 8.31f, 8.07f, 7.45f, 8.07f, 6.5f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = build;
        build.getClass();
        return build;
    }
}
