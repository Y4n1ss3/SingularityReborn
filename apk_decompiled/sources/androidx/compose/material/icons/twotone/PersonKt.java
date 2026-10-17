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
public final class PersonKt {
    private static ImageVector _person;

    public static final ImageVector getPerson(Icons.TwoTone twoTone) {
        ImageVector imageVector = _person;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Person", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 16.0f);
        b.curveToRelative(-2.69f, 0.0f, -5.77f, 1.28f, -6.0f, 2.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(-0.2f, -0.71f, -3.3f, -2.0f, -6.0f, -2.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(12.0f, 8.0f, -2.0f, 0.0f);
        b2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(12.0f, 14.0f);
        b3.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(b3, 2.0f, 16.0f, -2.0f);
        b3.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        b3.close();
        b3.moveTo(6.0f, 18.0f);
        b3.curveToRelative(0.22f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
        b3.curveToRelative(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
        uo.l(b3, 6.0f, 18.0f, 12.0f, 12.0f);
        b3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b3.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b3.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        b3.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b3.close();
        b3.moveTo(12.0f, 6.0f);
        b3.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b3.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b3.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b3, 0.9f, -2.0f, 2.0f, -2.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _person = build;
        build.getClass();
        return build;
    }
}
