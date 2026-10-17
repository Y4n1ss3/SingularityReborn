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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposureNeg2Kt {
    private static ImageVector _exposureNeg2;

    public static final ImageVector getExposureNeg2(Icons.TwoTone twoTone) {
        ImageVector imageVector = _exposureNeg2;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ExposureNeg2", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.98f, 10.1f);
        b.curveToRelative(-0.14f, 0.25f, -0.32f, 0.53f, -0.56f, 0.83f);
        b.curveToRelative(-0.23f, 0.3f, -0.52f, 0.65f, -0.88f, 1.03f);
        uo.x(b, -4.17f, 4.55f, 18.0f, 21.0f);
        gy.C(b, -1.71f, -5.95f, 2.86f, -3.07f);
        b.curveToRelative(0.38f, -0.39f, 0.72f, -0.79f, 1.04f, -1.18f);
        b.reflectiveCurveToRelative(0.59f, -0.78f, 0.82f, -1.17f);
        b.curveToRelative(0.23f, -0.39f, 0.41f, -0.78f, 0.54f, -1.17f);
        b.curveToRelative(0.13f, -0.39f, 0.19f, -0.79f, 0.19f, -1.18f);
        b.curveToRelative(0.0f, -0.53f, -0.09f, -1.02f, -0.27f, -1.46f);
        b.reflectiveCurveToRelative(-0.44f, -0.81f, -0.78f, -1.11f);
        b.curveToRelative(-0.34f, -0.31f, -0.77f, -0.54f, -1.26f, -0.71f);
        b.curveToRelative(-0.51f, -0.16f, -1.08f, -0.24f, -1.72f, -0.24f);
        b.curveToRelative(-0.69f, 0.0f, -1.31f, 0.11f, -1.85f, 0.32f);
        b.curveToRelative(-0.54f, 0.21f, -1.0f, 0.51f, -1.36f, 0.88f);
        b.curveToRelative(-0.37f, 0.37f, -0.65f, 0.8f, -0.84f, 1.3f);
        b.curveToRelative(-0.18f, 0.47f, -0.27f, 0.97f, -0.28f, 1.5f);
        b.horizontalLineToRelative(2.14f);
        b.curveToRelative(0.01f, -0.31f, 0.05f, -0.6f, 0.13f, -0.87f);
        b.curveToRelative(0.09f, -0.29f, 0.23f, -0.54f, 0.4f, -0.75f);
        b.curveToRelative(0.18f, -0.21f, 0.41f, -0.37f, 0.68f, -0.49f);
        b.curveToRelative(0.27f, -0.12f, 0.6f, -0.18f, 0.96f, -0.18f);
        b.curveToRelative(0.31f, 0.0f, 0.58f, 0.05f, 0.81f, 0.15f);
        b.reflectiveCurveToRelative(0.43f, 0.25f, 0.59f, 0.43f);
        b.curveToRelative(0.16f, 0.18f, 0.28f, 0.4f, 0.37f, 0.65f);
        b.curveToRelative(0.08f, 0.25f, 0.13f, 0.52f, 0.13f, 0.81f);
        b.curveToRelative(0.0f, 0.22f, -0.03f, 0.43f, -0.08f, 0.65f);
        b.curveToRelative(-0.06f, 0.22f, -0.15f, 0.45f, -0.29f, 0.7f);
        r6.B(b, 2.0f, 11.0f, 8.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exposureNeg2 = build;
        build.getClass();
        return build;
    }
}
