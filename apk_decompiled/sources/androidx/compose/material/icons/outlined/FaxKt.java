package androidx.compose.material.icons.outlined;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FaxKt {
    private static ImageVector _fax;

    public static final ImageVector getFax(Icons.Outlined outlined) {
        ImageVector imageVector = _fax;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Fax", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(19.0f, 9.0f, -1.0f, 4.0f, 8.0f);
        v.verticalLineToRelative(5.0f);
        v.horizontalLineTo(7.22f);
        v.curveTo(6.67f, 8.39f, 5.89f, 8.0f, 5.0f, 8.0f);
        v.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        v.verticalLineToRelative(7.0f);
        v.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        v.curveToRelative(0.89f, 0.0f, 1.67f, -0.39f, 2.22f, -1.0f);
        v.horizontalLineTo(22.0f);
        v.verticalLineToRelative(-8.0f);
        v.curveTo(22.0f, 10.34f, 20.66f, 9.0f, 19.0f, 9.0f);
        v.close();
        v.moveTo(6.0f, 18.0f);
        v.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        v.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        v.verticalLineToRelative(-7.0f);
        v.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        k4.D(v, 18.0f, 10.0f, 6.0f, 6.0f);
        k4.p(v, 3.0f, -6.0f, 6.0f);
        k4.A(v, 20.0f, 18.0f, 8.0f, -7.0f);
        v.horizontalLineToRelative(11.0f);
        v.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(v, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(15.0f, 13.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(18.0f, 13.0f, -1.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = af0.b(15.0f, 16.0f, -1.0f, 0.0f);
        b3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw5 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk85 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b4 = af0.b(18.0f, 16.0f, -1.0f, 0.0f);
        b4.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b4.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b4.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw5, m5145getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(9.0f, 12.0f, 4.0f, 5.0f, -4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fax = build;
        build.getClass();
        return build;
    }
}
