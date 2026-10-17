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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThunderstormKt {
    private static ImageVector _thunderstorm;

    public static final ImageVector getThunderstorm(Icons.Sharp sharp) {
        ImageVector imageVector = _thunderstorm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Thunderstorm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.92f, 7.02f);
        b.curveTo(17.45f, 4.18f, 14.97f, 2.0f, 12.0f, 2.0f);
        b.curveTo(9.82f, 2.0f, 7.83f, 3.18f, 6.78f, 5.06f);
        b.curveTo(4.09f, 5.41f, 2.0f, 7.74f, 2.0f, 10.5f);
        b.curveTo(2.0f, 13.53f, 4.47f, 16.0f, 7.5f, 16.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        b.curveTo(22.0f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.8f, 17.0f, -2.9f, 3.32f);
        e.lineToRelative(2.0f, 1.0f);
        e.lineToRelative(-2.35f, 2.68f);
        e.lineToRelative(2.65f, 0.0f);
        e.lineToRelative(2.9f, -3.32f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -2.0f, -1.0f, 2.35f, -2.68f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(8.8f, 17.0f, -2.9f, 3.32f);
        e2.lineToRelative(2.0f, 1.0f);
        e2.lineToRelative(-2.35f, 2.68f);
        e2.lineToRelative(2.65f, 0.0f);
        e2.lineToRelative(2.9f, -3.32f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, -2.0f, -1.0f, 2.35f, -2.68f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thunderstorm = build;
        build.getClass();
        return build;
    }
}
