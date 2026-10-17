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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Sharp sharp) {
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.0f, 11.0f, 2.0f, -2.0f);
        e.curveToRelative(-3.73f, -3.73f, -8.87f, -5.15f, -13.7f, -4.31f);
        e.lineToRelative(2.58f, 2.58f);
        e.curveToRelative(3.3f, -0.02f, 6.61f, 1.22f, 9.12f, 3.73f);
        k4.x(e, 9.0f, 17.0f, 3.0f, 3.0f);
        e.lineToRelative(3.0f, -3.0f);
        e.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        e.close();
        e.moveTo(19.0f, 13.0f);
        e.curveToRelative(-1.08f, -1.08f, -2.36f, -1.85f, -3.72f, -2.33f);
        fc.C(e, 3.02f, 3.02f, 0.7f, -0.69f);
        e.moveTo(3.41f, 1.64f);
        e.lineTo(2.0f, 3.05f);
        e.lineTo(5.05f, 6.1f);
        e.curveTo(3.59f, 6.83f, 2.22f, 7.79f, 1.0f, 9.0f);
        e.lineToRelative(2.0f, 2.0f);
        e.curveToRelative(1.23f, -1.23f, 2.65f, -2.16f, 4.17f, -2.78f);
        e.lineToRelative(2.24f, 2.24f);
        e.curveTo(7.79f, 10.89f, 6.27f, 11.74f, 5.0f, 13.0f);
        e.lineToRelative(2.0f, 2.0f);
        e.curveToRelative(1.35f, -1.35f, 3.11f, -2.04f, 4.89f, -2.06f);
        e.lineToRelative(7.08f, 7.08f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.41f, -1.41f, 3.41f, 1.64f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiOff = build;
        build.getClass();
        return build;
    }
}
