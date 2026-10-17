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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiKt {
    private static ImageVector _wifi;

    public static final ImageVector getWifi(Icons.Sharp sharp) {
        ImageVector imageVector = _wifi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Wifi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.0f, 9.0f, 2.0f, 2.0f);
        e.curveToRelative(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, 0.0f);
        e.lineToRelative(2.0f, -2.0f);
        e.curveTo(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
        k4.x(e, 9.0f, 17.0f, 3.0f, 3.0f);
        e.lineToRelative(3.0f, -3.0f);
        e.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        k4.x(e, 5.0f, 13.0f, 2.0f, 2.0f);
        e.curveToRelative(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, 0.0f);
        e.lineToRelative(2.0f, -2.0f);
        e.curveTo(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi = build;
        build.getClass();
        return build;
    }
}
