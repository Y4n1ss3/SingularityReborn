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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _3mpKt {
    private static ImageVector __3mp;

    public static final ImageVector get_3mp(Icons.Sharp sharp) {
        ImageVector imageVector = __3mp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._3mp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(3.0f, 3.0f, 18.0f, 18.0f, 3.0f);
        kp0.B(w, 3.0f, 12.5f, 18.5f, 11.0f);
        j50.B(w, 14.0f, -1.0f, 3.0f, 8.5f);
        uf.s(w, -3.0f, -1.0f, 4.5f, 6.0f);
        k4.p(w, -6.0f, 6.5f, 18.5f);
        j50.y(w, 10.0f, 10.0f, 3.0f, 9.0f);
        af0.n(w, -2.0f, 8.0f, 2.0f, 7.0f);
        af0.q(w, -3.0f, 5.5f, 4.5f, 6.0f);
        bv.s(w, 10.0f, 10.0f, 18.0f, 17.0f);
        af0.v(w, -3.0f, 1.5f, -1.5f, -6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(w, 18.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(15.0f, 14.0f, 1.5f, 1.5f, -1.5f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __3mp = build;
        build.getClass();
        return build;
    }
}
