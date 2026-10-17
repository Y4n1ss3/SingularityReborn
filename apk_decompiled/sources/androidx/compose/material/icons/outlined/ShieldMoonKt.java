package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShieldMoonKt {
    private static ImageVector _shieldMoon;

    public static final ImageVector getShieldMoon(Icons.Outlined outlined) {
        ImageVector imageVector = _shieldMoon;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ShieldMoon", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 2.0f, 4.0f, 5.0f, 6.09f);
        s.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        s.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        bv.k(s, 5.0f, 12.0f, 2.0f);
        s.moveTo(18.0f, 11.09f);
        s.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        s.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        s.verticalLineToRelative(-4.7f);
        s.lineToRelative(6.0f, -2.25f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(s, 6.0f, 2.25f, 11.09f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.01f, 14.33f);
        b.curveToRelative(1.75f, 2.17f, 5.12f, 2.24f, 6.96f, 0.07f);
        b.curveToRelative(0.23f, -0.27f, 0.08f, -0.68f, -0.26f, -0.74f);
        b.curveToRelative(-1.29f, -0.21f, -2.48f, -0.98f, -3.18f, -2.2f);
        b.curveToRelative(-0.71f, -1.22f, -0.78f, -2.63f, -0.32f, -3.86f);
        b.curveToRelative(0.12f, -0.33f, -0.16f, -0.66f, -0.51f, -0.6f);
        b.curveTo(8.36f, 7.62f, 6.81f, 11.61f, 9.01f, 14.33f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shieldMoon = build;
        build.getClass();
        return build;
    }
}
