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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShutterSpeedKt {
    private static ImageVector _shutterSpeed;

    public static final ImageVector getShutterSpeed(Icons.Rounded rounded) {
        ImageVector imageVector = _shutterSpeed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShutterSpeed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(10.0f, 3.0f, 4.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        a.horizontalLineToRelative(-4.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        k4.x(a, 19.03f, 7.39f, 0.75f, -0.75f);
        a.curveToRelative(0.38f, -0.38f, 0.39f, -1.01f, 0.0f, -1.4f);
        a.lineToRelative(-0.01f, -0.01f);
        a.curveToRelative(-0.39f, -0.39f, -1.01f, -0.38f, -1.4f, 0.0f);
        a.lineToRelative(-0.75f, 0.75f);
        a.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        a.curveToRelative(-4.8f, 0.0f, -8.88f, 3.96f, -9.0f, 8.76f);
        a.curveTo(2.87f, 17.84f, 6.94f, 22.0f, 12.0f, 22.0f);
        a.curveToRelative(4.98f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        a.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        a.close();
        a.moveTo(12.0f, 20.0f);
        a.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        a.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        a.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        a.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        af0.l(a, 10.81f, 15.0f, -3.7f);
        a.curveToRelative(-0.38f, 0.0f, -0.62f, 0.4f, -0.45f, 0.74f);
        a.curveToRelative(0.56f, 1.12f, 1.44f, 2.01f, 2.57f, 2.57f);
        a.curveToRelative(0.23f, 0.11f, 0.52f, 0.02f, 0.65f, -0.21f);
        a.lineToRelative(1.37f, -2.35f);
        a.curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.44f, -0.75f);
        a.close();
        a.moveTo(14.73f, 7.65f);
        a.curveToRelative(-0.23f, -0.12f, -0.52f, -0.02f, -0.65f, 0.2f);
        a.lineToRelative(-1.38f, 2.39f);
        a.curveToRelative(-0.2f, 0.34f, 0.04f, 0.76f, 0.43f, 0.76f);
        a.horizontalLineToRelative(3.76f);
        a.curveToRelative(0.38f, 0.0f, 0.62f, -0.4f, 0.45f, -0.73f);
        a.curveToRelative(-0.58f, -1.13f, -1.49f, -2.04f, -2.61f, -2.62f);
        a.close();
        a.moveTo(13.88f, 14.7f);
        a.curveToRelative(-0.19f, -0.34f, -0.68f, -0.35f, -0.87f, -0.01f);
        a.lineToRelative(-2.04f, 3.52f);
        a.curveToRelative(-0.18f, 0.32f, 0.02f, 0.72f, 0.39f, 0.75f);
        a.curveToRelative(1.34f, 0.14f, 2.69f, -0.18f, 3.83f, -0.89f);
        a.curveToRelative(0.22f, -0.14f, 0.28f, -0.43f, 0.16f, -0.66f);
        fc.B(a, -1.47f, -2.71f, 10.31f, 13.23f);
        a.lineTo(7.93f, 9.57f);
        a.curveToRelative(-0.2f, -0.3f, -0.64f, -0.3f, -0.84f, 0.0f);
        a.curveToRelative(-0.81f, 1.16f, -1.17f, 2.57f, -1.05f, 3.98f);
        a.curveToRelative(0.02f, 0.26f, 0.24f, 0.45f, 0.5f, 0.45f);
        a.horizontalLineToRelative(3.35f);
        a.curveToRelative(0.39f, 0.0f, 0.63f, -0.44f, 0.42f, -0.77f);
        k4.x(a, 13.97f, 12.74f, 2.02f, 3.74f);
        a.curveToRelative(0.18f, 0.33f, 0.64f, 0.35f, 0.86f, 0.05f);
        a.curveToRelative(0.86f, -1.18f, 1.24f, -2.62f, 1.12f, -4.08f);
        a.curveToRelative(-0.02f, -0.26f, -0.25f, -0.45f, -0.5f, -0.45f);
        a.horizontalLineToRelative(-3.05f);
        a.curveToRelative(-0.39f, 0.0f, -0.63f, 0.4f, -0.45f, 0.74f);
        a.close();
        a.moveTo(10.17f, 11.17f);
        a.curveToRelative(0.2f, 0.31f, 0.66f, 0.3f, 0.85f, -0.02f);
        a.lineToRelative(1.94f, -3.35f);
        a.curveToRelative(0.19f, -0.32f, -0.03f, -0.72f, -0.4f, -0.76f);
        a.curveToRelative(-1.36f, -0.12f, -2.73f, 0.21f, -3.88f, 0.97f);
        a.curveToRelative(-0.22f, 0.15f, -0.27f, 0.46f, -0.13f, 0.68f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(a, 1.62f, 2.48f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shutterSpeed = build;
        build.getClass();
        return build;
    }
}
