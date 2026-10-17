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
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsTransitFilledKt {
    private static ImageVector _directionsTransitFilled;

    public static final ImageVector getDirectionsTransitFilled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _directionsTransitFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DirectionsTransitFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(13.0f, 5.0f, 4.67f);
        a.curveTo(17.13f, 4.46f, 15.71f, 4.0f, 12.0f, 4.0f);
        a.curveTo(8.48f, 4.0f, 7.03f, 4.48f, 6.43f, 5.0f);
        a.horizontalLineTo(11.0f);
        a.horizontalLineTo(13.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 15.5f);
        b.curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f);
        b.horizontalLineToRelative(9.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        k4.t(b, 12.0f, 6.0f, 15.5f);
        b.moveTo(15.5f, 13.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f);
        b.reflectiveCurveTo(14.0f, 15.33f, 14.0f, 14.5f);
        b.reflectiveCurveTo(14.67f, 13.0f, 15.5f, 13.0f);
        b.close();
        b.moveTo(8.5f, 13.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(9.33f, 16.0f, 8.5f, 16.0f);
        b.reflectiveCurveTo(7.0f, 15.33f, 7.0f, 14.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 7.67f, 13.0f, 8.5f, 13.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f);
        b2.verticalLineToRelative(9.5f);
        b2.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        af0.m(b2, 6.0f, 20.0f, 1.0f, 12.0f);
        b2.verticalLineToRelative(-1.0f);
        b2.lineToRelative(-1.5f, -1.0f);
        b2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b2.verticalLineTo(6.0f);
        b2.curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 4.0f);
        b2.curveToRelative(3.71f, 0.0f, 5.13f, 0.46f, 5.67f, 1.0f);
        b2.horizontalLineTo(13.0f);
        b2.horizontalLineToRelative(-2.0f);
        b2.horizontalLineTo(6.43f);
        b2.curveTo(7.03f, 4.48f, 8.48f, 4.0f, 12.0f, 4.0f);
        r6.B(b2, 6.0f, 7.0f, 5.0f, 3.0f);
        bv.s(b2, 6.0f, 7.0f, 18.0f, 15.5f);
        b2.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        b2.horizontalLineToRelative(-9.0f);
        b2.curveTo(6.67f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f);
        c21.c(b2, 12.0f, 12.0f, 15.5f);
        j50.y(b2, 18.0f, 10.0f, -5.0f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b2, 5.0f, 10.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = af0.b(8.5f, 14.5f, -1.5f, 0.0f);
        b3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw5 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk85 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b4 = af0.b(15.5f, 14.5f, -1.5f, 0.0f);
        b4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b4.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw5, m5145getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsTransitFilled = build;
        build.getClass();
        return build;
    }
}
