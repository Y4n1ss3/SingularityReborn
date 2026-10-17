package androidx.compose.material.icons.filled;

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
public final class SnowboardingKt {
    private static ImageVector _snowboarding;

    public static final ImageVector getSnowboarding(Icons.Filled filled) {
        ImageVector imageVector = _snowboarding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Snowboarding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.0f, 3.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(14.0f, 4.1f, 14.0f, 3.0f);
        b.close();
        b.moveTo(21.4f, 20.09f);
        b.curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f);
        b.curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f);
        b.lineTo(17.0f, 20.69f);
        b.lineToRelative(-1.0f, -6.19f);
        b.lineToRelative(-3.32f, -2.67f);
        b.lineToRelative(1.8f, -2.89f);
        b.curveTo(15.63f, 10.78f, 17.68f, 12.0f, 20.0f, 12.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-1.85f, 0.0f, -3.44f, -1.12f, -4.13f, -2.72f);
        b.lineToRelative(-0.52f, -1.21f);
        b.curveTo(15.16f, 5.64f, 14.61f, 5.0f, 13.7f, 5.0f);
        b.horizontalLineTo(8.0f);
        b.lineTo(5.5f, 9.0f);
        b.lineToRelative(1.7f, 1.06f);
        b.lineTo(9.1f, 7.0f);
        b.horizontalLineToRelative(2.35f);
        b.lineToRelative(-2.51f, 3.99f);
        b.curveToRelative(-0.28f, 0.45f, -0.37f, 1.0f, -0.25f, 1.52f);
        b.lineTo(9.5f, 16.0f);
        b.lineTo(6.0f, 18.35f);
        b.lineToRelative(-0.47f, -0.1f);
        b.curveToRelative(-0.96f, -0.2f, -1.71f, -0.85f, -2.1f, -1.67f);
        b.curveToRelative(-0.1f, -0.21f, -0.28f, -0.37f, -0.51f, -0.42f);
        b.curveToRelative(-0.43f, -0.09f, -0.82f, 0.2f, -0.9f, 0.58f);
        b.curveTo(1.98f, 16.88f, 2.0f, 17.05f, 2.07f, 17.2f);
        b.curveToRelative(0.58f, 1.24f, 1.71f, 2.2f, 3.15f, 2.51f);
        b.lineToRelative(12.63f, 2.69f);
        b.curveToRelative(1.44f, 0.31f, 2.86f, -0.11f, 3.9f, -1.01f);
        b.curveToRelative(0.13f, -0.11f, 0.21f, -0.26f, 0.24f, -0.41f);
        b.curveTo(22.06f, 20.6f, 21.83f, 20.18f, 21.4f, 20.09f);
        k4.x(b, 8.73f, 18.93f, 3.02f, -2.03f);
        b.lineToRelative(-0.44f, -3.32f);
        b.lineToRelative(2.84f, 2.02f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 0.75f, 4.64f, 8.73f, 18.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowboarding = build;
        build.getClass();
        return build;
    }
}
