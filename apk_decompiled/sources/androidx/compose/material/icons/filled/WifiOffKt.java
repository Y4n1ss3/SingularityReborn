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
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Filled filled) {
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.99f, 9.0f);
        b.curveTo(19.15f, 5.16f, 13.8f, 3.76f, 8.84f, 4.78f);
        b.lineToRelative(2.52f, 2.52f);
        b.curveToRelative(3.47f, -0.17f, 6.99f, 1.05f, 9.63f, 3.7f);
        fc.B(b, 2.0f, -2.0f, 18.99f, 13.0f);
        b.curveToRelative(-1.29f, -1.29f, -2.84f, -2.13f, -4.49f, -2.56f);
        fc.C(b, 3.53f, 3.53f, 0.96f, -0.97f);
        b.moveTo(2.0f, 3.05f);
        b.lineTo(5.07f, 6.1f);
        b.curveTo(3.6f, 6.82f, 2.22f, 7.78f, 1.0f, 9.0f);
        b.lineToRelative(1.99f, 2.0f);
        b.curveToRelative(1.24f, -1.24f, 2.67f, -2.16f, 4.2f, -2.77f);
        b.lineToRelative(2.24f, 2.24f);
        b.curveTo(7.81f, 10.89f, 6.27f, 11.73f, 5.0f, 13.0f);
        b.verticalLineToRelative(0.01f);
        b.lineTo(6.99f, 15.0f);
        b.curveToRelative(1.36f, -1.36f, 3.14f, -2.04f, 4.92f, -2.06f);
        b.lineTo(18.98f, 20.0f);
        b.lineToRelative(1.27f, -1.26f);
        r6.C(b, 3.29f, 1.79f, 2.0f, 3.05f);
        b.moveTo(9.0f, 17.0f);
        b.lineToRelative(3.0f, 3.0f);
        b.lineToRelative(3.0f, -3.0f);
        b.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiOff = build;
        build.getClass();
        return build;
    }
}
