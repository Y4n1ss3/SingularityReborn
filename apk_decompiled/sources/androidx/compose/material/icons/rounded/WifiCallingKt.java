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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiCallingKt {
    private static ImageVector _wifiCalling;

    public static final ImageVector getWifiCalling(Icons.Rounded rounded) {
        ImageVector imageVector = _wifiCalling;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiCalling", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 4.95f);
        b.curveTo(21.79f, 4.78f, 19.67f, 3.0f, 16.5f, 3.0f);
        b.curveToRelative(-3.18f, 0.0f, -5.29f, 1.78f, -5.5f, 1.95f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 16.5f, 12.0f, 22.0f, 4.95f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.2f, 15.28f, -2.54f, -0.29f);
        e.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        e.lineToRelative(-1.84f, 1.84f);
        e.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        e.lineToRelative(1.85f, -1.85f);
        e.curveToRelative(0.43f, -0.43f, 0.64f, -1.04f, 0.57f, -1.64f);
        e.lineTo(8.72f, 4.8f);
        e.curveTo(8.6f, 3.79f, 7.75f, 3.03f, 6.73f, 3.03f);
        e.horizontalLineTo(5.0f);
        e.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        e.curveTo(3.53f, 13.64f, 10.36f, 20.47f, 18.9f, 21.0f);
        e.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        e.verticalLineToRelative(-1.73f);
        e.curveTo(20.97f, 16.25f, 20.21f, 15.4f, 19.2f, 15.28f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiCalling = build;
        build.getClass();
        return build;
    }
}
