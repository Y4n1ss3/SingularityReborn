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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsFootballKt {
    private static ImageVector _sportsFootball;

    public static final ImageVector getSportsFootball(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsFootball;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsFootball", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.31f, 3.69f);
        b.curveTo(19.99f, 3.36f, 18.37f, 3.0f, 16.26f, 3.0f);
        b.curveToRelative(-3.03f, 0.0f, -7.09f, 0.75f, -9.8f, 3.46f);
        b.curveTo(1.87f, 11.05f, 2.9f, 19.52f, 3.69f, 20.31f);
        b.curveTo(4.01f, 20.64f, 5.63f, 21.0f, 7.74f, 21.0f);
        b.curveToRelative(3.03f, 0.0f, 7.09f, -0.75f, 9.8f, -3.46f);
        b.curveTo(22.13f, 12.95f, 21.1f, 4.48f, 20.31f, 3.69f);
        b.close();
        b.moveTo(7.74f, 19.0f);
        b.curveToRelative(-1.14f, 0.0f, -2.02f, -0.12f, -2.53f, -0.23f);
        b.curveToRelative(-0.18f, -0.79f, -0.3f, -2.21f, -0.17f, -3.83f);
        b.lineToRelative(4.01f, 4.01f);
        b.curveTo(8.53f, 18.99f, 8.08f, 19.0f, 7.74f, 19.0f);
        b.close();
        b.moveTo(16.13f, 16.13f);
        b.curveToRelative(-1.33f, 1.33f, -3.06f, 2.05f, -4.66f, 2.44f);
        b.lineToRelative(-6.04f, -6.04f);
        b.curveToRelative(0.42f, -1.68f, 1.16f, -3.37f, 2.45f, -4.65f);
        b.curveToRelative(1.32f, -1.32f, 3.05f, -2.04f, 4.64f, -2.43f);
        b.lineToRelative(6.05f, 6.05f);
        b.curveTo(18.15f, 13.17f, 17.4f, 14.85f, 16.13f, 16.13f);
        k4.x(b, 18.96f, 9.09f, -4.03f, -4.03f);
        b.curveTo(15.45f, 5.01f, 15.91f, 5.0f, 16.26f, 5.0f);
        b.curveToRelative(1.14f, 0.0f, 2.02f, 0.12f, 2.53f, 0.23f);
        b.curveTo(18.97f, 6.02f, 19.09f, 7.45f, 18.96f, 9.09f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(8.5f, 14.1f, 5.6f, -5.6f), 1.4f, 1.4f, -5.6f, 5.6f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsFootball = build;
        build.getClass();
        return build;
    }
}
