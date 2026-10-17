package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpaKt {
    private static ImageVector _spa;

    public static final ImageVector getSpa(Icons.Filled filled) {
        ImageVector imageVector = _spa;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Spa", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.55f, 12.0f);
        b.curveToRelative(-1.07f, -0.71f, -2.25f, -1.27f, -3.53f, -1.61f);
        b.curveToRelative(1.28f, 0.34f, 2.46f, 0.9f, 3.53f, 1.61f);
        b.close();
        b.moveTo(18.98f, 10.39f);
        b.curveToRelative(-1.29f, 0.34f, -2.49f, 0.91f, -3.57f, 1.64f);
        b.curveToRelative(1.08f, -0.73f, 2.28f, -1.3f, 3.57f, -1.64f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(15.49f, 9.63f);
        b2.curveToRelative(-0.18f, -2.79f, -1.31f, -5.51f, -3.43f, -7.63f);
        b2.curveToRelative(-2.14f, 2.14f, -3.32f, 4.86f, -3.55f, 7.63f);
        b2.curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f);
        b2.curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f);
        b2.close();
        b2.moveTo(8.99f, 12.28f);
        b2.curveToRelative(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f);
        b2.curveToRelative(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f);
        b2.close();
        b2.moveTo(15.41f, 12.03f);
        b2.curveToRelative(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f);
        b2.curveToRelative(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f);
        b2.close();
        b2.moveTo(12.0f, 15.45f);
        b2.curveTo(9.85f, 12.17f, 6.18f, 10.0f, 2.0f, 10.0f);
        b2.curveToRelative(0.0f, 5.32f, 3.36f, 9.82f, 8.03f, 11.49f);
        b2.curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f);
        b2.curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f);
        b2.curveTo(18.64f, 19.82f, 22.0f, 15.32f, 22.0f, 10.0f);
        b2.curveToRelative(-4.18f, 0.0f, -7.85f, 2.17f, -10.0f, 5.45f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spa = build;
        build.getClass();
        return build;
    }
}
