package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VpnLockKt {
    private static ImageVector _vpnLock;

    public static final ImageVector getVpnLock(Icons.TwoTone twoTone) {
        ImageVector imageVector = _vpnLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VpnLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(12.0f, 8.0f, -2.0f, 2.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        af0.m(b, 7.0f, 11.0f, 2.0f, 6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.9f, 0.0f, 1.64f, 0.58f, 1.9f, 1.39f);
        b.curveTo(18.2f, 16.97f, 19.0f, 15.08f, 19.0f, 13.0f);
        b.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.08f, -1.0f);
        b.lineTo(17.0f, 12.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        b.lineTo(14.0f, 6.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        bv.v(b, 8.0f, 17.0f, -1.0f);
        b.lineToRelative(-4.79f, -4.79f);
        b.curveTo(3.08f, 11.79f, 3.0f, 12.38f, 3.0f, 13.0f);
        b.curveToRelative(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
        b.lineTo(10.0f, 19.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(18.92f, 12.0f);
        b2.curveToRelative(0.04f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f);
        b2.curveToRelative(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
        b2.curveToRelative(-0.26f, -0.81f, -1.0f, -1.39f, -1.9f, -1.39f);
        b2.horizontalLineToRelative(-1.0f);
        b2.verticalLineToRelative(-3.0f);
        b2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        af0.m(b2, 7.0f, 13.0f, -2.0f, 2.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.lineTo(10.0f, 8.0f);
        b2.horizontalLineToRelative(2.0f);
        b2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b2.lineTo(14.0f, 3.46f);
        b2.curveToRelative(-0.95f, -0.3f, -1.95f, -0.46f, -3.0f, -0.46f);
        b2.curveTo(5.48f, 3.0f, 1.0f, 7.48f, 1.0f, 13.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.05f, -1.0f);
        j50.t(b2, -2.03f, 10.0f, 20.93f);
        b2.curveToRelative(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        b2.curveToRelative(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        b2.lineTo(8.0f, 16.0f);
        b2.verticalLineToRelative(1.0f);
        b2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kp0.z(b2, 1.93f, 22.0f, 4.0f, -0.5f);
        b2.curveTo(22.0f, 2.12f, 20.88f, 1.0f, 19.5f, 1.0f);
        b2.reflectiveCurveTo(17.0f, 2.12f, 17.0f, 3.5f);
        b2.lineTo(17.0f, 4.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b2.verticalLineToRelative(4.0f);
        b2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b2.horizontalLineToRelative(5.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.lineTo(23.0f, 5.0f);
        b2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        r6.B(b2, 21.0f, 4.0f, -3.0f, -0.5f);
        b2.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        b2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 21.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnLock = build;
        build.getClass();
        return build;
    }
}
