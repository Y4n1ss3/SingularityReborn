package androidx.compose.material.icons.automirrored.rounded;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsWalkKt {
    private static ImageVector _directionsWalk;

    public static final ImageVector getDirectionsWalk(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _directionsWalk;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.DirectionsWalk", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        k4.r(b, 9.8f, 8.9f, 7.24f, 21.81f);
        b.curveToRelative(-0.13f, 0.61f, 0.35f, 1.19f, 0.98f, 1.19f);
        b.horizontalLineToRelative(0.08f);
        b.curveToRelative(0.47f, 0.0f, 0.87f, -0.32f, 0.98f, -0.78f);
        b.lineTo(10.9f, 15.0f);
        b.lineToRelative(2.1f, 2.0f);
        b.verticalLineToRelative(5.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-5.64f);
        b.curveToRelative(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f);
        b.lineTo(12.9f, 13.5f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f);
        b.curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1.0f);
        b.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.85f, -0.98f);
        b.curveToRelative(-1.52f, -0.25f, -2.78f, -1.15f, -3.45f, -2.33f);
        b.lineToRelative(-1.0f, -1.6f);
        b.curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f);
        b.lineTo(7.22f, 7.78f);
        b.curveTo(6.48f, 8.1f, 6.0f, 8.82f, 6.0f, 9.63f);
        b.verticalLineTo(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(9.6f);
        b.lineToRelative(1.8f, -0.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsWalk = build;
        build.getClass();
        return build;
    }
}
