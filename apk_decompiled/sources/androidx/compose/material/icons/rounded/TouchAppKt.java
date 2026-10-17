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
import defpackage.gy;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Rounded rounded) {
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TouchApp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(8.79f, 9.24f, 5.5f);
        d.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        d.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        d.verticalLineToRelative(3.74f);
        d.curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        d.curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
        d.reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f);
        d.curveTo(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
        d.close();
        d.moveTo(14.29f, 11.71f);
        d.curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
        d.horizontalLineToRelative(-0.61f);
        d.verticalLineToRelative(-6.0f);
        d.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        d.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        d.verticalLineToRelative(10.74f);
        d.lineToRelative(-3.44f, -0.72f);
        d.curveToRelative(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
        d.curveToRelative(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
        d.lineToRelative(4.01f, 4.01f);
        d.curveTo(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
        d.horizontalLineToRelative(6.1f);
        d.curveToRelative(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
        d.lineToRelative(0.63f, -4.47f);
        d.curveToRelative(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 14.29f, 11.71f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = build;
        build.getClass();
        return build;
    }
}
