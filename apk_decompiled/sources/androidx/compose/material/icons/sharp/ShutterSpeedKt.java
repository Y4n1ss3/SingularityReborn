package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShutterSpeedKt {
    private static ImageVector _shutterSpeed;

    public static final ImageVector getShutterSpeed(Icons.Sharp sharp) {
        ImageVector imageVector = _shutterSpeed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ShutterSpeed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(15.0f, 1.0f, 9.0f, 1.0f, 2.0f);
        gy.n(s, 6.0f, 15.0f, 1.0f);
        s.moveTo(19.03f, 7.39f);
        s.lineToRelative(1.42f, -1.42f);
        s.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        s.lineToRelative(-1.42f, 1.42f);
        s.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        s.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        s.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        s.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        s.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        s.close();
        s.moveTo(12.0f, 20.0f);
        s.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        s.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        s.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        s.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        k4.r(s, 11.68f, 15.0f, 6.35f, 15.0f);
        s.curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f);
        fc.C(s, -0.11f, -0.06f, 2.03f, -3.5f);
        s.moveTo(17.65f, 11.0f);
        s.curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f);
        uf.j(s, 12.26f, 11.0f, 5.39f);
        s.moveTo(10.61f, 18.83f);
        s.curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f);
        s.curveToRelative(1.34f, 0.0f, 2.57f, -0.45f, 3.57f, -1.19f);
        fc.C(s, -2.11f, -3.9f, -2.85f, 4.92f);
        s.moveTo(7.55f, 8.99f);
        s.curveTo(6.59f, 10.05f, 6.0f, 11.46f, 6.0f, 13.0f);
        s.curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        gy.n(s, 4.72f, 7.55f, 8.99f);
        s.moveTo(16.34f, 17.13f);
        s.curveTo(17.37f, 16.06f, 18.0f, 14.6f, 18.0f, 13.0f);
        s.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        uo.w(s, -4.34f, 2.77f, 5.13f);
        s.moveTo(13.33f, 7.15f);
        s.curveTo(12.9f, 7.06f, 12.46f, 7.0f, 12.0f, 7.0f);
        s.curveToRelative(-1.4f, 0.0f, -2.69f, 0.49f, -3.71f, 1.29f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(s, 2.32f, 3.56f, 2.72f, -4.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shutterSpeed = build;
        build.getClass();
        return build;
    }
}
