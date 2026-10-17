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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _11mpKt {
    private static ImageVector __11mp;

    public static final ImageVector get_11mp(Icons.Sharp sharp) {
        ImageVector imageVector = __11mp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._11mp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(3.0f, 3.0f, 18.0f, 18.0f, 3.0f);
        kp0.r(w, 3.0f, 8.0f, 5.5f, 3.0f);
        gy.A(w, 6.0f, 9.5f, 7.0f, 8.0f);
        k4.B(w, 5.5f, 12.5f, 18.5f, 11.0f);
        j50.B(w, 14.0f, -1.0f, 3.0f, 8.5f);
        uf.s(w, -3.0f, -1.0f, 4.5f, 6.0f);
        k4.p(w, -6.0f, 6.5f, 18.5f);
        k4.C(w, 13.0f, 5.5f, 3.0f, 6.0f);
        kf0.i(w, -1.5f, 7.0f, 13.0f, 5.5f);
        k4.C(w, 18.0f, 17.0f, -3.0f, 1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(w, -1.5f, -6.0f, 18.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(15.0f, 14.0f, 1.5f, 1.5f, -1.5f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __11mp = build;
        build.getClass();
        return build;
    }
}
