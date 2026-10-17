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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiPasswordKt {
    private static ImageVector _wifiPassword;

    public static final ImageVector getWifiPassword(Icons.Sharp sharp) {
        ImageVector imageVector = _wifiPassword;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiPassword", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(24.0f, 8.98f, -2.12f, 2.13f);
        e.curveTo(19.35f, 8.57f, 15.85f, 7.0f, 12.0f, 7.0f);
        e.reflectiveCurveToRelative(-7.35f, 1.57f, -9.88f, 4.11f);
        e.lineTo(0.0f, 8.98f);
        e.curveTo(3.07f, 5.9f, 7.31f, 4.0f, 12.0f, 4.0f);
        e.reflectiveCurveTo(20.93f, 5.9f, 24.0f, 8.98f);
        k4.x(e, 4.24f, 13.22f, 2.12f, 2.12f);
        e.curveTo(7.8f, 13.9f, 9.8f, 13.0f, 12.0f, 13.0f);
        e.curveToRelative(2.2f, 0.0f, 4.2f, 0.9f, 5.64f, 2.35f);
        e.lineToRelative(2.12f, -2.12f);
        e.curveTo(17.78f, 11.23f, 15.03f, 10.0f, 12.0f, 10.0f);
        e.curveTo(8.97f, 10.0f, 6.22f, 11.23f, 4.24f, 13.22f);
        uo.C(e, 24.0f, 19.0f, 5.0f, -6.0f);
        kf0.z(e, -5.0f, 1.0f, -1.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        kf0.n(e, 1.0f, 24.0f, 22.0f, 18.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        k4.p(e, 1.0f, 2.0f, 18.0f);
        e.moveTo(12.0f, 16.0f);
        e.curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.53f, 1.46f);
        e.lineTo(12.0f, 21.0f);
        e.lineToRelative(3.53f, -3.54f);
        e.curveTo(14.63f, 16.56f, 13.38f, 16.0f, 12.0f, 16.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiPassword = build;
        build.getClass();
        return build;
    }
}
