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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposureNeg2Kt {
    private static ImageVector _exposureNeg2;

    public static final ImageVector getExposureNeg2(Icons.Sharp sharp) {
        ImageVector imageVector = _exposureNeg2;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ExposureNeg2", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.05f, 16.29f, 2.86f, -3.07f);
        e.curveToRelative(0.38f, -0.39f, 0.72f, -0.79f, 1.04f, -1.18f);
        e.curveToRelative(0.32f, -0.39f, 0.59f, -0.78f, 0.82f, -1.17f);
        e.reflectiveCurveToRelative(0.41f, -0.78f, 0.54f, -1.17f);
        e.reflectiveCurveToRelative(0.19f, -0.79f, 0.19f, -1.18f);
        e.curveToRelative(0.0f, -0.53f, -0.09f, -1.02f, -0.27f, -1.46f);
        e.reflectiveCurveToRelative(-0.44f, -0.81f, -0.78f, -1.11f);
        e.curveToRelative(-0.34f, -0.31f, -0.77f, -0.54f, -1.26f, -0.71f);
        e.curveToRelative(-0.51f, -0.16f, -1.08f, -0.24f, -1.72f, -0.24f);
        e.curveToRelative(-0.69f, 0.0f, -1.31f, 0.11f, -1.85f, 0.32f);
        e.curveToRelative(-0.54f, 0.21f, -1.0f, 0.51f, -1.36f, 0.88f);
        e.curveToRelative(-0.37f, 0.37f, -0.65f, 0.8f, -0.84f, 1.3f);
        e.curveToRelative(-0.18f, 0.47f, -0.27f, 0.97f, -0.28f, 1.5f);
        e.horizontalLineToRelative(2.14f);
        e.curveToRelative(0.01f, -0.31f, 0.05f, -0.6f, 0.13f, -0.87f);
        e.curveToRelative(0.09f, -0.29f, 0.23f, -0.54f, 0.4f, -0.75f);
        e.curveToRelative(0.18f, -0.21f, 0.41f, -0.37f, 0.68f, -0.49f);
        e.reflectiveCurveToRelative(0.6f, -0.18f, 0.96f, -0.18f);
        e.curveToRelative(0.31f, 0.0f, 0.58f, 0.05f, 0.81f, 0.15f);
        e.reflectiveCurveToRelative(0.43f, 0.25f, 0.59f, 0.43f);
        e.reflectiveCurveToRelative(0.28f, 0.4f, 0.37f, 0.65f);
        e.curveToRelative(0.08f, 0.25f, 0.13f, 0.52f, 0.13f, 0.81f);
        e.curveToRelative(0.0f, 0.22f, -0.03f, 0.43f, -0.08f, 0.65f);
        e.curveToRelative(-0.06f, 0.22f, -0.15f, 0.45f, -0.29f, 0.7f);
        e.curveToRelative(-0.14f, 0.25f, -0.32f, 0.53f, -0.56f, 0.83f);
        e.curveToRelative(-0.23f, 0.3f, -0.52f, 0.65f, -0.88f, 1.03f);
        uo.x(e, -4.17f, 4.55f, 18.0f, 21.0f);
        kf0.C(e, -1.71f, -5.95f, 2.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(e, 2.0f, 8.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exposureNeg2 = build;
        build.getClass();
        return build;
    }
}
