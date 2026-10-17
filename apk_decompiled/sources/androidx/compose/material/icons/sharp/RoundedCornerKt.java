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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoundedCornerKt {
    private static ImageVector _roundedCorner;

    public static final ImageVector getRoundedCorner(Icons.Sharp sharp) {
        ImageVector imageVector = _roundedCorner;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RoundedCorner", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(19.0f, 19.0f, 2.0f, 2.0f, -2.0f);
        k4.D(n, 19.0f, 19.0f, 17.0f, 2.0f);
        k4.p(n, -2.0f, -2.0f, 17.0f);
        k4.C(n, 3.0f, 13.0f, 2.0f, -2.0f);
        bv.s(n, 3.0f, 13.0f, 3.0f, 17.0f);
        gy.t(n, 2.0f, -2.0f, 3.0f, 17.0f);
        j50.y(n, 3.0f, 9.0f, 2.0f, 7.0f);
        bv.s(n, 3.0f, 9.0f, 3.0f, 5.0f);
        kf0.i(n, 2.0f, 3.0f, 3.0f, 5.0f);
        j50.y(n, 7.0f, 5.0f, 2.0f, 3.0f);
        bv.s(n, 7.0f, 5.0f, 15.0f, 21.0f);
        bv.l(n, 2.0f, -2.0f, -2.0f, 21.0f);
        k4.C(n, 11.0f, 21.0f, 2.0f, -2.0f);
        uo.r(n, -2.0f, 21.0f, 15.0f, 21.0f);
        bv.l(n, 2.0f, -2.0f, -2.0f, 21.0f);
        k4.C(n, 7.0f, 21.0f, 2.0f, -2.0f);
        bv.s(n, 7.0f, 21.0f, 3.0f, 21.0f);
        gy.t(n, 2.0f, -2.0f, 3.0f, 21.0f);
        n.moveTo(21.0f, 8.0f);
        n.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        kf0.x(n, -5.0f, 2.0f, 5.0f);
        n.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(n, 5.0f, 2.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roundedCorner = build;
        build.getClass();
        return build;
    }
}
