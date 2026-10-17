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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposureKt {
    private static ImageVector _exposure;

    public static final ImageVector getExposure(Icons.TwoTone twoTone) {
        ImageVector imageVector = _exposure;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Exposure", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 19.0f, 19.0f, 5.0f);
        uf.j(i, 5.0f, 19.0f, 14.0f);
        i.moveTo(14.5f, 14.5f);
        bv.q(i, -2.0f, 16.0f, 12.5f, 2.0f);
        uo.n(i, 2.0f, 18.0f, 16.0f, -2.0f);
        r6.D(i, 2.0f, -1.5f, -2.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(i, -1.5f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i2.verticalLineToRelative(14.0f);
        i2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i2.horizontalLineToRelative(14.0f);
        i2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i2.lineTo(21.0f, 5.0f);
        i2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(i2, 6.0f, 7.0f, 5.0f, 1.5f);
        r6.C(i2, 6.0f, 8.5f, 6.0f, 7.0f);
        i2.moveTo(19.0f, 19.0f);
        i2.lineTo(5.0f, 19.0f);
        bv.r(i2, 19.0f, 5.0f, 14.0f);
        i2.moveTo(14.5f, 16.0f);
        bv.q(i2, 2.0f, 16.0f, 18.0f, -2.0f);
        af0.v(i2, 2.0f, -1.5f, -2.0f, -2.0f);
        kf0.x(i2, -1.5f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i2, 12.5f, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exposure = build;
        build.getClass();
        return build;
    }
}
