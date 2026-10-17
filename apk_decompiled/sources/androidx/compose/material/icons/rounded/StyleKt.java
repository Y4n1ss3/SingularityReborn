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
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StyleKt {
    private static ImageVector _style;

    public static final ImageVector getStyle(Icons.Rounded rounded) {
        ImageVector imageVector = _style;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Style", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(2.53f, 19.65f, 1.34f, 0.56f, -9.03f);
        e.lineToRelative(-2.43f, 5.86f);
        e.curveToRelative(-0.41f, 1.02f, 0.08f, 2.19f, 1.09f, 2.61f);
        k4.r(e, 22.03f, 15.95f, 17.07f, 3.98f);
        e.curveToRelative(-0.31f, -0.75f, -1.04f, -1.21f, -1.81f, -1.23f);
        e.curveToRelative(-0.26f, 0.0f, -0.53f, 0.04f, -0.79f, 0.15f);
        e.lineTo(7.1f, 5.95f);
        e.curveToRelative(-0.75f, 0.31f, -1.21f, 1.03f, -1.23f, 1.8f);
        e.curveToRelative(-0.01f, 0.27f, 0.04f, 0.54f, 0.15f, 0.8f);
        e.lineToRelative(4.96f, 11.97f);
        e.curveToRelative(0.31f, 0.76f, 1.05f, 1.22f, 1.83f, 1.23f);
        e.curveToRelative(0.26f, 0.0f, 0.52f, -0.05f, 0.77f, -0.15f);
        e.lineToRelative(7.36f, -3.05f);
        e.curveToRelative(1.02f, -0.42f, 1.51f, -1.59f, 1.09f, -2.6f);
        e.close();
        e.moveTo(7.88f, 8.75f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        e.close();
        e.moveTo(5.88f, 19.75f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(1.45f);
        e.lineToRelative(-3.45f, -8.34f);
        e.verticalLineToRelative(6.34f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _style = build;
        build.getClass();
        return build;
    }
}
