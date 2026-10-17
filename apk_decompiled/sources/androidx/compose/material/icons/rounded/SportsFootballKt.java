package androidx.compose.material.icons.rounded;

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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsFootballKt {
    private static ImageVector _sportsFootball;

    public static final ImageVector getSportsFootball(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsFootball;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsFootball", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.02f, 15.62f);
        b.curveToRelative(-0.08f, 2.42f, 0.32f, 4.34f, 0.67f, 4.69f);
        b.reflectiveCurveToRelative(2.28f, 0.76f, 4.69f, 0.67f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 3.02f, 15.62f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(13.08f, 3.28f);
        b2.curveTo(10.75f, 3.7f, 8.29f, 4.62f, 6.46f, 6.46f);
        b2.reflectiveCurveToRelative(-2.76f, 4.29f, -3.18f, 6.62f);
        b2.lineToRelative(7.63f, 7.63f);
        b2.curveToRelative(2.34f, -0.41f, 4.79f, -1.34f, 6.62f, -3.18f);
        b2.reflectiveCurveToRelative(2.76f, -4.29f, 3.18f, -6.62f);
        uo.l(b2, 13.08f, 3.28f, 14.8f, 10.6f);
        b2.lineToRelative(-4.2f, 4.2f);
        b2.curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0.0f);
        b2.reflectiveCurveToRelative(-0.39f, -1.01f, 0.0f, -1.4f);
        b2.lineToRelative(4.2f, -4.2f);
        b2.curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 15.19f, 10.21f, 14.8f, 10.6f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(20.98f, 8.38f);
        b3.curveToRelative(0.08f, -2.42f, -0.32f, -4.34f, -0.67f, -4.69f);
        b3.reflectiveCurveToRelative(-2.28f, -0.76f, -4.69f, -0.67f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b3, 20.98f, 8.38f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsFootball = build;
        build.getClass();
        return build;
    }
}
