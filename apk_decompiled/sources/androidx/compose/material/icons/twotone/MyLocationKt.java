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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MyLocationKt {
    private static ImageVector _myLocation;

    public static final ImageVector getMyLocation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _myLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MyLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(13.0f, 3.06f, 1.0f, -2.0f, 2.06f);
        c.curveTo(6.83f, 3.52f, 3.52f, 6.83f, 3.06f, 11.0f);
        af0.u(c, 1.0f, 2.0f, 2.06f);
        c.curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        kf0.r(c, 23.0f, 2.0f, -2.06f);
        c.curveToRelative(4.17f, -0.46f, 7.48f, -3.77f, 7.94f, -7.94f);
        af0.u(c, 23.0f, -2.0f, -2.06f);
        c.curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        c.close();
        c.moveTo(12.0f, 19.0f);
        c.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        c.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        c.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(c, -3.13f, 7.0f, -7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 12.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 8.0f);
        b2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b2.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b2.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b2.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b2.close();
        b2.moveTo(12.0f, 14.0f);
        b2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b2, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _myLocation = build;
        build.getClass();
        return build;
    }
}
