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
public final class CategoryKt {
    private static ImageVector _category;

    public static final ImageVector getCategory(Icons.TwoTone twoTone) {
        ImageVector imageVector = _category;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Category", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(17.5f, 17.5f, -2.5f, 0.0f);
        b.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        b.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = bv.b(5.0f, 15.5f, 4.0f, 4.0f);
        uo.l(b2, 5.0f, 19.5f, 12.0f, 5.84f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(b2, 10.07f, 9.0f, 3.86f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = kf0.b(12.0f, 2.0f, -5.5f, 9.0f, 11.0f);
        uo.l(b3, 12.0f, 2.0f, 12.0f, 5.84f);
        b3.lineTo(13.93f, 9.0f);
        gy.n(b3, -3.87f, 12.0f, 5.84f);
        b3.moveTo(17.5f, 13.0f);
        b3.curveToRelative(-2.49f, 0.0f, -4.5f, 2.01f, -4.5f, 4.5f);
        b3.reflectiveCurveToRelative(2.01f, 4.5f, 4.5f, 4.5f);
        b3.reflectiveCurveToRelative(4.5f, -2.01f, 4.5f, -4.5f);
        b3.reflectiveCurveToRelative(-2.01f, -4.5f, -4.5f, -4.5f);
        b3.close();
        b3.moveTo(17.5f, 20.0f);
        b3.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        b3.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        b3.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        b3.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        k4.r(b3, 11.0f, 13.5f, 3.0f, 13.5f);
        r6.p(b3, 8.0f, 8.0f, -8.0f);
        b3.moveTo(9.0f, 19.5f);
        af0.m(b3, 5.0f, 19.5f, -4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b3, 4.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _category = build;
        build.getClass();
        return build;
    }
}
