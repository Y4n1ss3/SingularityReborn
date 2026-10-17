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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonOutlineKt {
    private static ImageVector _personOutline;

    public static final ImageVector getPersonOutline(Icons.TwoTone twoTone) {
        ImageVector imageVector = _personOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PersonOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 8.0f, -2.1f, 0.0f);
        b.arcToRelative(2.1f, 2.1f, 0.0f, true, true, 4.2f, 0.0f);
        b.arcToRelative(2.1f, 2.1f, 0.0f, true, true, -4.2f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 14.9f);
        b2.curveToRelative(-2.97f, 0.0f, -6.1f, 1.46f, -6.1f, 2.1f);
        bv.x(b2, 1.1f, 12.2f, 17.0f);
        b2.curveToRelative(0.0f, -0.64f, -3.13f, -2.1f, -6.1f, -2.1f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(12.0f, 13.0f);
        b3.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(b3, 3.0f, 16.0f, -3.0f);
        b3.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        k4.r(b3, 18.1f, 18.1f, 5.9f, 18.1f);
        b3.lineTo(5.9f, 17.0f);
        b3.curveToRelative(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f);
        b3.reflectiveCurveToRelative(6.1f, 1.46f, 6.1f, 2.1f);
        r6.l(b3, 1.1f, 12.0f, 12.0f);
        b3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b3.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b3.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        b3.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b3.close();
        b3.moveTo(12.0f, 5.9f);
        b3.curveToRelative(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f);
        b3.curveToRelative(0.0f, 1.16f, -0.94f, 2.1f, -2.1f, 2.1f);
        b3.reflectiveCurveTo(9.9f, 9.16f, 9.9f, 8.0f);
        b3.curveToRelative(0.0f, -1.16f, 0.94f, -2.1f, 2.1f, -2.1f);
        b3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOutline = build;
        build.getClass();
        return build;
    }
}
