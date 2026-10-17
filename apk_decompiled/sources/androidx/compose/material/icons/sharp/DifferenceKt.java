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
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DifferenceKt {
    private static ImageVector _difference;

    public static final ImageVector getDifference(Icons.Sharp sharp) {
        ImageVector imageVector = _difference;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Difference", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(18.0f, 23.0f, 2.0f, 7.0f, 2.0f);
        k4.p(f, 14.0f, 14.0f, 23.0f);
        f.moveTo(15.0f, 1.0f);
        f.horizontalLineTo(6.01f);
        f.lineTo(6.0f, 19.0f);
        f.horizontalLineToRelative(15.0f);
        bv.k(f, 7.0f, 15.0f, 1.0f);
        k4.C(f, 16.5f, 15.0f, -6.0f, -2.0f);
        uo.r(f, 6.0f, 15.0f, 16.5f, 9.0f);
        af0.w(f, -2.0f, 2.0f, -2.0f, 9.0f);
        af0.n(f, -2.0f, 7.0f, 2.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(f, 2.0f, 2.0f, 2.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _difference = build;
        build.getClass();
        return build;
    }
}
