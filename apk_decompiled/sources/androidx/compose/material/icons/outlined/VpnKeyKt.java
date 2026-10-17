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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VpnKeyKt {
    private static ImageVector _vpnKey;

    public static final ImageVector getVpnKey(Icons.Outlined outlined) {
        ImageVector imageVector = _vpnKey;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VpnKey", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(22.0f, 19.0f, -6.0f, -4.0f, -2.68f);
        n.curveToRelative(-1.14f, 2.42f, -3.6f, 4.0f, -6.32f, 4.0f);
        n.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        n.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        n.curveToRelative(2.72f, 0.0f, 5.17f, 1.58f, 6.32f, 4.0f);
        af0.m(n, 24.0f, 9.0f, 6.0f, -2.0f);
        bv.m(n, 4.0f, 18.0f, 17.0f, 2.0f);
        kf0.z(n, -4.0f, 2.0f, -2.0f);
        n.lineTo(11.94f, 11.0f);
        n.lineToRelative(-0.23f, -0.67f);
        n.curveTo(11.01f, 8.34f, 9.11f, 7.0f, 7.0f, 7.0f);
        n.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        n.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        n.curveToRelative(2.11f, 0.0f, 4.01f, -1.34f, 4.71f, -3.33f);
        n.lineToRelative(0.23f, -0.67f);
        bv.r(n, 18.0f, 13.0f, 4.0f);
        n.moveTo(7.0f, 15.0f);
        n.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        n.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        n.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        n.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        n.close();
        n.moveTo(7.0f, 11.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        n.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        n.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(n, -0.45f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnKey = build;
        build.getClass();
        return build;
    }
}
