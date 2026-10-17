package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiFindKt {
    private static ImageVector _wifiFind;

    public static final ImageVector getWifiFind(Icons.Filled filled) {
        ImageVector imageVector = _wifiFind;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiFind", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.0f, 14.0f);
        b.curveToRelative(0.0f, -3.36f, 2.64f, -6.0f, 6.0f, -6.0f);
        b.curveToRelative(2.2f, 0.0f, 4.08f, 1.13f, 5.13f, 2.86f);
        b.lineTo(24.0f, 8.98f);
        b.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        b.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        b.lineTo(12.0f, 21.0f);
        b.lineToRelative(1.86f, -1.87f);
        b.curveTo(12.14f, 18.09f, 11.0f, 16.2f, 11.0f, 14.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(21.0f, 14.0f);
        b2.curveToRelative(0.0f, -2.24f, -1.76f, -4.0f, -4.0f, -4.0f);
        b2.reflectiveCurveToRelative(-4.0f, 1.76f, -4.0f, 4.0f);
        b2.curveToRelative(0.0f, 2.24f, 1.76f, 4.0f, 4.0f, 4.0f);
        b2.curveToRelative(0.75f, 0.0f, 1.44f, -0.21f, 2.03f, -0.56f);
        b2.lineTo(21.59f, 20.0f);
        b2.lineTo(23.0f, 18.59f);
        b2.lineToRelative(-2.56f, -2.56f);
        b2.curveTo(20.79f, 15.44f, 21.0f, 14.75f, 21.0f, 14.0f);
        b2.close();
        b2.moveTo(15.0f, 14.0f);
        b2.curveToRelative(0.0f, -1.12f, 0.88f, -2.0f, 2.0f, -2.0f);
        b2.reflectiveCurveToRelative(2.0f, 0.88f, 2.0f, 2.0f);
        b2.curveToRelative(0.0f, 1.12f, -0.88f, 2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 15.0f, 15.12f, 15.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiFind = build;
        build.getClass();
        return build;
    }
}
