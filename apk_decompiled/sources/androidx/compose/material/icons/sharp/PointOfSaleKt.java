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
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PointOfSaleKt {
    private static ImageVector _pointOfSale;

    public static final ImageVector getPointOfSale(Icons.Sharp sharp) {
        ImageVector imageVector = _pointOfSale;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PointOfSale", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 2.0f, 5.0f);
        d.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        d.verticalLineToRelative(6.0f);
        d.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        d.lineTo(19.0f, 2.0f);
        d.curveTo(19.0f, 2.0f, 19.0f, 2.0f, 19.0f, 2.0f);
        c21.d(d, 17.0f, 6.0f, 7.0f, 4.0f);
        uo.r(d, 10.0f, 6.0f, 22.0f, 22.0f);
        d.horizontalLineTo(2.0f);
        d.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        uo.B(d, -3.0f, 20.0f, 22.0f, 22.0f);
        d.curveTo(22.0f, 22.0f, 22.0f, 22.0f, 22.0f, 22.0f);
        r6.g(d, 18.0f, 9.0f, 6.0f);
        d.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        d.lineToRelative(-4.0f, 9.0f);
        gy.n(d, 20.0f, 18.0f, 9.0f);
        k4.A(d, 10.0f, 16.0f, 8.0f, -1.0f);
        uo.r(d, 2.0f, 16.0f, 10.0f, 14.0f);
        bv.h(d, 8.0f, -1.0f, 2.0f, 14.0f);
        k4.A(d, 10.0f, 12.0f, 8.0f, -1.0f);
        uo.r(d, 2.0f, 12.0f, 13.0f, 16.0f);
        bv.l(d, -2.0f, -1.0f, 2.0f, 16.0f);
        k4.C(d, 13.0f, 14.0f, -2.0f, -1.0f);
        uo.r(d, 2.0f, 14.0f, 13.0f, 12.0f);
        bv.l(d, -2.0f, -1.0f, 2.0f, 12.0f);
        k4.C(d, 16.0f, 16.0f, -2.0f, -1.0f);
        uo.r(d, 2.0f, 16.0f, 16.0f, 14.0f);
        bv.l(d, -2.0f, -1.0f, 2.0f, 14.0f);
        k4.C(d, 16.0f, 12.0f, -2.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 2.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pointOfSale = build;
        build.getClass();
        return build;
    }
}
