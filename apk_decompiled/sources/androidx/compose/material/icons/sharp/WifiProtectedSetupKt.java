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
import defpackage.fc;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiProtectedSetupKt {
    private static ImageVector _wifiProtectedSetup;

    public static final ImageVector getWifiProtectedSetup(Icons.Sharp sharp) {
        ImageVector imageVector = _wifiProtectedSetup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiProtectedSetup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(16.71f, 5.29f, 19.0f, 3.0f, -8.0f);
        k.verticalLineToRelative(8.0f);
        k.lineToRelative(2.3f, -2.3f);
        k.curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f);
        k.curveToRelative(0.0f, 1.31f, -0.32f, 2.54f, -0.88f, 3.63f);
        k.curveToRelative(2.33f, -1.52f, 3.88f, -4.14f, 3.88f, -7.13f);
        k.curveTo(19.55f, 9.1f, 18.44f, 6.85f, 16.71f, 5.29f);
        k.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.46f, 8.88f);
        b.curveToRelative(0.0f, -1.31f, 0.32f, -2.54f, 0.88f, -3.63f);
        b.curveTo(6.0f, 6.77f, 4.46f, 9.39f, 4.46f, 12.38f);
        b.curveToRelative(0.0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f);
        fc.w(b, 5.0f, 21.0f, 8.0f, -8.0f);
        b.lineToRelative(-2.3f, 2.3f);
        b.curveTo(8.74f, 13.84f, 7.46f, 11.52f, 7.46f, 8.88f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiProtectedSetup = build;
        build.getClass();
        return build;
    }
}
