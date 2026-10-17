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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarsKt {
    private static ImageVector _stars;

    public static final ImageVector getStars(Icons.TwoTone twoTone) {
        ImageVector imageVector = _stars;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Stars", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.47f, 9.16f);
        b.curveToRelative(-1.1f, -2.87f, -3.8f, -4.95f, -7.01f, -5.14f);
        fc.C(b, 2.0f, 4.71f, 5.01f, 0.43f);
        b.moveTo(11.54f, 4.02f);
        b.curveToRelative(-3.22f, 0.18f, -5.92f, 2.27f, -7.02f, 5.15f);
        fc.C(b, 5.02f, -0.43f, 2.0f, -4.72f);
        b.moveTo(4.23f, 10.14f);
        b.curveTo(4.08f, 10.74f, 4.0f, 11.36f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 2.48f, 1.14f, 4.7f, 2.91f, 6.17f);
        fc.C(b, 1.11f, -4.75f, -3.79f, -3.28f);
        b.moveTo(19.77f, 10.13f);
        b.lineToRelative(-3.79f, 3.28f);
        b.lineToRelative(1.1f, 4.76f);
        b.curveTo(18.86f, 16.7f, 20.0f, 14.48f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, -0.64f, -0.09f, -1.27f, -0.23f, -1.87f);
        b.close();
        b.moveTo(7.84f, 18.82f);
        b.curveToRelative(1.21f, 0.74f, 2.63f, 1.18f, 4.15f, 1.18f);
        b.curveToRelative(1.53f, 0.0f, 2.95f, -0.44f, 4.17f, -1.18f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b, 12.0f, 16.31f, -4.16f, 2.51f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(11.99f, 2.0f);
        b2.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b2.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        k4.x(b2, 19.47f, 9.16f, -5.01f, -0.43f);
        b2.lineToRelative(-2.0f, -4.71f);
        b2.curveToRelative(3.21f, 0.19f, 5.91f, 2.27f, 7.01f, 5.14f);
        k4.x(b2, 12.0f, 8.06f, 1.09f, 2.56f);
        b2.lineToRelative(2.78f, 0.24f);
        b2.lineToRelative(-2.11f, 1.83f);
        b2.lineToRelative(0.63f, 2.73f);
        b2.lineTo(12.0f, 13.98f);
        b2.lineToRelative(-2.39f, 1.44f);
        b2.lineToRelative(0.63f, -2.72f);
        b2.lineToRelative(-2.11f, -1.83f);
        gy.B(b2, 2.78f, -0.24f, 12.0f, 8.06f);
        b2.moveTo(11.54f, 4.02f);
        b2.lineToRelative(-2.0f, 4.72f);
        b2.lineToRelative(-5.02f, 0.43f);
        b2.curveToRelative(1.1f, -2.88f, 3.8f, -4.97f, 7.02f, -5.15f);
        b2.close();
        b2.moveTo(4.0f, 12.0f);
        b2.curveToRelative(0.0f, -0.64f, 0.08f, -1.26f, 0.23f, -1.86f);
        b2.lineToRelative(3.79f, 3.28f);
        b2.lineToRelative(-1.11f, 4.75f);
        b2.curveTo(5.14f, 16.7f, 4.0f, 14.48f, 4.0f, 12.0f);
        b2.close();
        b2.moveTo(11.99f, 20.0f);
        b2.curveToRelative(-1.52f, 0.0f, -2.94f, -0.44f, -4.15f, -1.18f);
        b2.lineTo(12.0f, 16.31f);
        b2.lineToRelative(4.16f, 2.51f);
        b2.curveToRelative(-1.22f, 0.74f, -2.64f, 1.18f, -4.17f, 1.18f);
        k4.x(b2, 17.09f, 18.17f, -1.1f, -4.76f);
        b2.lineToRelative(3.79f, -3.28f);
        b2.curveToRelative(0.13f, 0.6f, 0.22f, 1.23f, 0.22f, 1.87f);
        b2.curveToRelative(0.0f, 2.48f, -1.14f, 4.7f, -2.91f, 6.17f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stars = build;
        build.getClass();
        return build;
    }
}
