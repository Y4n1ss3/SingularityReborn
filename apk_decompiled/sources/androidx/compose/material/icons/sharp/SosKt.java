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
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SosKt {
    private static ImageVector _sos;

    public static final ImageVector getSos(Icons.Sharp sharp) {
        ImageVector imageVector = _sos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Sos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(15.5f, 7.0f, -7.0f, 10.0f, 7.0f);
        k4.D(n, 7.0f, 13.5f, 15.0f, -3.0f);
        c21.c(n, 9.0f, 3.0f, 15.0f);
        k4.C(n, 1.0f, 15.0f, 4.0f, -2.0f);
        kf0.o(n, 1.0f, 7.0f, 6.0f, 2.0f);
        uf.k(n, 3.0f, 2.0f, 4.0f, 6.0f);
        bv.s(n, 1.0f, 15.0f, 17.0f, 15.0f);
        af0.w(n, 4.0f, -2.0f, -4.0f, 7.0f);
        af0.v(n, 6.0f, 2.0f, -4.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(n, 4.0f, 6.0f, -6.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sos = build;
        build.getClass();
        return build;
    }
}
