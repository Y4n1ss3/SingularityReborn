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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NetworkWifi3BarKt {
    private static ImageVector _networkWifi3Bar;

    public static final ImageVector getNetworkWifi3Bar(Icons.Rounded rounded) {
        ImageVector imageVector = _networkWifi3Bar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NetworkWifi3Bar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveTo(7.7f, 4.0f, 3.78f, 5.6f, 0.79f, 8.24f);
        b.curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f);
        b.lineToRelative(10.56f, 10.58f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        b.lineTo(23.27f, 9.71f);
        b.curveToRelative(0.41f, -0.41f, 0.38f, -1.08f, -0.06f, -1.47f);
        b.curveTo(20.22f, 5.6f, 16.3f, 4.0f, 12.0f, 4.0f);
        b.close();
        b.moveTo(2.92f, 9.07f);
        b.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        b.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        b.lineToRelative(-2.85f, 2.86f);
        b.curveTo(16.46f, 10.71f, 14.31f, 10.0f, 12.0f, 10.0f);
        b.curveToRelative(-2.31f, 0.0f, -4.46f, 0.71f, -6.23f, 1.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 2.92f, 9.07f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkWifi3Bar = build;
        build.getClass();
        return build;
    }
}
