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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiChannelKt {
    private static ImageVector _wifiChannel;

    public static final ImageVector getWifiChannel(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wifiChannel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WifiChannel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 21.0f);
        b.curveToRelative(0.5f, -2.53f, 2.0f, -6.0f, 3.0f, -6.0f);
        b.reflectiveCurveToRelative(2.5f, 3.53f, 3.0f, 6.0f);
        k4.w(b, 13.0f, 5.01f, 21.0f);
        b.curveToRelative(0.61f, -5.27f, 2.0f, -9.82f, 2.99f, -10.87f);
        b.curveToRelative(0.98f, 1.05f, 2.38f, 5.61f, 2.99f, 10.87f);
        k4.w(b, 5.01f, 16.0f, 13.0f);
        b.curveToRelative(-0.99f, 0.0f, -1.82f, 0.62f, -2.5f, 1.5f);
        b.curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f);
        b.curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f);
        b.curveTo(17.81f, 13.62f, 16.98f, 13.0f, 16.0f, 13.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(16.0f, 3.0f);
        b2.curveToRelative(-2.51f, 0.0f, -3.77f, 5.61f, -4.4f, 10.57f);
        b2.curveTo(10.79f, 10.66f, 9.61f, 8.0f, 8.0f, 8.0f);
        b2.curveTo(4.43f, 8.0f, 3.0f, 21.0f, 3.0f, 21.0f);
        b2.horizontalLineToRelative(2.01f);
        b2.curveToRelative(0.61f, -5.27f, 2.0f, -9.82f, 2.99f, -10.87f);
        b2.curveToRelative(0.98f, 1.05f, 2.38f, 5.61f, 2.99f, 10.87f);
        b2.horizontalLineTo(13.0f);
        b2.curveToRelative(0.5f, -2.53f, 2.0f, -6.0f, 3.0f, -6.0f);
        b2.reflectiveCurveToRelative(2.5f, 3.53f, 3.0f, 6.0f);
        b2.horizontalLineToRelative(2.0f);
        b2.curveTo(21.0f, 21.0f, 20.5f, 3.0f, 16.0f, 3.0f);
        b2.close();
        b2.moveTo(16.0f, 13.0f);
        b2.curveToRelative(-0.99f, 0.0f, -1.82f, 0.62f, -2.5f, 1.5f);
        b2.curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f);
        b2.curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f);
        b2.curveTo(17.81f, 13.62f, 16.98f, 13.0f, 16.0f, 13.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiChannel = build;
        build.getClass();
        return build;
    }
}
