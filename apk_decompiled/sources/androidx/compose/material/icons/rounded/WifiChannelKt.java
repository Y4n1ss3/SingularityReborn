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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiChannelKt {
    private static ImageVector _wifiChannel;

    public static final ImageVector getWifiChannel(Icons.Rounded rounded) {
        ImageVector imageVector = _wifiChannel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiChannel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.13f, 21.0f);
        b.curveToRelative(0.5f, 0.0f, 0.92f, -0.38f, 0.99f, -0.87f);
        b.curveToRelative(0.65f, -4.89f, 1.95f, -9.01f, 2.88f, -10.0f);
        b.curveToRelative(0.91f, 0.98f, 2.19f, 5.01f, 2.86f, 9.82f);
        b.curveToRelative(0.08f, 0.6f, 0.59f, 1.05f, 1.19f, 1.05f);
        b.curveToRelative(0.54f, 0.0f, 1.02f, -0.36f, 1.16f, -0.89f);
        b.curveTo(13.83f, 17.73f, 15.11f, 15.0f, 16.0f, 15.0f);
        b.curveToRelative(0.9f, 0.0f, 2.19f, 2.83f, 2.81f, 5.2f);
        b.curveToRelative(0.12f, 0.48f, 0.56f, 0.8f, 1.05f, 0.8f);
        b.curveToRelative(0.62f, 0.0f, 1.12f, -0.52f, 1.09f, -1.14f);
        b.curveTo(20.75f, 15.89f, 19.81f, 3.0f, 16.0f, 3.0f);
        b.curveToRelative(-2.51f, 0.0f, -3.77f, 5.61f, -4.4f, 10.57f);
        b.curveTo(10.79f, 10.66f, 9.61f, 8.0f, 8.0f, 8.0f);
        b.curveToRelative(-2.92f, 0.0f, -4.41f, 8.71f, -4.85f, 11.87f);
        b.curveTo(3.06f, 20.47f, 3.53f, 21.0f, 4.13f, 21.0f);
        b.close();
        b.moveTo(16.0f, 13.0f);
        b.curveToRelative(-0.99f, 0.0f, -1.82f, 0.62f, -2.5f, 1.5f);
        b.curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f);
        b.curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f);
        b.curveTo(17.81f, 13.62f, 16.98f, 13.0f, 16.0f, 13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiChannel = build;
        build.getClass();
        return build;
    }
}
