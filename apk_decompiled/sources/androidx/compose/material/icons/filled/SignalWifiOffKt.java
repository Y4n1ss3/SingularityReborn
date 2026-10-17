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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalWifiOffKt {
    private static ImageVector _signalWifiOff;

    public static final ImageVector getSignalWifiOff(Icons.Filled filled) {
        ImageVector imageVector = _signalWifiOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SignalWifiOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.64f, 7.0f);
        b.curveToRelative(-0.45f, -0.34f, -4.93f, -4.0f, -11.64f, -4.0f);
        b.curveToRelative(-1.5f, 0.0f, -2.89f, 0.19f, -4.15f, 0.48f);
        r6.C(b, 18.18f, 13.8f, 23.64f, 7.0f);
        b.moveTo(17.04f, 15.22f);
        b.lineTo(3.27f, 1.44f);
        b.lineTo(2.0f, 2.72f);
        b.lineToRelative(2.05f, 2.06f);
        b.curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7.0f);
        b.lineToRelative(11.63f, 14.49f);
        b.lineToRelative(0.01f, 0.01f);
        b.lineToRelative(0.01f, -0.01f);
        b.lineToRelative(3.9f, -4.86f);
        b.lineToRelative(3.32f, 3.32f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 1.27f, -1.27f, -3.46f, -3.46f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiOff = build;
        build.getClass();
        return build;
    }
}
