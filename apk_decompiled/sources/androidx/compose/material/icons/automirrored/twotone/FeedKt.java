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
import defpackage.bv;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FeedKt {
    private static ImageVector _feed;

    public static final ImageVector getFeed(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _feed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.Feed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(15.0f, 5.0f, 5.0f, 14.0f, 14.0f);
        c21.c(i, 9.0f, -4.0f, 5.0f);
        k4.C(i, 7.0f, 7.0f, 5.0f, 2.0f);
        bv.s(i, 7.0f, 7.0f, 17.0f, 17.0f);
        bv.h(i, 7.0f, -2.0f, 10.0f, 17.0f);
        uf.D(i, 17.0f, 11.0f, 2.0f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(i, -2.0f, 17.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(7.0f, 13.0f, 10.0f, -2.0f, 7.0f);
        k4.D(d, 13.0f, 7.0f, 17.0f, 10.0f);
        gy.s(d, -2.0f, 7.0f, 17.0f);
        d.moveTo(16.0f, 3.0f);
        d.horizontalLineTo(5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.k(d, 8.0f, 16.0f, 3.0f);
        uo.p(d, 19.0f, 19.0f, 5.0f, 5.0f);
        bv.l(d, 10.0f, 4.0f, 4.0f, 19.0f);
        k4.A(d, 12.0f, 7.0f, 7.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 5.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _feed = build;
        build.getClass();
        return build;
    }
}
