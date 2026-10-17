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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _10mpKt {
    private static ImageVector __10mp;

    public static final ImageVector get_10mp(Icons.Sharp sharp) {
        ImageVector imageVector = __10mp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._10mp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(13.5f, 7.0f, 15.0f, 3.0f, -1.5f);
        k4.B(i, 7.0f, 21.0f, 3.0f, 3.0f);
        k4.p(i, 18.0f, 18.0f, 3.0f);
        uo.p(i, 12.5f, 18.5f, 11.0f, 14.0f);
        af0.z(i, -1.0f, 3.0f, 8.5f, -3.0f);
        af0.z(i, -1.0f, 4.5f, 6.0f, -6.0f);
        uo.r(i, 6.5f, 18.5f, 15.0f, 18.5f);
        gy.o(i, -1.5f, -6.0f, 18.0f, 17.0f);
        uo.r(i, -3.0f, 18.5f, 10.0f, 5.5f);
        gy.A(i, 6.0f, 8.5f, 7.0f, 7.0f);
        bv.z(i, 5.5f, 10.0f, 16.5f, 5.5f);
        i.verticalLineToRelative(6.0f);
        i.horizontalLineTo(12.0f);
        i.verticalLineToRelative(-6.0f);
        i.horizontalLineTo(16.5f);
        i.close();
        k4.C(i, 15.0f, 14.0f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(i, 15.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __10mp = build;
        build.getClass();
        return build;
    }
}
