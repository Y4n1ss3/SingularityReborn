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
import defpackage.af0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiCallingKt {
    private static ImageVector _wifiCalling;

    public static final ImageVector getWifiCalling(Icons.Sharp sharp) {
        ImageVector imageVector = _wifiCalling;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiCalling", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.21f, 17.37f);
        b.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        b.lineToRelative(2.53f, -2.53f);
        b.lineTo(8.54f, 3.0f);
        b.horizontalLineTo(3.03f);
        b.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        b.verticalLineToRelative(-5.51f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -5.27f, -0.61f, 13.21f, 17.37f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(22.0f, 4.95f);
        b2.curveTo(21.79f, 4.78f, 19.67f, 3.0f, 16.5f, 3.0f);
        b2.curveToRelative(-3.18f, 0.0f, -5.29f, 1.78f, -5.5f, 1.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b2, 16.5f, 12.0f, 22.0f, 4.95f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiCalling = build;
        build.getClass();
        return build;
    }
}
