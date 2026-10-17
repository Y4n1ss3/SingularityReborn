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
import defpackage.af0;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalWifi0BarKt {
    private static ImageVector _signalWifi0Bar;

    public static final ImageVector getSignalWifi0Bar(Icons.Filled filled) {
        ImageVector imageVector = _signalWifi0Bar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SignalWifi0Bar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 6.0f, 12.0f, 6.0f);
        i.curveToRelative(3.33f, 0.0f, 6.49f, 1.08f, 9.08f, 3.07f);
        i.lineTo(12.0f, 18.17f);
        i.lineToRelative(-9.08f, -9.1f);
        i.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        i.moveTo(12.0f, 4.0f);
        i.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        i.lineTo(12.0f, 21.0f);
        i.lineTo(24.0f, 8.98f);
        i.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifi0Bar = build;
        build.getClass();
        return build;
    }
}
