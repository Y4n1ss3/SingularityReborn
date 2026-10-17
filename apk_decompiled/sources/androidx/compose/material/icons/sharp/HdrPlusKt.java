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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrPlusKt {
    private static ImageVector _hdrPlus;

    public static final ImageVector getHdrPlus(Icons.Sharp sharp) {
        ImageVector imageVector = _hdrPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HdrPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(8.5f, 14.5f, 2.0f, 1.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(14.5f, 7.5f, 1.5f, 3.0f, -1.5f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 12.0f, 17.0f, -0.86f, -0.01f);
        b.lineTo(12.0f, 19.0f);
        r6.t(b, -1.5f, -0.9f, -2.0f, 8.5f);
        af0.B(b, 2.0f, 7.0f, -6.0f, 5.0f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 1.5f);
        k4.D(b, 17.0f, 12.0f, 12.0f, -1.5f);
        k4.u(b, 9.5f, -2.0f, 12.0f, 7.0f);
        uf.p(b, 6.0f, 1.5f, 2.0f, 2.0f);
        k4.t(b, 6.0f, 12.0f, 12.0f);
        k4.A(b, 17.5f, 16.0f, 16.0f, 1.5f);
        af0.p(b, -1.5f, 16.0f, 13.0f, -1.5f);
        af0.p(b, 1.5f, 13.0f, 16.0f, 1.49f);
        uo.r(b, 1.5f, 16.0f, 17.5f, 10.5f);
        b.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        af0.f(b, -3.0f, 6.0f, 3.0f);
        b.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 10.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrPlus = build;
        build.getClass();
        return build;
    }
}
