package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class JoinRightKt {
    private static ImageVector _joinRight;

    public static final ImageVector getJoinRight(Icons.Sharp sharp) {
        ImageVector imageVector = _joinRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.JoinRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 12.0f);
        b.arcToRelative(3.0f, 5.74f, 0.0f, true, false, 6.0f, 0.0f);
        b.arcToRelative(3.0f, 5.74f, 0.0f, true, false, -6.0f, 0.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(16.5f, 12.0f);
        b2.curveToRelative(0.0f, 0.97f, -0.23f, 4.16f, -3.03f, 6.5f);
        b2.curveTo(14.25f, 18.81f, 15.1f, 19.0f, 16.0f, 19.0f);
        b2.curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f);
        b2.reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f);
        b2.curveToRelative(-0.9f, 0.0f, -1.75f, 0.19f, -2.53f, 0.5f);
        b2.curveTo(16.27f, 7.84f, 16.5f, 11.03f, 16.5f, 12.0f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(8.0f, 19.0f);
        b3.curveToRelative(0.9f, 0.0f, 1.75f, -0.19f, 2.53f, -0.5f);
        b3.curveToRelative(-0.61f, -0.51f, -1.1f, -1.07f, -1.49f, -1.63f);
        b3.curveTo(8.71f, 16.95f, 8.36f, 17.0f, 8.0f, 17.0f);
        b3.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b3.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        b3.curveToRelative(0.36f, 0.0f, 0.71f, 0.05f, 1.04f, 0.13f);
        b3.curveToRelative(0.39f, -0.56f, 0.88f, -1.12f, 1.49f, -1.63f);
        b3.curveTo(9.75f, 5.19f, 8.9f, 5.0f, 8.0f, 5.0f);
        b3.curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b3, 4.14f, 19.0f, 8.0f, 19.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _joinRight = build;
        build.getClass();
        return build;
    }
}
