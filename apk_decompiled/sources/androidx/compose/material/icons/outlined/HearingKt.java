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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HearingKt {
    private static ImageVector _hearing;

    public static final ImageVector getHearing(Icons.Outlined outlined) {
        ImageVector imageVector = _hearing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Hearing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 20.0f);
        b.curveToRelative(-0.29f, 0.0f, -0.56f, -0.06f, -0.76f, -0.15f);
        b.curveToRelative(-0.71f, -0.37f, -1.21f, -0.88f, -1.71f, -2.38f);
        b.curveToRelative(-0.51f, -1.56f, -1.47f, -2.29f, -2.39f, -3.0f);
        b.curveToRelative(-0.79f, -0.61f, -1.61f, -1.24f, -2.32f, -2.53f);
        b.curveTo(9.29f, 10.98f, 9.0f, 9.93f, 9.0f, 9.0f);
        b.curveToRelative(0.0f, -2.8f, 2.2f, -5.0f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(5.0f, 2.2f, 5.0f, 5.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -3.93f, -3.07f, -7.0f, -7.0f, -7.0f);
        b.reflectiveCurveTo(7.0f, 5.07f, 7.0f, 9.0f);
        b.curveToRelative(0.0f, 1.26f, 0.38f, 2.65f, 1.07f, 3.9f);
        b.curveToRelative(0.91f, 1.65f, 1.98f, 2.48f, 2.85f, 3.15f);
        b.curveToRelative(0.81f, 0.62f, 1.39f, 1.07f, 1.71f, 2.05f);
        b.curveToRelative(0.6f, 1.82f, 1.37f, 2.84f, 2.73f, 3.55f);
        b.curveToRelative(0.51f, 0.23f, 1.07f, 0.35f, 1.64f, 0.35f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        k4.r(b, 7.64f, 2.64f, 6.22f, 1.22f);
        b.curveTo(4.23f, 3.21f, 3.0f, 5.96f, 3.0f, 9.0f);
        b.reflectiveCurveToRelative(1.23f, 5.79f, 3.22f, 7.78f);
        b.lineToRelative(1.41f, -1.41f);
        b.curveTo(6.01f, 13.74f, 5.0f, 11.49f, 5.0f, 9.0f);
        b.reflectiveCurveToRelative(1.01f, -4.74f, 2.64f, -6.36f);
        b.close();
        b.moveTo(11.5f, 9.0f);
        b.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        b.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -2.5f, 1.12f, -2.5f, 2.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hearing = build;
        build.getClass();
        return build;
    }
}
