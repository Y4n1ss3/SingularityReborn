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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsBaseballKt {
    private static ImageVector _sportsBaseball;

    public static final ImageVector getSportsBaseball(Icons.Filled filled) {
        ImageVector imageVector = _sportsBaseball;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SportsBaseball", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.81f, 6.28f);
        b.curveTo(2.67f, 7.9f, 2.0f, 9.87f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(0.67f, 4.1f, 1.81f, 5.72f);
        b.curveTo(6.23f, 16.95f, 8.0f, 14.68f, 8.0f, 12.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 6.23f, 7.05f, 3.81f, 6.28f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(20.19f, 6.28f);
        b2.curveTo(17.77f, 7.05f, 16.0f, 9.32f, 16.0f, 12.0f);
        b2.reflectiveCurveToRelative(1.77f, 4.95f, 4.19f, 5.72f);
        b2.curveTo(21.33f, 16.1f, 22.0f, 14.13f, 22.0f, 12.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 21.33f, 7.9f, 20.19f, 6.28f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(14.0f, 12.0f);
        b3.curveToRelative(0.0f, -3.28f, 1.97f, -6.09f, 4.79f, -7.33f);
        b3.curveTo(17.01f, 3.02f, 14.63f, 2.0f, 12.0f, 2.0f);
        b3.reflectiveCurveTo(6.99f, 3.02f, 5.21f, 4.67f);
        b3.curveTo(8.03f, 5.91f, 10.0f, 8.72f, 10.0f, 12.0f);
        b3.reflectiveCurveToRelative(-1.97f, 6.09f, -4.79f, 7.33f);
        b3.curveTo(6.99f, 20.98f, 9.37f, 22.0f, 12.0f, 22.0f);
        b3.reflectiveCurveToRelative(5.01f, -1.02f, 6.79f, -2.67f);
        b3.curveTo(15.97f, 18.09f, 14.0f, 15.28f, 14.0f, 12.0f);
        b3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBaseball = build;
        build.getClass();
        return build;
    }
}
