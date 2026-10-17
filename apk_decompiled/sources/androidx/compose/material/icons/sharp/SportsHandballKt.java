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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsHandballKt {
    private static ImageVector _sportsHandball;

    public static final ImageVector getSportsHandball(Icons.Sharp sharp) {
        ImageVector imageVector = _sportsHandball;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SportsHandball", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.27f, 6.0f);
        b.curveTo(13.72f, 6.95f, 14.05f, 8.18f, 15.0f, 8.73f);
        b.curveToRelative(0.95f, 0.55f, 2.18f, 0.22f, 2.73f, -0.73f);
        b.curveToRelative(0.55f, -0.95f, 0.22f, -2.18f, -0.73f, -2.73f);
        b.curveTo(16.05f, 4.72f, 14.82f, 5.05f, 14.27f, 6.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(15.84f, 10.41f);
        b2.curveToRelative(0.0f, 0.0f, -1.63f, -0.94f, -2.6f, -1.5f);
        b2.curveToRelative(-2.38f, -1.38f, -3.2f, -4.44f, -1.82f, -6.82f);
        b2.lineToRelative(-1.73f, -1.0f);
        b2.curveTo(8.1f, 3.83f, 8.6f, 7.21f, 10.66f, 9.4f);
        b2.lineToRelative(-5.15f, 8.92f);
        b2.lineToRelative(1.73f, 1.0f);
        b2.lineToRelative(1.5f, -2.6f);
        b2.lineToRelative(1.73f, 1.0f);
        b2.lineToRelative(-3.0f, 5.2f);
        b2.lineToRelative(1.73f, 1.0f);
        b2.lineToRelative(6.29f, -10.89f);
        b2.curveToRelative(1.14f, 1.55f, 1.33f, 3.69f, 0.31f, 5.46f);
        b2.lineToRelative(1.73f, 1.0f);
        b2.curveTo(19.13f, 16.74f, 18.81f, 12.91f, 15.84f, 10.41f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(12.75f, 3.8f);
        b3.curveToRelative(0.72f, 0.41f, 1.63f, 0.17f, 2.05f, -0.55f);
        b3.curveToRelative(0.41f, -0.72f, 0.17f, -1.63f, -0.55f, -2.05f);
        b3.curveToRelative(-0.72f, -0.41f, -1.63f, -0.17f, -2.05f, 0.55f);
        b3.curveTo(11.79f, 2.47f, 12.03f, 3.39f, 12.75f, 3.8f);
        b3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsHandball = build;
        build.getClass();
        return build;
    }
}
