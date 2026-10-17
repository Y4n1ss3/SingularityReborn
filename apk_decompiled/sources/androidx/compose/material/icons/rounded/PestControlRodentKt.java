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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PestControlRodentKt {
    private static ImageVector _pestControlRodent;

    public static final ImageVector getPestControlRodent(Icons.Rounded rounded) {
        ImageVector imageVector = _pestControlRodent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PestControlRodent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.31f, 17.38f, -2.39f, -2.13f);
        e.curveTo(19.44f, 12.89f, 17.56f, 11.0f, 15.5f, 11.0f);
        e.curveToRelative(-1.16f, 0.0f, -3.5f, 0.9f, -3.5f, 3.5f);
        e.curveToRelative(0.0f, 0.81f, 0.27f, 1.55f, 0.74f, 2.15f);
        e.curveToRelative(0.15f, 0.2f, 0.14f, 0.48f, -0.04f, 0.66f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(-0.21f, 0.21f, -0.56f, 0.19f, -0.75f, -0.04f);
        e.curveTo(11.35f, 16.5f, 11.0f, 15.54f, 11.0f, 14.5f);
        e.curveToRelative(0.0f, -1.7f, 0.96f, -3.17f, 2.35f, -3.93f);
        e.curveToRelative(-0.7f, -0.36f, -1.48f, -0.57f, -2.28f, -0.57f);
        e.curveToRelative(-2.38f, 0.0f, -4.37f, 1.65f, -4.91f, 3.87f);
        e.curveToRelative(-1.33f, -0.39f, -2.28f, -1.66f, -2.15f, -3.14f);
        e.curveTo(4.15f, 9.16f, 5.54f, 8.0f, 7.11f, 8.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.curveToRelative(1.58f, 0.0f, 2.75f, -0.95f, 2.87f, -2.25f);
        e.curveTo(12.13f, 4.25f, 10.96f, 3.0f, 9.5f, 3.0f);
        e.horizontalLineTo(8.05f);
        e.curveToRelative(-0.5f, 0.0f, -0.96f, 0.34f, -1.04f, 0.83f);
        e.curveTo(6.91f, 4.46f, 7.39f, 5.0f, 8.0f, 5.0f);
        e.horizontalLineToRelative(1.5f);
        e.curveTo(9.78f, 5.0f, 10.0f, 5.22f, 10.0f, 5.5f);
        e.curveTo(10.0f, 5.78f, 9.78f, 6.0f, 9.5f, 6.0f);
        e.lineTo(7.16f, 6.0f);
        e.curveToRelative(-2.67f, 0.0f, -4.99f, 2.03f, -5.15f, 4.7f);
        e.curveTo(1.86f, 13.25f, 3.62f, 15.42f, 6.0f, 15.9f);
        e.verticalLineToRelative(0.03f);
        e.curveTo(6.0f, 18.73f, 8.27f, 21.0f, 11.07f, 21.0f);
        e.horizontalLineToRelative(8.86f);
        e.curveTo(21.8f, 21.0f, 22.74f, 18.66f, 21.31f, 17.38f);
        e.close();
        e.moveTo(18.0f, 19.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(19.0f, 18.55f, 18.55f, 19.0f, 18.0f, 19.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pestControlRodent = build;
        build.getClass();
        return build;
    }
}
