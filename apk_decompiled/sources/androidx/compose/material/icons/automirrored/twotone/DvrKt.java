package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DvrKt {
    private static ImageVector _dvr;

    public static final ImageVector getDvr(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _dvr;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.Dvr", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(3.0f, 17.0f, 18.0f, 21.0f, 5.0f);
        bv.r(p, 3.0f, 5.0f, 12.0f);
        k4.C(p, 8.0f, 8.0f, 11.0f, 2.0f);
        r6.C(p, 8.0f, 10.0f, 8.0f, 8.0f);
        k4.C(p, 8.0f, 12.0f, 11.0f, 2.0f);
        bv.r(p, 8.0f, 14.0f, -2.0f);
        k4.C(p, 5.0f, 8.0f, 2.0f, 2.0f);
        r6.C(p, 5.0f, 10.0f, 5.0f, 8.0f);
        k4.C(p, 5.0f, 12.0f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(p, 5.0f, 14.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(8.0f, 12.0f, 11.0f, 2.0f);
        uo.l(b, 8.0f, 14.0f, 8.0f, 8.0f);
        j50.o(b, 11.0f, 2.0f, 8.0f, 10.0f);
        b.moveTo(21.0f, 3.0f);
        b.lineTo(3.0f, 3.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.v(b, 5.0f, 2.0f, 8.0f, -2.0f);
        b.horizontalLineToRelative(5.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(23.0f, 5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(b, 21.0f, 17.0f, 3.0f, 17.0f);
        r6.m(b, 3.0f, 5.0f, 18.0f, 12.0f);
        k4.C(b, 5.0f, 12.0f, 2.0f, 2.0f);
        uo.l(b, 5.0f, 14.0f, 5.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.h(b, 2.0f, 2.0f, 5.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dvr = build;
        build.getClass();
        return build;
    }
}
