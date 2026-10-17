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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposureZeroKt {
    private static ImageVector _exposureZero;

    public static final ImageVector getExposureZero(Icons.Filled filled) {
        ImageVector imageVector = _exposureZero;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ExposureZero", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.14f, 12.5f);
        b.curveToRelative(0.0f, 1.0f, -0.1f, 1.85f, -0.3f, 2.55f);
        b.curveToRelative(-0.2f, 0.7f, -0.48f, 1.27f, -0.83f, 1.7f);
        b.curveToRelative(-0.36f, 0.44f, -0.79f, 0.75f, -1.3f, 0.95f);
        b.curveToRelative(-0.51f, 0.2f, -1.07f, 0.3f, -1.7f, 0.3f);
        b.curveToRelative(-0.62f, 0.0f, -1.18f, -0.1f, -1.69f, -0.3f);
        b.curveToRelative(-0.51f, -0.2f, -0.95f, -0.51f, -1.31f, -0.95f);
        b.curveToRelative(-0.36f, -0.44f, -0.65f, -1.01f, -0.85f, -1.7f);
        b.curveToRelative(-0.2f, -0.7f, -0.3f, -1.55f, -0.3f, -2.55f);
        b.verticalLineToRelative(-2.04f);
        b.curveToRelative(0.0f, -1.0f, 0.1f, -1.85f, 0.3f, -2.55f);
        b.curveToRelative(0.2f, -0.7f, 0.48f, -1.26f, 0.84f, -1.69f);
        b.curveToRelative(0.36f, -0.43f, 0.8f, -0.74f, 1.31f, -0.93f);
        b.curveTo(10.81f, 5.1f, 11.38f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(0.63f, 0.0f, 1.19f, 0.1f, 1.7f, 0.29f);
        b.curveToRelative(0.51f, 0.19f, 0.95f, 0.5f, 1.31f, 0.93f);
        b.curveToRelative(0.36f, 0.43f, 0.64f, 0.99f, 0.84f, 1.69f);
        b.curveToRelative(0.2f, 0.7f, 0.3f, 1.54f, 0.3f, 2.55f);
        r6.l(b, 2.04f, 14.03f, 10.14f);
        b.curveToRelative(0.0f, -0.64f, -0.05f, -1.18f, -0.13f, -1.62f);
        b.curveToRelative(-0.09f, -0.44f, -0.22f, -0.79f, -0.4f, -1.06f);
        b.curveToRelative(-0.17f, -0.27f, -0.39f, -0.46f, -0.64f, -0.58f);
        b.curveToRelative(-0.25f, -0.13f, -0.54f, -0.19f, -0.86f, -0.19f);
        b.curveToRelative(-0.32f, 0.0f, -0.61f, 0.06f, -0.86f, 0.18f);
        b.reflectiveCurveToRelative(-0.47f, 0.31f, -0.64f, 0.58f);
        b.curveToRelative(-0.17f, 0.27f, -0.31f, 0.62f, -0.4f, 1.06f);
        b.reflectiveCurveToRelative(-0.13f, 0.98f, -0.13f, 1.62f);
        b.verticalLineToRelative(2.67f);
        b.curveToRelative(0.0f, 0.64f, 0.05f, 1.18f, 0.14f, 1.62f);
        b.curveToRelative(0.09f, 0.45f, 0.23f, 0.81f, 0.4f, 1.09f);
        b.reflectiveCurveToRelative(0.39f, 0.48f, 0.64f, 0.61f);
        b.reflectiveCurveToRelative(0.54f, 0.19f, 0.87f, 0.19f);
        b.curveToRelative(0.33f, 0.0f, 0.62f, -0.06f, 0.87f, -0.19f);
        b.reflectiveCurveToRelative(0.46f, -0.33f, 0.63f, -0.61f);
        b.curveToRelative(0.17f, -0.28f, 0.3f, -0.64f, 0.39f, -1.09f);
        b.curveToRelative(0.09f, -0.45f, 0.13f, -0.99f, 0.13f, -1.62f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, -2.66f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exposureZero = build;
        build.getClass();
        return build;
    }
}
