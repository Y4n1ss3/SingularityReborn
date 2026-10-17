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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ApartmentKt {
    private static ImageVector _apartment;

    public static final ImageVector getApartment(Icons.Outlined outlined) {
        ImageVector imageVector = _apartment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Apartment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(17.0f, 11.0f, 3.0f, 7.0f, 4.0f);
        uf.k(f, 3.0f, 14.0f, 8.0f, -4.0f);
        af0.w(f, 2.0f, 4.0f, 8.0f, 11.0f);
        kp0.B(f, 17.0f, 7.0f, 19.0f, 5.0f);
        k4.p(f, -2.0f, 2.0f, 19.0f);
        k4.A(f, 7.0f, 15.0f, 5.0f, -2.0f);
        uo.r(f, 2.0f, 15.0f, 7.0f, 11.0f);
        uo.o(f, 5.0f, 9.0f, 2.0f, 11.0f);
        k4.A(f, 11.0f, 15.0f, 9.0f, -2.0f);
        uo.r(f, 2.0f, 15.0f, 11.0f, 11.0f);
        uo.o(f, 9.0f, 9.0f, 2.0f, 11.0f);
        uo.p(f, 11.0f, 7.0f, 9.0f, 5.0f);
        uo.r(f, 2.0f, 7.0f, 15.0f, 15.0f);
        bv.l(f, -2.0f, -2.0f, 2.0f, 15.0f);
        j50.y(f, 15.0f, 11.0f, -2.0f, 9.0f);
        uo.r(f, 2.0f, 11.0f, 15.0f, 7.0f);
        j50.D(f, -2.0f, 5.0f, 2.0f, 7.0f);
        k4.C(f, 19.0f, 19.0f, -2.0f, -2.0f);
        uo.r(f, 2.0f, 19.0f, 19.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(f, -2.0f, -2.0f, 2.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _apartment = build;
        build.getClass();
        return build;
    }
}
