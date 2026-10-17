package androidx.compose.material.icons.twotone;

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

    public static final ImageVector getNetworkWifi3Bar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _networkWifi3Bar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NetworkWifi3Bar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.92f, 9.07f);
        b.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        b.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        b.lineToRelative(-2.85f, 2.86f);
        b.curveTo(16.46f, 10.71f, 14.31f, 10.0f, 12.0f, 10.0f);
        b.curveToRelative(-2.31f, 0.0f, -4.46f, 0.71f, -6.23f, 1.93f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 2.92f, 9.07f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 4.0f);
        b2.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        b2.lineTo(12.0f, 21.0f);
        b2.lineTo(24.0f, 8.98f);
        b2.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        b2.close();
        b2.moveTo(2.92f, 9.07f);
        b2.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        b2.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        b2.lineToRelative(-2.85f, 2.86f);
        b2.curveTo(16.46f, 10.71f, 14.31f, 10.0f, 12.0f, 10.0f);
        b2.curveToRelative(-2.31f, 0.0f, -4.46f, 0.71f, -6.23f, 1.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 2.92f, 9.07f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkWifi3Bar = build;
        build.getClass();
        return build;
    }
}
