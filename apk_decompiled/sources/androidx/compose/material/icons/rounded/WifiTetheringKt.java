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
public final class WifiTetheringKt {
    private static ImageVector _wifiTethering;

    public static final ImageVector getWifiTethering(Icons.Rounded rounded) {
        ImageVector imageVector = _wifiTethering;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiTethering", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.curveToRelative(0.0f, -3.56f, -3.11f, -6.4f, -6.75f, -5.95f);
        b.curveToRelative(-2.62f, 0.32f, -4.78f, 2.41f, -5.18f, 5.02f);
        b.curveToRelative(-0.33f, 2.15f, 0.49f, 4.11f, 1.93f, 5.4f);
        b.curveToRelative(0.48f, 0.43f, 1.23f, 0.33f, 1.56f, -0.23f);
        b.lineToRelative(0.01f, -0.01f);
        b.curveToRelative(0.24f, -0.42f, 0.14f, -0.93f, -0.22f, -1.26f);
        b.curveToRelative(-1.03f, -0.93f, -1.59f, -2.37f, -1.22f, -3.94f);
        b.curveToRelative(0.33f, -1.42f, 1.48f, -2.57f, 2.9f, -2.91f);
        b.curveTo(13.65f, 8.49f, 16.0f, 10.47f, 16.0f, 13.0f);
        b.curveToRelative(0.0f, 1.18f, -0.52f, 2.23f, -1.33f, 2.96f);
        b.curveToRelative(-0.36f, 0.32f, -0.47f, 0.84f, -0.23f, 1.26f);
        b.lineToRelative(0.01f, 0.01f);
        b.curveToRelative(0.31f, 0.53f, 1.03f, 0.69f, 1.5f, 0.28f);
        b.curveTo(17.2f, 16.41f, 18.0f, 14.8f, 18.0f, 13.0f);
        b.close();
        b.moveTo(10.83f, 3.07f);
        b.curveToRelative(-4.62f, 0.52f, -8.35f, 4.33f, -8.78f, 8.96f);
        b.curveToRelative(-0.35f, 3.7f, 1.32f, 7.02f, 4.02f, 9.01f);
        b.curveToRelative(0.48f, 0.35f, 1.16f, 0.2f, 1.46f, -0.31f);
        b.curveToRelative(0.25f, -0.43f, 0.14f, -0.99f, -0.26f, -1.29f);
        b.curveToRelative(-2.28f, -1.69f, -3.65f, -4.55f, -3.16f, -7.7f);
        b.curveToRelative(0.54f, -3.5f, 3.46f, -6.29f, 6.98f, -6.68f);
        b.curveTo(15.91f, 4.51f, 20.0f, 8.28f, 20.0f, 13.0f);
        b.curveToRelative(0.0f, 2.65f, -1.29f, 4.98f, -3.27f, 6.44f);
        b.curveToRelative(-0.4f, 0.3f, -0.51f, 0.85f, -0.26f, 1.29f);
        b.curveToRelative(0.3f, 0.52f, 0.98f, 0.66f, 1.46f, 0.31f);
        b.curveTo(20.4f, 19.22f, 22.0f, 16.3f, 22.0f, 13.0f);
        b.curveToRelative(0.0f, -5.91f, -5.13f, -10.62f, -11.17f, -9.93f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiTethering = build;
        build.getClass();
        return build;
    }
}
