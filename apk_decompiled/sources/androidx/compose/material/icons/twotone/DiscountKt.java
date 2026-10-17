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
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DiscountKt {
    private static ImageVector _discount;

    public static final ImageVector getDiscount(Icons.TwoTone twoTone) {
        ImageVector imageVector = _discount;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Discount", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(19.0f, 9.79f, 11.21f, 2.0f, 5.0f);
        p.verticalLineToRelative(6.21f);
        r6.C(p, 12.79f, 16.0f, 19.0f, 9.79f);
        p.moveTo(7.25f, 5.5f);
        p.curveTo(6.56f, 5.5f, 6.0f, 4.94f, 6.0f, 4.25f);
        p.reflectiveCurveTo(6.56f, 3.0f, 7.25f, 3.0f);
        p.reflectiveCurveTo(8.5f, 3.56f, 8.5f, 4.25f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(p, 7.94f, 5.5f, 7.25f, 5.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.79f, 21.0f, 3.0f, 11.21f, 2.0f);
        s.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        s.lineToRelative(7.79f, 7.79f);
        s.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        s.lineToRelative(6.21f, -6.21f);
        s.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(s, 12.79f, 21.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.38f, 17.41f);
        b.curveToRelative(0.39f, 0.39f, 0.9f, 0.59f, 1.41f, 0.59f);
        b.curveToRelative(0.51f, 0.0f, 1.02f, -0.2f, 1.41f, -0.59f);
        b.lineToRelative(6.21f, -6.21f);
        b.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        b.lineToRelative(-7.79f, -7.79f);
        b.curveTo(12.25f, 0.21f, 11.74f, 0.0f, 11.21f, 0.0f);
        b.horizontalLineTo(5.0f);
        b.curveTo(3.9f, 0.0f, 3.0f, 0.9f, 3.0f, 2.0f);
        b.verticalLineToRelative(6.21f);
        b.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        uo.l(b, 11.38f, 17.41f, 5.0f, 2.0f);
        b.horizontalLineToRelative(6.21f);
        b.lineTo(19.0f, 9.79f);
        b.lineTo(12.79f, 16.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 5.0f, 8.21f, 2.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(7.25f, 4.25f, -1.25f, 0.0f);
        b2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        b2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _discount = build;
        build.getClass();
        return build;
    }
}
