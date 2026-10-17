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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FaceKt {
    private static ImageVector _face;

    public static final ImageVector getFace(Icons.TwoTone twoTone) {
        ImageVector imageVector = _face;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Face", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.5f, 8.0f);
        b.curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f);
        b.curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f);
        b.curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f);
        b.close();
        b.moveTo(8.08f, 5.03f);
        b.curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f);
        b.curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 4.0f);
        b2.curveToRelative(2.9f, 0.0f, 5.44f, 1.56f, 6.84f, 3.88f);
        b2.curveToRelative(-0.43f, 0.07f, -0.88f, 0.12f, -1.34f, 0.12f);
        b2.curveToRelative(-2.9f, 0.0f, -5.44f, -1.56f, -6.84f, -3.88f);
        b2.curveToRelative(0.43f, -0.07f, 0.88f, -0.12f, 1.34f, -0.12f);
        b2.close();
        b2.moveTo(8.08f, 5.03f);
        b2.curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f);
        b2.curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b2.curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f);
        b2.curveToRelative(2.6f, -0.98f, 4.68f, -2.99f, 5.74f, -5.55f);
        b2.curveToRelative(1.83f, 2.26f, 4.62f, 3.7f, 7.75f, 3.7f);
        b2.curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f);
        b2.curveToRelative(0.21f, 0.71f, 0.33f, 1.46f, 0.33f, 2.24f);
        b2.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = af0.b(9.0f, 13.0f, -1.25f, 0.0f);
        b3.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        b3.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b4 = af0.b(15.0f, 13.0f, -1.25f, 0.0f);
        b4.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        b4.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _face = build;
        build.getClass();
        return build;
    }
}
