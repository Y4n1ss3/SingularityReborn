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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RocketLaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(Icons.Rounded rounded) {
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RocketLaunch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.19f, 6.35f);
        b.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        b.lineToRelative(-2.26f, -0.97f);
        b.curveToRelative(-0.65f, -0.28f, -0.81f, -1.13f, -0.31f, -1.63f);
        b.lineToRelative(3.01f, -3.01f);
        b.curveToRelative(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
        r6.C(b, 9.19f, 6.35f, 9.19f, 6.35f);
        b.moveTo(10.68f, 16.51f);
        b.curveToRelative(0.3f, 0.3f, 0.74f, 0.38f, 1.12f, 0.2f);
        b.curveToRelative(1.16f, -0.54f, 3.65f, -1.81f, 5.26f, -3.42f);
        b.curveToRelative(4.59f, -4.59f, 4.63f, -8.33f, 4.36f, -9.93f);
        b.curveToRelative(-0.07f, -0.4f, -0.39f, -0.72f, -0.79f, -0.79f);
        b.curveToRelative(-1.6f, -0.27f, -5.34f, -0.23f, -9.93f, 4.36f);
        b.curveToRelative(-1.61f, 1.61f, -2.87f, 4.1f, -3.42f, 5.26f);
        b.curveToRelative(-0.18f, 0.38f, -0.09f, 0.83f, 0.2f, 1.12f);
        uo.l(b, 10.68f, 16.51f, 17.65f, 14.81f);
        b.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        b.lineToRelative(0.97f, 2.26f);
        b.curveToRelative(0.28f, 0.65f, 1.13f, 0.81f, 1.63f, 0.31f);
        b.lineToRelative(3.01f, -3.01f);
        b.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        r6.C(b, 17.65f, 14.81f, 17.65f, 14.81f);
        b.moveTo(8.94f, 17.41f);
        b.curveToRelative(0.2f, 1.06f, -0.15f, 2.04f, -0.82f, 2.71f);
        b.curveToRelative(-0.77f, 0.77f, -3.16f, 1.34f, -4.71f, 1.64f);
        b.curveToRelative(-0.69f, 0.13f, -1.3f, -0.48f, -1.17f, -1.17f);
        b.curveToRelative(0.3f, -1.55f, 0.86f, -3.94f, 1.64f, -4.71f);
        b.curveToRelative(0.67f, -0.67f, 1.65f, -1.02f, 2.71f, -0.82f);
        b.curveTo(7.76f, 15.28f, 8.72f, 16.24f, 8.94f, 17.41f);
        b.close();
        b.moveTo(13.0f, 9.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.0f, 10.1f, 13.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocketLaunch = build;
        build.getClass();
        return build;
    }
}
