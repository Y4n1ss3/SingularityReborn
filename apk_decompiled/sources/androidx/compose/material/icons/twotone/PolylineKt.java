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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PolylineKt {
    private static ImageVector _polyline;

    public static final ImageVector getPolyline(Icons.TwoTone twoTone) {
        ImageVector imageVector = _polyline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Polyline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(12.0f, 4.0f, 2.0f, 2.0f, -2.0f);
        k4.B(n, 4.0f, 7.0f, 14.0f, 5.0f);
        k4.p(n, -2.0f, 2.0f, 14.0f);
        k4.C(n, 19.0f, 20.0f, -2.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(n, 2.0f, 20.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n2 = kp0.n(15.0f, 16.0f, 1.26f, -6.0f, -3.0f);
        kf0.s(n2, -3.17f, 11.7f, 8.0f, 16.0f);
        kf0.r(n2, 2.0f, -6.0f, 4.9f);
        r6.w(n2, 7.3f, 10.0f, 3.0f, 6.0f);
        kp0.q(n2, 5.0f, 7.0f, 3.5f, 22.0f);
        kp0.j(n2, 6.0f, -6.0f, 15.0f);
        k4.C(n2, 12.0f, 4.0f, 2.0f, 2.0f);
        uo.r(n2, -2.0f, 4.0f, 7.0f, 14.0f);
        bv.h(n2, 5.0f, -2.0f, 2.0f, 14.0f);
        k4.C(n2, 19.0f, 20.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(n2, 2.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _polyline = build;
        build.getClass();
        return build;
    }
}
