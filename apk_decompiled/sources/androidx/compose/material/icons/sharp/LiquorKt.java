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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LiquorKt {
    private static ImageVector _liquor;

    public static final ImageVector getLiquor(Icons.Sharp sharp) {
        ImageVector imageVector = _liquor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Liquor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.0f, 14.0f);
        b.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        bv.A(b, 20.0f, 3.0f, 2.0f, 6.0f);
        r6.s(b, -2.0f, 7.0f, -3.18f);
        b.curveTo(8.16f, 16.4f, 9.0f, 15.3f, 9.0f, 14.0f);
        k4.t(b, 6.0f, 3.0f, 14.0f);
        k4.C(b, 5.0f, 8.0f, 2.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(b, 5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(22.0f, 9.0f, -3.0f, -1.01f, 2.0f);
        bv.p(j, -5.0f, 6.0f, -3.0f, 1.01f);
        c21.c(j, 22.0f, 11.0f, 9.0f);
        k4.C(j, 16.0f, 4.0f, 1.0f, 1.0f);
        uo.r(j, -1.0f, 4.0f, 13.0f, 10.44f);
        fc.u(j, 3.0f, -0.98f, 7.0f, 1.0f);
        k4.z(j, 2.46f, 3.0f, 0.98f, 12.0f);
        uo.r(j, -7.0f, 10.44f, 20.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(j, -7.0f, -2.0f, 7.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liquor = build;
        build.getClass();
        return build;
    }
}
