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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VpnLockKt {
    private static ImageVector _vpnLock;

    public static final ImageVector getVpnLock(Icons.Sharp sharp) {
        ImageVector imageVector = _vpnLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VpnLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 13.0f);
        b.curveToRelative(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
        b.lineTo(16.9f, 17.0f);
        b.lineTo(14.0f, 17.0f);
        bv.q(b, -4.0f, 7.0f, 13.0f, -2.0f);
        uo.n(b, 3.0f, 10.0f, 8.0f, 4.0f);
        b.lineTo(14.0f, 3.46f);
        b.curveToRelative(-0.95f, -0.3f, -1.95f, -0.46f, -3.0f, -0.46f);
        b.curveTo(5.48f, 3.0f, 1.0f, 7.48f, 1.0f, 13.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.05f, -1.0f);
        b.horizontalLineToRelative(-2.03f);
        b.curveToRelative(0.04f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f);
        b.close();
        b.moveTo(10.0f, 20.93f);
        b.curveToRelative(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        b.curveToRelative(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        af0.m(b, 8.0f, 16.0f, 3.0f, 2.0f);
        kp0.z(b, 1.93f, 22.0f, 4.0f, -0.36f);
        b.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        b.curveTo(18.26f, 0.86f, 17.0f, 2.03f, 17.0f, 3.5f);
        fc.w(b, 17.0f, 4.0f, -1.0f, 6.0f);
        uf.C(b, 7.0f, 23.0f, 4.0f, -1.0f);
        k4.C(b, 21.0f, 4.0f, -3.0f, -0.5f);
        b.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 21.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnLock = build;
        build.getClass();
        return build;
    }
}
