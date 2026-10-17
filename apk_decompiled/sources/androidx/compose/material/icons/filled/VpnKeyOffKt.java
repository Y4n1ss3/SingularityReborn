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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VpnKeyOffKt {
    private static ImageVector _vpnKeyOff;

    public static final ImageVector getVpnKeyOff(Icons.Filled filled) {
        ImageVector imageVector = _vpnKeyOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VpnKeyOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(20.83f, 18.0f, 21.0f, -4.0f, 2.0f);
        i.verticalLineToRelative(-4.0f);
        i.horizontalLineTo(12.83f);
        i.lineTo(20.83f, 18.0f);
        i.close();
        i.moveTo(19.78f, 22.61f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineTo(2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(2.59f, 2.59f);
        i.curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f);
        i.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        i.curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f);
        uo.l(i, 19.78f, 22.61f, 8.99f, 11.82f);
        i.curveTo(9.0f, 11.88f, 9.0f, 11.94f, 9.0f, 12.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        i.curveToRelative(0.06f, 0.0f, 0.12f, 0.0f, 0.18f, 0.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 8.99f, 11.82f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnKeyOff = build;
        build.getClass();
        return build;
    }
}
