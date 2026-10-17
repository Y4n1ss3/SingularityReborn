package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VpnLockKt {
    private static ImageVector _vpnLock;

    public static final ImageVector getVpnLock(Icons.Rounded rounded) {
        ImageVector imageVector = _vpnLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VpnLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.92f, 11.0f);
        b.curveToRelative(0.44f, 3.63f, -1.52f, 5.85f, -2.02f, 6.39f);
        b.curveTo(17.64f, 16.58f, 16.9f, 16.0f, 16.0f, 16.0f);
        b.horizontalLineToRelative(-1.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        af0.u(b, 8.0f, -2.0f, 2.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(7.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(2.46f);
        b.curveTo(14.05f, 2.16f, 13.05f, 2.0f, 12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.curveToRelative(5.73f, 0.0f, 10.51f, -4.86f, 9.95f, -11.0f);
        k4.w(b, 19.92f, 11.0f, 19.93f);
        b.curveTo(7.05f, 19.44f, 4.0f, 16.08f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        b.lineTo(9.0f, 15.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        uo.y(b, 19.93f, 22.0f, 4.0f, 3.11f);
        b.curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f);
        b.curveTo(19.08f, 0.82f, 18.0f, 1.79f, 18.0f, 3.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(5.0f);
        b.curveTo(23.0f, 4.45f, 22.55f, 4.0f, 22.0f, 4.0f);
        af0.r(b, 21.0f, 4.0f, -2.0f, 3.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vpnLock = build;
        build.getClass();
        return build;
    }
}
