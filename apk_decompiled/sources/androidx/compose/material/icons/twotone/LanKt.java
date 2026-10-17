package androidx.compose.material.icons.twotone;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LanKt {
    private static ImageVector _lan;

    public static final ImageVector getLan(Icons.TwoTone twoTone) {
        ImageVector imageVector = _lan;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Lan", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(10.0f, 7.0f, 4.0f, 4.0f, 3.0f);
        kp0.D(c, 10.0f, 9.0f, 17.0f, 3.0f);
        fc.j(c, 5.0f, -3.0f, 9.0f);
        bv.y(c, 19.0f, 17.0f, 3.0f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(c, -3.0f, 19.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(13.0f, 22.0f, 8.0f, -7.0f, -3.0f);
        k4.l(n, -4.0f, -5.0f, 9.0f, 3.0f);
        bv.A(n, 2.0f, 8.0f, 7.0f, 3.0f);
        af0.s(n, 2.0f, 6.0f, 4.0f, 3.0f);
        uf.s(n, 7.0f, 8.0f, -7.0f, 8.0f);
        r6.D(n, -2.0f, 8.0f, 2.0f, -3.0f);
        uo.y(n, 22.0f, 10.0f, 7.0f, 4.0f);
        kp0.j(n, 4.0f, 3.0f, 10.0f);
        uf.D(n, 9.0f, 17.0f, 3.0f, 5.0f);
        kf0.n(n, -3.0f, 9.0f, 19.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(n, 3.0f, -4.0f, -3.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lan = build;
        build.getClass();
        return build;
    }
}
