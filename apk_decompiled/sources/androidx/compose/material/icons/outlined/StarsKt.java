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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarsKt {
    private static ImageVector _stars;

    public static final ImageVector getStars(Icons.Outlined outlined) {
        ImageVector imageVector = _stars;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Stars", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.99f, 2.0f);
        b.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        k4.x(b, 19.47f, 9.16f, -5.01f, -0.43f);
        b.lineToRelative(-2.0f, -4.71f);
        b.curveToRelative(3.21f, 0.19f, 5.91f, 2.27f, 7.01f, 5.14f);
        k4.r(b, 14.4f, 15.42f, 12.0f, 13.98f);
        b.lineToRelative(-2.39f, 1.44f);
        b.lineToRelative(0.63f, -2.72f);
        b.lineToRelative(-2.11f, -1.83f);
        b.lineToRelative(2.78f, -0.24f);
        b.lineTo(12.0f, 8.06f);
        b.lineToRelative(1.09f, 2.56f);
        b.lineToRelative(2.78f, 0.24f);
        fc.C(b, -2.11f, 1.83f, 0.64f, 2.73f);
        b.moveTo(11.54f, 4.02f);
        b.lineToRelative(-2.0f, 4.72f);
        b.lineToRelative(-5.02f, 0.43f);
        b.curveToRelative(1.1f, -2.88f, 3.8f, -4.97f, 7.02f, -5.15f);
        b.close();
        b.moveTo(4.0f, 12.0f);
        b.curveToRelative(0.0f, -0.64f, 0.08f, -1.26f, 0.23f, -1.86f);
        b.lineToRelative(3.79f, 3.28f);
        b.lineToRelative(-1.11f, 4.75f);
        b.curveTo(5.13f, 16.7f, 4.0f, 14.48f, 4.0f, 12.0f);
        k4.r(b, 7.84f, 18.82f, 12.0f, 16.31f);
        b.lineToRelative(4.16f, 2.5f);
        b.curveToRelative(-1.22f, 0.75f, -2.64f, 1.19f, -4.17f, 1.19f);
        b.curveToRelative(-1.52f, 0.0f, -2.94f, -0.44f, -4.15f, -1.18f);
        k4.x(b, 17.09f, 18.17f, -1.11f, -4.75f);
        b.lineToRelative(3.79f, -3.28f);
        b.curveToRelative(0.14f, 0.59f, 0.23f, 1.22f, 0.23f, 1.86f);
        b.curveToRelative(0.0f, 2.48f, -1.14f, 4.7f, -2.91f, 6.17f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stars = build;
        build.getClass();
        return build;
    }
}
