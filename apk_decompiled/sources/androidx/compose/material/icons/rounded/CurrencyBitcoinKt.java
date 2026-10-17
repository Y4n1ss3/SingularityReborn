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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyBitcoinKt {
    private static ImageVector _currencyBitcoin;

    public static final ImageVector getCurrencyBitcoin(Icons.Rounded rounded) {
        ImageVector imageVector = _currencyBitcoin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyBitcoin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(10.0f, 7.0f, 4.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        a.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        uo.r(a, -4.0f, 7.0f, 15.0f, 17.0f);
        kf0.x(a, -5.0f, -4.0f, 5.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        a.reflectiveCurveTo(16.1f, 17.0f, 15.0f, 17.0f);
        a.close();
        a.moveTo(15.0f, 4.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        bv.x(a, 1.0f, -2.0f, 4.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.reflectiveCurveTo(9.0f, 3.45f, 9.0f, 4.0f);
        a.verticalLineToRelative(1.0f);
        a.horizontalLineTo(7.0f);
        a.curveTo(6.45f, 5.0f, 6.0f, 5.45f, 6.0f, 6.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        k4.k(a, 1.0f, 10.0f, 7.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(2.0f);
        a.verticalLineToRelative(1.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(a, -1.0f, 2.0f, 1.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-1.0f);
        a.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        a.curveToRelative(0.0f, -1.45f, -0.78f, -2.73f, -1.94f, -3.43f);
        a.curveTo(17.65f, 10.88f, 18.0f, 9.98f, 18.0f, 9.0f);
        a.curveToRelative(0.0f, -1.86f, -1.27f, -3.43f, -3.0f, -3.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 15.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyBitcoin = build;
        build.getClass();
        return build;
    }
}
