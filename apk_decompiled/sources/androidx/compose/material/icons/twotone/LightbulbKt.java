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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LightbulbKt {
    private static ImageVector _lightbulb;

    public static final ImageVector getLightbulb(Icons.TwoTone twoTone) {
        ImageVector imageVector = _lightbulb;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Lightbulb", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveTo(8.97f, 4.0f, 6.5f, 6.47f, 6.5f, 9.5f);
        b.curveToRelative(0.0f, 2.47f, 1.49f, 3.89f, 2.35f, 4.5f);
        b.horizontalLineToRelative(6.3f);
        b.curveToRelative(0.86f, -0.61f, 2.35f, -2.03f, 2.35f, -4.5f);
        b.curveTo(17.5f, 6.47f, 15.03f, 4.0f, 12.0f, 4.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 22.0f);
        b2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b2.horizontalLineToRelative(-4.0f);
        b2.curveTo(10.0f, 21.1f, 10.9f, 22.0f, 12.0f, 22.0f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(8.0f, 17.0f, 8.0f, 2.0f, -8.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(12.0f, 2.0f);
        b3.curveTo(7.86f, 2.0f, 4.5f, 5.36f, 4.5f, 9.5f);
        b3.curveToRelative(0.0f, 3.82f, 2.66f, 5.86f, 3.77f, 6.5f);
        b3.horizontalLineToRelative(7.46f);
        b3.curveToRelative(1.11f, -0.64f, 3.77f, -2.68f, 3.77f, -6.5f);
        b3.curveTo(19.5f, 5.36f, 16.14f, 2.0f, 12.0f, 2.0f);
        af0.l(b3, 15.15f, 14.0f, -6.3f);
        b3.curveTo(7.99f, 13.39f, 6.5f, 11.97f, 6.5f, 9.5f);
        b3.curveTo(6.5f, 6.47f, 8.97f, 4.0f, 12.0f, 4.0f);
        b3.reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f);
        b3.curveTo(17.5f, 11.97f, 16.01f, 13.39f, 15.15f, 14.0f);
        b3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightbulb = build;
        build.getClass();
        return build;
    }
}
