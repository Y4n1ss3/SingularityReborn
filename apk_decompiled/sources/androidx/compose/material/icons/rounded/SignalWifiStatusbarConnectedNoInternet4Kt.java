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
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalWifiStatusbarConnectedNoInternet4Kt {
    private static ImageVector _signalWifiStatusbarConnectedNoInternet4;

    public static final ImageVector getSignalWifiStatusbarConnectedNoInternet4(Icons.Rounded rounded) {
        ImageVector imageVector = _signalWifiStatusbarConnectedNoInternet4;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SignalWifiStatusbarConnectedNoInternet4", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(22.92f, 8.0f, 17.0f, 7.99f);
        q.lineToRelative(-4.29f, 4.3f);
        q.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f);
        q.lineTo(0.73f, 9.71f);
        q.curveTo(0.32f, 9.3f, 0.35f, 8.63f, 0.79f, 8.24f);
        q.curveTo(3.78f, 5.6f, 7.7f, 4.0f, 12.0f, 4.0f);
        q.curveTo(16.16f, 4.0f, 19.97f, 5.51f, 22.92f, 8.0f);
        q.close();
        q.moveTo(20.0f, 18.0f);
        q.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        q.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        q.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        q.reflectiveCurveTo(20.55f, 18.0f, 20.0f, 18.0f);
        q.close();
        q.moveTo(20.0f, 10.0f);
        q.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        q.verticalLineToRelative(4.0f);
        q.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        q.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        q.verticalLineToRelative(-4.0f);
        q.curveTo(21.0f, 10.45f, 20.55f, 10.0f, 20.0f, 10.0f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiStatusbarConnectedNoInternet4 = build;
        build.getClass();
        return build;
    }
}
