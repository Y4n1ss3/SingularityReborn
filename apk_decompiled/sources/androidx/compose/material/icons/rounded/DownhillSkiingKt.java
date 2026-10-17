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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DownhillSkiingKt {
    private static ImageVector _downhillSkiing;

    public static final ImageVector getDownhillSkiing(Icons.Rounded rounded) {
        ImageVector imageVector = _downhillSkiing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DownhillSkiing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 4.5f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f);
        k4.x(b, 15.78f, 20.9f, 0.76f, 0.27f);
        b.curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f);
        b.curveToRelative(0.68f, 0.0f, 1.34f, -0.12f, 1.95f, -0.33f);
        b.curveToRelative(0.27f, -0.09f, 0.57f, -0.02f, 0.78f, 0.18f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, 0.4f, 0.23f, 1.06f, -0.3f, 1.24f);
        b.curveTo(20.17f, 22.86f, 19.35f, 23.0f, 18.5f, 23.0f);
        b.curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f);
        b.lineTo(2.7f, 17.72f);
        b.curveToRelative(-0.39f, -0.14f, -0.59f, -0.57f, -0.45f, -0.95f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.14f, -0.39f, 0.57f, -0.6f, 0.96f, -0.45f);
        b.lineToRelative(6.19f, 2.25f);
        b.lineToRelative(1.72f, -4.44f);
        b.lineTo(7.55f, 10.4f);
        b.curveTo(6.65f, 9.46f, 6.87f, 7.93f, 8.0f, 7.28f);
        b.lineToRelative(3.48f, -2.01f);
        b.curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f);
        b.lineToRelative(0.33f, 1.08f);
        b.curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f);
        b.lineToRelative(0.29f, -0.89f);
        b.curveToRelative(0.13f, -0.39f, 0.55f, -0.61f, 0.94f, -0.48f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.4f, 0.13f, 0.61f, 0.55f, 0.48f, 0.95f);
        b.lineToRelative(-0.6f, 1.85f);
        b.curveToRelative(-0.17f, 0.52f, -0.72f, 0.82f, -1.24f, 0.65f);
        b.curveToRelative(-2.02f, -0.63f, -3.64f, -2.15f, -4.42f, -4.1f);
        b.lineToRelative(-2.53f, 1.45f);
        b.lineToRelative(2.23f, 2.55f);
        b.curveToRelative(0.49f, 0.56f, 0.63f, 1.34f, 0.36f, 2.04f);
        b.lineToRelative(-1.78f, 4.63f);
        b.lineToRelative(3.09f, 1.12f);
        b.lineToRelative(2.1f, -6.44f);
        b.horizontalLineToRelative(0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 15.78f, 20.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downhillSkiing = build;
        build.getClass();
        return build;
    }
}
