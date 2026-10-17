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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyBitcoinKt {
    private static ImageVector _currencyBitcoin;

    public static final ImageVector getCurrencyBitcoin(Icons.TwoTone twoTone) {
        ImageVector imageVector = _currencyBitcoin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CurrencyBitcoin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.06f, 11.57f);
        b.curveTo(17.65f, 10.88f, 18.0f, 9.98f, 18.0f, 9.0f);
        b.curveToRelative(0.0f, -1.86f, -1.27f, -3.43f, -3.0f, -3.87f);
        fc.w(b, 15.0f, 3.0f, -2.0f, 2.0f);
        af0.p(b, -2.0f, 3.0f, 9.0f, 2.0f);
        uf.k(b, 6.0f, 2.0f, 2.0f, 10.0f);
        uf.k(b, 6.0f, 2.0f, 3.0f, 2.0f);
        af0.v(b, 2.0f, -2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveTo(19.0f, 13.55f, 18.22f, 12.27f, 17.06f, 11.57f);
        af0.l(b, 10.0f, 7.0f, 4.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        uo.r(b, -4.0f, 7.0f, 15.0f, 17.0f);
        kf0.x(b, -5.0f, -4.0f, 5.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.1f, 17.0f, 15.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyBitcoin = build;
        build.getClass();
        return build;
    }
}
