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
import defpackage.af0;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiProtectedSetupKt {
    private static ImageVector _wifiProtectedSetup;

    public static final ImageVector getWifiProtectedSetup(Icons.Rounded rounded) {
        ImageVector imageVector = _wifiProtectedSetup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiProtectedSetup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.7f, 5.3f, 1.44f, -1.44f);
        e.curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f);
        e.horizontalLineTo(11.5f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        e.verticalLineTo(9.8f);
        e.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        e.lineToRelative(1.45f, -1.45f);
        e.curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f);
        e.curveToRelative(0.0f, 0.66f, -0.08f, 1.31f, -0.24f, 1.92f);
        e.curveToRelative(-0.12f, 0.5f, 0.48f, 0.86f, 0.84f, 0.49f);
        e.curveToRelative(1.48f, -1.53f, 2.4f, -3.61f, 2.4f, -5.91f);
        e.curveTo(19.55f, 9.11f, 18.44f, 6.86f, 16.7f, 5.3f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.15f, 13.86f, 10.7f, 15.3f);
        i.curveToRelative(-1.97f, -1.46f, -3.25f, -3.78f, -3.25f, -6.42f);
        i.curveToRelative(0.0f, -0.66f, 0.08f, -1.31f, 0.24f, -1.92f);
        i.curveToRelative(0.12f, -0.5f, -0.48f, -0.86f, -0.84f, -0.49f);
        i.curveToRelative(-1.48f, 1.53f, -2.4f, 3.61f, -2.4f, 5.91f);
        i.curveToRelative(0.0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f);
        i.lineToRelative(-1.44f, 1.44f);
        i.curveToRelative(-0.32f, 0.32f, -0.09f, 0.85f, 0.35f, 0.85f);
        i.horizontalLineToRelative(6.29f);
        i.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        i.verticalLineToRelative(-6.29f);
        i.curveTo(13.0f, 13.77f, 12.46f, 13.54f, 12.15f, 13.86f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiProtectedSetup = build;
        build.getClass();
        return build;
    }
}
