package androidx.compose.material.icons.outlined;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VpnKeyOffKt {
    private static ImageVector _vpnKeyOff;

    public static final ImageVector getVpnKeyOff(Icons.Outlined outlined) {
        ImageVector imageVector = _vpnKeyOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VpnKeyOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.81f, 2.81f, 1.39f, 4.22f);
        i.lineToRelative(2.59f, 2.59f);
        i.curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f);
        i.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        i.curveToRelative(2.22f, 0.0f, 4.15f, -1.21f, 5.19f, -3.0f);
        i.lineToRelative(7.59f, 7.61f);
        gy.B(i, 1.41f, -1.41f, 2.81f, 2.81f);
        i.moveTo(7.0f, 16.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        i.curveToRelative(0.0f, -1.67f, 1.02f, -3.1f, 2.47f, -3.7f);
        i.lineToRelative(1.71f, 1.71f);
        i.curveTo(7.12f, 10.0f, 7.06f, 10.0f, 7.0f, 10.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        i.curveToRelative(0.0f, -0.06f, 0.0f, -0.12f, -0.01f, -0.18f);
        i.lineToRelative(1.74f, 1.74f);
        i.curveTo(10.22f, 14.48f, 9.14f, 16.0f, 7.0f, 16.0f);
        fc.A(i, 17.0f, 14.17f, 13.0f, -1.17f);
        uo.l(i, 17.0f, 14.17f, 13.83f, 11.0f);
        uf.k(i, 21.0f, 2.0f, -2.0f, 3.0f);
        r6.A(i, 2.0f, 2.0f, -3.0f, 2.0f);
        i.verticalLineTo(9.0f);
        i.horizontalLineTo(11.83f);
        i.lineTo(13.83f, 11.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnKeyOff = build;
        build.getClass();
        return build;
    }
}
