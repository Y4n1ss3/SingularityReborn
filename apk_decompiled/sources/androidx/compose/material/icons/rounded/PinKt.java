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
public final class PinKt {
    private static ImageVector _pin;

    public static final ImageVector getPin(Icons.Rounded rounded) {
        ImageVector imageVector = _pin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        d.close();
        d.moveTo(7.64f, 14.47f);
        d.curveTo(7.64f, 14.76f, 7.4f, 15.0f, 7.11f, 15.0f);
        d.horizontalLineTo(7.02f);
        d.curveToRelative(-0.29f, 0.0f, -0.53f, -0.24f, -0.53f, -0.53f);
        d.verticalLineTo(10.5f);
        d.lineToRelative(-0.45f, 0.33f);
        d.curveToRelative(-0.24f, 0.18f, -0.59f, 0.12f, -0.76f, -0.14f);
        d.curveToRelative(-0.15f, -0.24f, -0.1f, -0.55f, 0.13f, -0.72f);
        d.lineTo(6.6f, 9.12f);
        d.curveTo(6.71f, 9.04f, 6.84f, 9.0f, 6.98f, 9.0f);
        d.curveToRelative(0.36f, 0.0f, 0.66f, 0.29f, 0.66f, 0.66f);
        k4.D(d, 14.47f, 13.01f, 15.0f, -2.67f);
        d.curveToRelative(-0.4f, 0.0f, -0.72f, -0.32f, -0.72f, -0.72f);
        d.curveToRelative(0.0f, -0.19f, 0.08f, -0.38f, 0.21f, -0.51f);
        d.curveToRelative(0.95f, -0.95f, 1.58f, -1.58f, 1.92f, -1.94f);
        d.curveToRelative(0.4f, -0.42f, 0.54f, -0.69f, 0.54f, -1.06f);
        d.curveToRelative(0.0f, -0.4f, -0.31f, -0.72f, -0.81f, -0.72f);
        d.curveToRelative(-0.34f, 0.0f, -0.57f, 0.16f, -0.72f, 0.37f);
        d.curveToRelative(-0.15f, 0.2f, -0.41f, 0.26f, -0.64f, 0.16f);
        d.curveToRelative(-0.34f, -0.14f, -0.45f, -0.57f, -0.22f, -0.85f);
        d.curveToRelative(0.15f, -0.19f, 0.37f, -0.38f, 0.67f, -0.53f);
        d.curveToRelative(0.69f, -0.33f, 1.48f, -0.2f, 1.95f, 0.03f);
        d.curveToRelative(0.86f, 0.44f, 0.91f, 1.24f, 0.91f, 1.48f);
        d.curveToRelative(0.0f, 0.64f, -0.31f, 1.26f, -0.92f, 1.86f);
        d.curveToRelative(-0.25f, 0.25f, -0.72f, 0.71f, -1.4f, 1.39f);
        d.lineToRelative(0.03f, 0.05f);
        d.horizontalLineToRelative(1.88f);
        d.curveToRelative(0.27f, 0.0f, 0.49f, 0.22f, 0.49f, 0.49f);
        d.reflectiveCurveTo(13.28f, 15.0f, 13.01f, 15.0f);
        d.close();
        d.moveTo(18.75f, 14.15f);
        d.curveTo(18.67f, 14.28f, 18.19f, 15.0f, 16.99f, 15.0f);
        d.curveToRelative(-0.03f, 0.0f, -1.23f, 0.06f, -1.83f, -0.98f);
        d.curveToRelative(-0.15f, -0.26f, -0.04f, -0.6f, 0.24f, -0.71f);
        d.lineToRelative(0.12f, -0.05f);
        d.curveToRelative(0.22f, -0.09f, 0.47f, -0.01f, 0.59f, 0.19f);
        d.curveToRelative(0.14f, 0.24f, 0.39f, 0.49f, 0.88f, 0.49f);
        d.curveToRelative(0.41f, 0.0f, 0.89f, -0.28f, 0.89f, -0.77f);
        d.curveToRelative(0.0f, -0.55f, -0.48f, -0.79f, -1.04f, -0.79f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(-0.27f, 0.0f, -0.49f, -0.23f, -0.49f, -0.5f);
        d.curveToRelative(0.0f, -0.26f, 0.2f, -0.47f, 0.45f, -0.49f);
        d.lineToRelative(0.0f, -0.01f);
        d.curveToRelative(0.33f, 0.0f, 0.88f, -0.14f, 0.88f, -0.72f);
        d.curveToRelative(0.0f, -0.39f, -0.31f, -0.65f, -0.75f, -0.65f);
        d.curveToRelative(-0.32f, 0.0f, -0.53f, 0.13f, -0.67f, 0.3f);
        d.curveToRelative(-0.14f, 0.18f, -0.37f, 0.26f, -0.58f, 0.17f);
        d.lineToRelative(-0.08f, -0.03f);
        d.curveToRelative(-0.3f, -0.12f, -0.4f, -0.5f, -0.2f, -0.75f);
        d.curveTo(15.67f, 9.35f, 16.16f, 9.0f, 16.94f, 9.0f);
        d.curveToRelative(1.09f, 0.0f, 1.54f, 0.64f, 1.62f, 0.75f);
        d.curveToRelative(0.33f, 0.5f, 0.28f, 1.16f, 0.02f, 1.57f);
        d.curveToRelative(-0.15f, 0.22f, -0.32f, 0.38f, -0.52f, 0.48f);
        d.verticalLineToRelative(0.07f);
        d.curveToRelative(0.28f, 0.11f, 0.51f, 0.28f, 0.68f, 0.52f);
        d.curveTo(19.11f, 12.91f, 19.07f, 13.66f, 18.75f, 14.15f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pin = build;
        build.getClass();
        return build;
    }
}
