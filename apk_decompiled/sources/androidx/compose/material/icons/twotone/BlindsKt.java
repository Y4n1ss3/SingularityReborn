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
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlindsKt {
    private static ImageVector _blinds;

    public static final ImageVector getBlinds(Icons.TwoTone twoTone) {
        ImageVector imageVector = _blinds;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Blinds", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(6.0f, 9.0f, 8.0f, 2.0f, -8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(6.0f, 5.0f, 8.0f, 2.0f, -8.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(16.0f, 9.0f, 2.0f, 2.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(16.0f, 5.0f, 2.0f, 2.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(20.0f, 19.0f, 3.0f, 4.0f, 16.0f);
        uf.k(f, 2.0f, 2.0f, 20.0f, -2.0f);
        kp0.r(f, 20.0f, 6.0f, 5.0f, 8.0f);
        gy.s(f, 2.0f, 6.0f, 5.0f);
        k4.C(f, 6.0f, 9.0f, 8.0f, 2.0f);
        bv.s(f, 6.0f, 9.0f, 18.0f, 19.0f);
        uf.k(f, 6.0f, -6.0f, 8.0f, 1.82f);
        f.curveToRelative(-0.45f, 0.32f, -0.75f, 0.84f, -0.75f, 1.43f);
        f.curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f);
        f.reflectiveCurveToRelative(1.75f, -0.78f, 1.75f, -1.75f);
        f.curveToRelative(0.0f, -0.59f, -0.3f, -1.12f, -0.75f, -1.43f);
        c21.c(f, 13.0f, 2.0f, 19.0f);
        j50.y(f, 18.0f, 11.0f, -2.0f, 9.0f);
        uo.r(f, 2.0f, 11.0f, 18.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(f, -2.0f, 5.0f, 2.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blinds = build;
        build.getClass();
        return build;
    }
}
