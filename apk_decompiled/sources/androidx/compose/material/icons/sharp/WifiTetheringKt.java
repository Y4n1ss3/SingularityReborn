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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiTetheringKt {
    private static ImageVector _wifiTethering;

    public static final ImageVector getWifiTethering(Icons.Sharp sharp) {
        ImageVector imageVector = _wifiTethering;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiTethering", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 11.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.close();
        b.moveTo(18.0f, 13.0f);
        b.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        b.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        b.lineToRelative(1.0f, -1.74f);
        b.curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        b.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 1.48f, -0.81f, 2.75f, -2.0f, 3.45f);
        b.lineToRelative(1.0f, 1.74f);
        b.curveToRelative(1.79f, -1.04f, 3.0f, -2.97f, 3.0f, -5.19f);
        b.close();
        b.moveTo(12.0f, 3.0f);
        b.curveTo(6.48f, 3.0f, 2.0f, 7.48f, 2.0f, 13.0f);
        b.curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        b.lineToRelative(1.0f, -1.73f);
        b.curveTo(5.61f, 18.53f, 4.0f, 15.96f, 4.0f, 13.0f);
        b.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 2.96f, -1.61f, 5.53f, -4.0f, 6.92f);
        b.lineToRelative(1.0f, 1.73f);
        b.curveToRelative(2.99f, -1.73f, 5.0f, -4.95f, 5.0f, -8.65f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiTethering = build;
        build.getClass();
        return build;
    }
}
