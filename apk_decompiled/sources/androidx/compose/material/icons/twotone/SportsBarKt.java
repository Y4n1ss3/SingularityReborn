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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsBarKt {
    private static ImageVector _sportsBar;

    public static final ImageVector getSportsBar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _sportsBar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SportsBar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(15.0f, 19.0f, 8.0f, 0.0f, -6.63f);
        a.curveToRelative(1.26f, -0.34f, 2.11f, -1.27f, 2.77f, -1.99f);
        a.curveTo(11.6f, 9.47f, 12.08f, 9.0f, 13.0f, 9.0f);
        uf.x(a, 2.0f, 0.0f, 19.0f);
        a.moveTo(7.0f, 10.5f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        a.curveToRelative(0.0f, -0.85f, 0.55f, -1.6f, 1.37f, -1.88f);
        a.lineToRelative(0.8f, -0.27f);
        a.lineToRelative(0.36f, -0.76f);
        a.curveTo(8.0f, 4.62f, 8.94f, 4.02f, 10.0f, 4.02f);
        a.curveToRelative(0.79f, 0.0f, 1.39f, 0.35f, 1.74f, 0.65f);
        a.lineToRelative(0.78f, 0.65f);
        a.curveToRelative(0.0f, 0.0f, 0.64f, -0.32f, 1.47f, -0.32f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        a.curveToRelative(0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 0.0f);
        a.curveTo(9.67f, 7.0f, 9.15f, 10.5f, 7.0f, 10.5f);
        a.curveTo(7.0f, 10.5f, 7.0f, 10.5f, 7.0f, 10.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 7.0f, 10.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a2 = r6.a(15.0f, 19.0f, 8.0f, 0.0f, -6.63f);
        a2.curveToRelative(1.26f, -0.34f, 2.11f, -1.27f, 2.77f, -1.99f);
        a2.curveTo(11.6f, 9.47f, 12.08f, 9.0f, 13.0f, 9.0f);
        uf.x(a2, 2.0f, 0.0f, 19.0f);
        a2.moveTo(10.0f, 2.02f);
        a2.curveToRelative(-1.89f, 0.0f, -3.51f, 1.11f, -4.27f, 2.71f);
        a2.curveTo(4.15f, 5.26f, 3.0f, 6.74f, 3.0f, 8.5f);
        a2.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        fc.w(a2, 6.0f, 21.0f, 11.0f, -2.0f);
        a2.horizontalLineToRelative(2.0f);
        a2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a2.verticalLineToRelative(-6.0f);
        a2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a2.horizontalLineToRelative(-1.56f);
        a2.curveTo(17.79f, 8.41f, 18.0f, 7.73f, 18.0f, 7.0f);
        a2.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        a2.curveToRelative(-0.34f, 0.0f, -0.66f, 0.05f, -0.98f, 0.13f);
        a2.curveTo(12.2f, 2.45f, 11.16f, 2.02f, 10.0f, 2.02f);
        uo.l(a2, 10.0f, 2.02f, 7.0f, 10.5f);
        a2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        a2.curveToRelative(0.0f, -0.85f, 0.55f, -1.6f, 1.37f, -1.88f);
        a2.lineToRelative(0.8f, -0.27f);
        a2.lineToRelative(0.36f, -0.76f);
        a2.curveTo(8.0f, 4.62f, 8.94f, 4.02f, 10.0f, 4.02f);
        a2.curveToRelative(0.79f, 0.0f, 1.39f, 0.35f, 1.74f, 0.65f);
        a2.lineToRelative(0.78f, 0.65f);
        a2.curveToRelative(0.0f, 0.0f, 0.64f, -0.32f, 1.47f, -0.32f);
        a2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        a2.curveToRelative(0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 0.0f);
        a2.curveTo(9.67f, 7.0f, 9.15f, 10.5f, 7.0f, 10.5f);
        a2.curveTo(7.0f, 10.5f, 7.0f, 10.5f, 7.0f, 10.5f);
        uo.l(a2, 7.0f, 10.5f, 17.0f, 17.0f);
        uf.s(a2, -6.0f, 2.0f, 6.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a2, 17.0f, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBar = build;
        build.getClass();
        return build;
    }
}
