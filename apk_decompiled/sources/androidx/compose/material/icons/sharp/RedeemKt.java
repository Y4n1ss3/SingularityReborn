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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RedeemKt {
    private static ImageVector _redeem;

    public static final ImageVector getRedeem(Icons.Sharp sharp) {
        ImageVector imageVector = _redeem;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Redeem", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(22.0f, 6.0f, -4.18f);
        a.curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1.0f);
        a.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        a.curveToRelative(-1.05f, 0.0f, -1.96f, 0.54f, -2.5f, 1.35f);
        a.lineToRelative(-0.5f, 0.67f);
        a.lineToRelative(-0.5f, -0.68f);
        a.curveTo(10.96f, 2.54f, 10.05f, 2.0f, 9.0f, 2.0f);
        a.curveTo(7.34f, 2.0f, 6.0f, 3.34f, 6.0f, 5.0f);
        a.curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f);
        af0.m(a, 2.0f, 6.0f, 15.0f, 20.0f);
        uo.l(a, 22.0f, 6.0f, 15.0f, 4.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.close();
        a.moveTo(9.0f, 4.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        k4.r(a, 20.0f, 19.0f, 4.0f, 19.0f);
        r6.p(a, -2.0f, 16.0f, 2.0f);
        a.moveTo(20.0f, 14.0f);
        a.lineTo(4.0f, 14.0f);
        a.lineTo(4.0f, 8.0f);
        a.horizontalLineToRelative(5.08f);
        a.lineTo(7.0f, 10.83f);
        a.lineTo(8.62f, 12.0f);
        a.lineTo(12.0f, 7.4f);
        a.lineToRelative(3.38f, 4.6f);
        a.lineTo(17.0f, 10.83f);
        a.lineTo(14.92f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(a, 20.0f, 8.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _redeem = build;
        build.getClass();
        return build;
    }
}
