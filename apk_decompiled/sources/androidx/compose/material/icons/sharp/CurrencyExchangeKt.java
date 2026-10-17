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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyExchangeKt {
    private static ImageVector _currencyExchange;

    public static final ImageVector getCurrencyExchange(Icons.Sharp sharp) {
        ImageVector imageVector = _currencyExchange;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CurrencyExchange", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.89f, 11.1f);
        b.curveToRelative(-1.78f, -0.59f, -2.64f, -0.96f, -2.64f, -1.9f);
        b.curveToRelative(0.0f, -1.02f, 1.11f, -1.39f, 1.81f, -1.39f);
        b.curveToRelative(1.31f, 0.0f, 1.79f, 0.99f, 1.9f, 1.34f);
        b.lineToRelative(1.58f, -0.67f);
        b.curveTo(15.39f, 8.03f, 14.72f, 6.56f, 13.0f, 6.24f);
        kf0.r(b, 5.0f, -2.0f, 1.26f);
        b.curveTo(8.52f, 6.82f, 8.51f, 9.12f, 8.51f, 9.22f);
        b.curveToRelative(0.0f, 2.27f, 2.25f, 2.91f, 3.35f, 3.31f);
        b.curveToRelative(1.58f, 0.56f, 2.28f, 1.07f, 2.28f, 2.03f);
        b.curveToRelative(0.0f, 1.13f, -1.05f, 1.61f, -1.98f, 1.61f);
        b.curveToRelative(-1.82f, 0.0f, -2.34f, -1.87f, -2.4f, -2.09f);
        b.lineTo(8.1f, 14.75f);
        b.curveToRelative(0.63f, 2.19f, 2.28f, 2.78f, 2.9f, 2.96f);
        kf0.r(b, 19.0f, 2.0f, -1.24f);
        b.curveToRelative(0.4f, -0.09f, 2.9f, -0.59f, 2.9f, -3.22f);
        b.curveTo(15.9f, 13.15f, 15.29f, 11.93f, 12.89f, 11.1f);
        uo.q(b, 3.0f, 21.0f, 1.0f, -6.0f);
        bv.p(b, 6.0f, 2.0f, -2.48f, 0.0f);
        b.curveToRelative(1.61f, 2.41f, 4.36f, 4.0f, 7.48f, 4.0f);
        b.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 6.08f, -4.92f, 11.0f, -11.0f, 11.0f);
        b.curveToRelative(-3.72f, 0.0f, -7.01f, -1.85f, -9.0f, -4.67f);
        uo.l(b, 3.0f, 21.0f, 1.0f, 12.0f);
        b.curveTo(1.0f, 5.92f, 5.92f, 1.0f, 12.0f, 1.0f);
        b.curveToRelative(3.72f, 0.0f, 7.01f, 1.85f, 9.0f, 4.67f);
        fc.w(b, 21.0f, 3.0f, 2.0f, 6.0f);
        bv.w(b, -6.0f, 7.0f, 2.48f, 0.0f);
        b.curveTo(17.87f, 4.59f, 15.12f, 3.0f, 12.0f, 3.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyExchange = build;
        build.getClass();
        return build;
    }
}
