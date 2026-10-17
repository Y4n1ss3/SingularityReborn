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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BusinessKt {
    private static ImageVector _business;

    public static final ImageVector getBusiness(Icons.TwoTone twoTone) {
        ImageVector imageVector = _business;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Business", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(12.0f, 11.0f, 2.0f, 2.0f, -2.0f);
        r6.D(n, 2.0f, 2.0f, 2.0f, -2.0f);
        uo.B(n, 2.0f, 8.0f, 20.0f, 9.0f);
        fc.x(n, -8.0f, 2.0f, 16.0f, 11.0f);
        gy.D(n, 2.0f, 2.0f, -2.0f, -2.0f);
        k4.C(n, 16.0f, 15.0f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(n, -2.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(16.0f, 15.0f, 2.0f, 2.0f, -2.0f);
        k4.C(q, 16.0f, 11.0f, 2.0f, 2.0f);
        j50.t(q, -2.0f, 22.0f, 7.0f);
        q.lineTo(12.0f, 7.0f);
        q.lineTo(12.0f, 3.0f);
        af0.m(q, 2.0f, 3.0f, 18.0f, 20.0f);
        uo.l(q, 22.0f, 7.0f, 6.0f, 19.0f);
        af0.m(q, 4.0f, 19.0f, -2.0f, 2.0f);
        r6.l(q, 2.0f, 6.0f, 15.0f);
        af0.m(q, 4.0f, 15.0f, -2.0f, 2.0f);
        r6.l(q, 2.0f, 6.0f, 11.0f);
        q.lineTo(4.0f, 11.0f);
        r6.m(q, 4.0f, 9.0f, 2.0f, 2.0f);
        q.moveTo(6.0f, 7.0f);
        q.lineTo(4.0f, 7.0f);
        r6.m(q, 4.0f, 5.0f, 2.0f, 2.0f);
        q.moveTo(10.0f, 19.0f);
        af0.m(q, 8.0f, 19.0f, -2.0f, 2.0f);
        r6.l(q, 2.0f, 10.0f, 15.0f);
        af0.m(q, 8.0f, 15.0f, -2.0f, 2.0f);
        r6.l(q, 2.0f, 10.0f, 11.0f);
        q.lineTo(8.0f, 11.0f);
        r6.m(q, 8.0f, 9.0f, 2.0f, 2.0f);
        q.moveTo(10.0f, 7.0f);
        q.lineTo(8.0f, 7.0f);
        r6.m(q, 8.0f, 5.0f, 2.0f, 2.0f);
        k4.C(q, 20.0f, 19.0f, -8.0f, -2.0f);
        af0.v(q, 2.0f, -2.0f, -2.0f, -2.0f);
        kf0.x(q, 2.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(q, 12.0f, 9.0f, 8.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _business = build;
        build.getClass();
        return build;
    }
}
