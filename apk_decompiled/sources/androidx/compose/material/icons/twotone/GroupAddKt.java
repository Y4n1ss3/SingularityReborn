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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupAddKt {
    private static ImageVector _groupAdd;

    public static final ImageVector getGroupAdd(Icons.TwoTone twoTone) {
        ImageVector imageVector = _groupAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.GroupAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 15.0f);
        b.curveToRelative(-2.7f, 0.0f, -5.8f, 1.29f, -6.0f, 2.01f);
        kf0.r(b, 18.0f, 12.0f, -1.0f);
        b.curveTo(13.8f, 16.29f, 10.7f, 15.0f, 8.0f, 15.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(8.0f, 8.0f, -2.0f, 0.0f);
        b2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 9.0f, 0.0f, -2.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 2.0f, 0.0f, 0.0f, -2.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(8.0f, 12.0f);
        b3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b3.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b3.reflectiveCurveTo(4.0f, 5.79f, 4.0f, 8.0f);
        b3.reflectiveCurveTo(5.79f, 12.0f, 8.0f, 12.0f);
        b3.close();
        b3.moveTo(8.0f, 6.0f);
        b3.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b3.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b3.reflectiveCurveTo(6.0f, 9.1f, 6.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b3, 6.9f, 6.0f, 8.0f, 6.0f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw5 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk85 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b4 = uf.b(8.0f, 13.0f);
        b4.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(b4, 3.0f, 16.0f, -3.0f);
        b4.curveTo(16.0f, 14.34f, 10.67f, 13.0f, 8.0f, 13.0f);
        uo.q(b4, 14.0f, 18.0f, 2.0f, -0.99f);
        b4.curveTo(2.2f, 16.29f, 5.3f, 15.0f, 8.0f, 15.0f);
        b4.reflectiveCurveToRelative(5.8f, 1.29f, 6.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b4, 18.0f), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw5, m5145getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw6 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk86 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b5 = uf.b(12.51f, 4.05f);
        b5.curveTo(13.43f, 5.11f, 14.0f, 6.49f, 14.0f, 8.0f);
        b5.reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f);
        b5.curveTo(14.47f, 11.7f, 16.0f, 10.04f, 16.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b5, 14.47f, 4.3f, 12.51f, 4.05f), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw6, m5145getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType7 = VectorKt.getDefaultFillType();
        SolidColor solidColor7 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw7 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk87 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b6 = uf.b(16.53f, 13.83f);
        b6.curveTo(17.42f, 14.66f, 18.0f, 15.7f, 18.0f, 17.0f);
        kf0.z(b6, 3.0f, 2.0f, -3.0f);
        b6.curveTo(20.0f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f);
        b6.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b6.getNodes(), defaultFillType7, "", solidColor7, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw7, m5145getBevelLxFBmk87, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupAdd = build;
        build.getClass();
        return build;
    }
}
