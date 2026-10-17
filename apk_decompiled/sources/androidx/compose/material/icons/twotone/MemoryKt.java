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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MemoryKt {
    private static ImageVector _memory;

    public static final ImageVector getMemory(Icons.TwoTone twoTone) {
        ImageVector imageVector = _memory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Memory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(7.0f, 17.0f, 10.0f, 17.0f, 7.0f);
        bv.r(p, 7.0f, 7.0f, 10.0f);
        k4.C(p, 9.0f, 9.0f, 6.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(p, 9.0f, 15.0f, 9.0f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(21.0f, 11.0f, 21.0f, 9.0f, -2.0f);
        k.lineTo(19.0f, 7.0f);
        k.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.n(k, -2.0f, 15.0f, 3.0f, -2.0f);
        uo.B(k, 2.0f, -2.0f, 11.0f, 3.0f);
        k.lineTo(9.0f, 3.0f);
        k.verticalLineToRelative(2.0f);
        k.lineTo(7.0f, 5.0f);
        k.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        bv.q(k, 2.0f, 3.0f, 9.0f, 2.0f);
        bv.C(k, 2.0f, 2.0f, 3.0f, 13.0f);
        kf0.z(k, 2.0f, 2.0f, 2.0f);
        k.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.v(k, 2.0f, 2.0f, 2.0f, -2.0f);
        af0.v(k, 2.0f, 2.0f, 2.0f, -2.0f);
        k.horizontalLineToRelative(2.0f);
        k.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.D(k, -2.0f, 2.0f, -2.0f, -2.0f);
        kf0.C(k, -2.0f, 2.0f, 17.0f, 17.0f);
        k.lineTo(7.0f, 17.0f);
        r6.m(k, 7.0f, 7.0f, 10.0f, 10.0f);
        k.moveTo(15.0f, 9.0f);
        af0.m(k, 9.0f, 9.0f, 6.0f, 6.0f);
        uo.l(k, 15.0f, 9.0f, 13.0f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(k, -2.0f, -2.0f, 2.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _memory = build;
        build.getClass();
        return build;
    }
}
