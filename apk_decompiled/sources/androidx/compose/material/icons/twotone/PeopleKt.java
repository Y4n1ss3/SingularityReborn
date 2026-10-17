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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PeopleKt {
    private static ImageVector _people;

    public static final ImageVector getPeople(Icons.TwoTone twoTone) {
        ImageVector imageVector = _people;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.People", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(9.0f, 8.5f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(4.34f, 17.0f, 9.32f);
        a.curveToRelative(-0.84f, -0.58f, -2.87f, -1.25f, -4.66f, -1.25f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(a, -3.82f, 0.67f, -4.66f, 1.25f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(9.0f, 12.0f);
        b2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b2.reflectiveCurveTo(10.93f, 5.0f, 9.0f, 5.0f);
        b2.reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f);
        b2.reflectiveCurveTo(7.07f, 12.0f, 9.0f, 12.0f);
        b2.close();
        b2.moveTo(9.0f, 7.0f);
        b2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b2.reflectiveCurveTo(9.83f, 10.0f, 9.0f, 10.0f);
        b2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        b2.reflectiveCurveTo(8.17f, 7.0f, 9.0f, 7.0f);
        b2.close();
        b2.moveTo(9.0f, 13.75f);
        b2.curveToRelative(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        fc.w(b2, 2.0f, 19.0f, 14.0f, -1.75f);
        b2.curveToRelative(0.0f, -2.33f, -4.66f, -3.5f, -7.0f, -3.5f);
        b2.close();
        b2.moveTo(4.34f, 17.0f);
        b2.curveToRelative(0.84f, -0.58f, 2.87f, -1.25f, 4.66f, -1.25f);
        b2.reflectiveCurveToRelative(3.82f, 0.67f, 4.66f, 1.25f);
        uo.l(b2, 4.34f, 17.0f, 16.04f, 13.81f);
        b2.curveToRelative(1.16f, 0.84f, 1.96f, 1.96f, 1.96f, 3.44f);
        fc.w(b2, 18.0f, 19.0f, 4.0f, -1.75f);
        b2.curveToRelative(0.0f, -2.02f, -3.5f, -3.17f, -5.96f, -3.44f);
        b2.close();
        b2.moveTo(15.0f, 12.0f);
        b2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b2.reflectiveCurveTo(16.93f, 5.0f, 15.0f, 5.0f);
        b2.curveToRelative(-0.54f, 0.0f, -1.04f, 0.13f, -1.5f, 0.35f);
        b2.curveToRelative(0.63f, 0.89f, 1.0f, 1.98f, 1.0f, 3.15f);
        b2.reflectiveCurveToRelative(-0.37f, 2.26f, -1.0f, 3.15f);
        b2.curveToRelative(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _people = build;
        build.getClass();
        return build;
    }
}
