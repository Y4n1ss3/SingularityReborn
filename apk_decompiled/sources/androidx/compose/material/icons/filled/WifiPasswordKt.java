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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiPasswordKt {
    private static ImageVector _wifiPassword;

    public static final ImageVector getWifiPassword(Icons.Filled filled) {
        ImageVector imageVector = _wifiPassword;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiPassword", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(23.0f, 19.0f, -1.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        h.verticalLineToRelative(1.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(3.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(4.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.verticalLineToRelative(-3.0f);
        h.curveTo(24.0f, 19.45f, 23.55f, 19.0f, 23.0f, 19.0f);
        r6.B(h, 22.0f, 19.0f, -2.0f, -1.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(h, 19.0f, 24.0f, 8.98f);
        h.lineToRelative(-2.12f, 2.13f);
        h.curveTo(19.35f, 8.57f, 15.85f, 7.0f, 12.0f, 7.0f);
        h.reflectiveCurveToRelative(-7.35f, 1.57f, -9.88f, 4.11f);
        h.lineTo(0.0f, 8.98f);
        h.curveTo(3.07f, 5.9f, 7.31f, 4.0f, 12.0f, 4.0f);
        h.reflectiveCurveTo(20.93f, 5.9f, 24.0f, 8.98f);
        h.close();
        h.moveTo(12.0f, 10.0f);
        h.curveToRelative(3.03f, 0.0f, 5.78f, 1.23f, 7.76f, 3.22f);
        h.lineToRelative(-2.12f, 2.12f);
        h.curveTo(16.2f, 13.9f, 14.2f, 13.0f, 12.0f, 13.0f);
        h.curveToRelative(-2.2f, 0.0f, -4.2f, 0.9f, -5.64f, 2.35f);
        h.lineToRelative(-2.12f, -2.12f);
        h.curveTo(6.22f, 11.23f, 8.97f, 10.0f, 12.0f, 10.0f);
        k4.r(h, 15.53f, 17.46f, 12.0f, 21.0f);
        h.lineToRelative(-3.53f, -3.54f);
        h.curveTo(9.37f, 16.56f, 10.62f, 16.0f, 12.0f, 16.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(h, 14.63f, 16.56f, 15.53f, 17.46f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiPassword = build;
        build.getClass();
        return build;
    }
}
