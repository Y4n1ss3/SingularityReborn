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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DarkModeKt {
    private static ImageVector _darkMode;

    public static final ImageVector getDarkMode(Icons.TwoTone twoTone) {
        ImageVector imageVector = _darkMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DarkMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.37f, 5.51f);
        b.curveTo(9.19f, 6.15f, 9.1f, 6.82f, 9.1f, 7.5f);
        b.curveToRelative(0.0f, 4.08f, 3.32f, 7.4f, 7.4f, 7.4f);
        b.curveToRelative(0.68f, 0.0f, 1.35f, -0.09f, 1.99f, -0.27f);
        b.curveTo(17.45f, 17.19f, 14.93f, 19.0f, 12.0f, 19.0f);
        b.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        b.curveTo(5.0f, 9.07f, 6.81f, 6.55f, 9.37f, 5.51f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(9.37f, 5.51f);
        b2.curveTo(9.19f, 6.15f, 9.1f, 6.82f, 9.1f, 7.5f);
        b2.curveToRelative(0.0f, 4.08f, 3.32f, 7.4f, 7.4f, 7.4f);
        b2.curveToRelative(0.68f, 0.0f, 1.35f, -0.09f, 1.99f, -0.27f);
        b2.curveTo(17.45f, 17.19f, 14.93f, 19.0f, 12.0f, 19.0f);
        b2.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        b2.curveTo(5.0f, 9.07f, 6.81f, 6.55f, 9.37f, 5.51f);
        b2.close();
        b2.moveTo(12.0f, 3.0f);
        b2.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b2.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        b2.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        b2.curveToRelative(0.0f, -0.46f, -0.04f, -0.92f, -0.1f, -1.36f);
        b2.curveToRelative(-0.98f, 1.37f, -2.58f, 2.26f, -4.4f, 2.26f);
        b2.curveToRelative(-2.98f, 0.0f, -5.4f, -2.42f, -5.4f, -5.4f);
        b2.curveToRelative(0.0f, -1.81f, 0.89f, -3.42f, 2.26f, -4.4f);
        b2.curveTo(12.92f, 3.04f, 12.46f, 3.0f, 12.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 12.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _darkMode = build;
        build.getClass();
        return build;
    }
}
