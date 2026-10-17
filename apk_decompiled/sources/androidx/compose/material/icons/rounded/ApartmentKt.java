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
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ApartmentKt {
    private static ImageVector _apartment;

    public static final ImageVector getApartment(Icons.Rounded rounded) {
        ImageVector imageVector = _apartment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Apartment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(17.0f, 11.0f, 5.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(9.0f);
        d.curveTo(7.9f, 3.0f, 7.0f, 3.9f, 7.0f, 5.0f);
        d.verticalLineToRelative(2.0f);
        d.horizontalLineTo(5.0f);
        d.curveTo(3.9f, 7.0f, 3.0f, 7.9f, 3.0f, 9.0f);
        d.verticalLineToRelative(10.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(5.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(d, -3.0f, 2.0f, 3.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(5.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kp0.B(d, 17.0f, 7.0f, 19.0f, 5.0f);
        k4.p(d, -2.0f, 2.0f, 19.0f);
        k4.A(d, 7.0f, 15.0f, 5.0f, -2.0f);
        uo.r(d, 2.0f, 15.0f, 7.0f, 11.0f);
        uo.o(d, 5.0f, 9.0f, 2.0f, 11.0f);
        k4.A(d, 11.0f, 15.0f, 9.0f, -2.0f);
        uo.r(d, 2.0f, 15.0f, 11.0f, 11.0f);
        uo.o(d, 9.0f, 9.0f, 2.0f, 11.0f);
        uo.p(d, 11.0f, 7.0f, 9.0f, 5.0f);
        uo.r(d, 2.0f, 7.0f, 15.0f, 15.0f);
        bv.l(d, -2.0f, -2.0f, 2.0f, 15.0f);
        j50.y(d, 15.0f, 11.0f, -2.0f, 9.0f);
        uo.r(d, 2.0f, 11.0f, 15.0f, 7.0f);
        j50.D(d, -2.0f, 5.0f, 2.0f, 7.0f);
        k4.C(d, 19.0f, 19.0f, -2.0f, -2.0f);
        uo.r(d, 2.0f, 19.0f, 19.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(d, -2.0f, -2.0f, 2.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _apartment = build;
        build.getClass();
        return build;
    }
}
