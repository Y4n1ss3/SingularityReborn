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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalWifiOffKt {
    private static ImageVector _signalWifiOff;

    public static final ImageVector getSignalWifiOff(Icons.Sharp sharp) {
        ImageVector imageVector = _signalWifiOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SignalWifiOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.64f, 7.0f);
        b.curveToRelative(-0.45f, -0.34f, -4.93f, -4.0f, -11.64f, -4.0f);
        b.curveToRelative(-1.32f, 0.0f, -2.55f, 0.14f, -3.69f, 0.38f);
        r6.C(b, 18.43f, 13.5f, 23.64f, 7.0f);
        b.moveTo(3.41f, 1.31f);
        b.lineTo(2.0f, 2.72f);
        b.lineToRelative(2.05f, 2.05f);
        b.curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7.0f);
        b.lineTo(12.0f, 21.5f);
        b.lineToRelative(3.91f, -4.87f);
        b.lineToRelative(3.32f, 3.32f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.41f, -1.41f, 3.41f, 1.31f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiOff = build;
        build.getClass();
        return build;
    }
}
