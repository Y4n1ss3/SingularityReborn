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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Rounded rounded) {
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.06f, 10.14f);
        b.curveToRelative(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f);
        b.curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        b.curveToRelative(-3.59f, -2.94f, -8.2f, -4.03f, -12.55f, -3.26f);
        b.lineToRelative(2.59f, 2.59f);
        b.curveToRelative(2.89f, -0.03f, 5.8f, 0.92f, 8.17f, 2.86f);
        b.close();
        b.moveTo(17.79f, 11.97f);
        b.curveToRelative(-0.78f, -0.57f, -1.63f, -1.0f, -2.52f, -1.3f);
        b.lineToRelative(2.95f, 2.95f);
        b.curveToRelative(0.24f, -0.58f, 0.1f, -1.27f, -0.43f, -1.65f);
        b.close();
        b.moveTo(13.95f, 16.23f);
        b.curveToRelative(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0.0f);
        b.curveToRelative(-0.59f, 0.31f, -0.7f, 1.12f, -0.23f, 1.59f);
        b.lineToRelative(1.47f, 1.47f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(1.47f, -1.47f);
        b.curveToRelative(0.49f, -0.47f, 0.39f, -1.28f, -0.21f, -1.59f);
        k4.r(b, 19.68f, 17.9f, 4.12f, 2.34f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(5.05f, 6.1f);
        b.curveToRelative(-1.01f, 0.5f, -1.99f, 1.11f, -2.89f, 1.85f);
        b.curveToRelative(-0.65f, 0.53f, -0.69f, 1.51f, -0.1f, 2.1f);
        b.curveToRelative(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f);
        b.curveToRelative(1.0f, -0.82f, 2.1f, -1.46f, 3.25f, -1.93f);
        b.lineToRelative(2.23f, 2.23f);
        b.curveToRelative(-1.13f, 0.3f, -2.21f, 0.8f, -3.19f, 1.51f);
        b.curveToRelative(-0.69f, 0.5f, -0.73f, 1.51f, -0.13f, 2.11f);
        b.lineToRelative(0.01f, 0.01f);
        b.curveToRelative(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f);
        b.curveToRelative(1.19f, -0.84f, 2.58f, -1.26f, 3.97f, -1.29f);
        b.lineToRelative(6.37f, 6.37f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.37f, 0.39f, -1.0f, 0.0f, -1.39f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiOff = build;
        build.getClass();
        return build;
    }
}
