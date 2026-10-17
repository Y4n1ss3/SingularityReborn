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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactlessKt {
    private static ImageVector _contactless;

    public static final ImageVector getContactless(Icons.TwoTone twoTone) {
        ImageVector imageVector = _contactless;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Contactless", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.reflectiveCurveTo(16.42f, 4.0f, 12.0f, 4.0f);
        k4.r(b, 8.46f, 14.45f, 7.1f, 13.83f);
        b.curveToRelative(0.28f, -0.61f, 0.41f, -1.24f, 0.4f, -1.86f);
        b.curveToRelative(-0.01f, -0.63f, -0.14f, -1.24f, -0.4f, -1.8f);
        b.lineToRelative(1.36f, -0.63f);
        b.curveToRelative(0.35f, 0.75f, 0.53f, 1.56f, 0.54f, 2.4f);
        b.curveTo(9.01f, 12.8f, 8.83f, 13.64f, 8.46f, 14.45f);
        k4.x(b, 11.53f, 16.01f, -1.3f, -0.74f);
        b.curveToRelative(0.52f, -0.92f, 0.78f, -1.98f, 0.78f, -3.15f);
        b.curveToRelative(0.0f, -1.19f, -0.27f, -2.33f, -0.8f, -3.4f);
        b.lineToRelative(1.34f, -0.67f);
        b.curveToRelative(0.64f, 1.28f, 0.96f, 2.65f, 0.96f, 4.07f);
        b.curveTo(12.51f, 13.55f, 12.18f, 14.86f, 11.53f, 16.01f);
        k4.x(b, 14.67f, 17.33f, -1.35f, -0.66f);
        b.curveToRelative(0.78f, -1.6f, 1.18f, -3.18f, 1.18f, -4.69f);
        b.curveToRelative(0.0f, -1.51f, -0.4f, -3.07f, -1.18f, -4.64f);
        b.lineToRelative(1.34f, -0.67f);
        b.curveTo(15.56f, 8.45f, 16.0f, 10.23f, 16.0f, 11.98f);
        b.curveTo(16.0f, 13.72f, 15.56f, 15.52f, 14.67f, 17.33f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 16.42f, 20.0f, 12.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(7.1f, 10.18f);
        b3.curveToRelative(0.26f, 0.56f, 0.39f, 1.16f, 0.4f, 1.8f);
        b3.curveToRelative(0.01f, 0.63f, -0.13f, 1.25f, -0.4f, 1.86f);
        b3.lineToRelative(1.37f, 0.62f);
        b3.curveToRelative(0.37f, -0.81f, 0.55f, -1.65f, 0.54f, -2.5f);
        b3.curveToRelative(-0.01f, -0.84f, -0.19f, -1.65f, -0.54f, -2.4f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b3, 7.1f, 10.18f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b4 = uf.b(13.33f, 7.33f);
        b4.curveToRelative(0.78f, 1.57f, 1.18f, 3.14f, 1.18f, 4.64f);
        b4.curveToRelative(0.0f, 1.51f, -0.4f, 3.09f, -1.18f, 4.69f);
        b4.lineToRelative(1.35f, 0.66f);
        b4.curveToRelative(0.88f, -1.81f, 1.33f, -3.61f, 1.33f, -5.35f);
        b4.curveToRelative(0.0f, -1.74f, -0.45f, -3.53f, -1.33f, -5.31f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b4, 13.33f, 7.33f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw5 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk85 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b5 = uf.b(10.2f, 8.72f);
        b5.curveToRelative(0.53f, 1.07f, 0.8f, 2.21f, 0.8f, 3.4f);
        b5.curveToRelative(0.0f, 1.17f, -0.26f, 2.23f, -0.78f, 3.15f);
        b5.lineToRelative(1.3f, 0.74f);
        b5.curveToRelative(0.65f, -1.15f, 0.98f, -2.45f, 0.98f, -3.89f);
        b5.curveToRelative(0.0f, -1.42f, -0.32f, -2.79f, -0.96f, -4.07f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b5, 10.2f, 8.72f), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw5, m5145getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactless = build;
        build.getClass();
        return build;
    }
}
