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
import defpackage.er;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsRunKt {
    private static ImageVector _directionsRun;

    public static final ImageVector getDirectionsRun(Icons.Rounded rounded) {
        ImageVector imageVector = _directionsRun;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DirectionsRun", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.49f, 5.48f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        k4.x(b, 10.32f, 17.48f, 0.57f, -2.5f);
        b.lineToRelative(2.1f, 2.0f);
        b.verticalLineToRelative(5.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-5.64f);
        b.curveToRelative(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f);
        b.lineToRelative(-1.48f, -1.41f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f);
        b.curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1.0f);
        b.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.85f, -0.98f);
        b.curveToRelative(-1.52f, -0.25f, -2.78f, -1.15f, -3.45f, -2.33f);
        b.lineToRelative(-1.0f, -1.6f);
        b.curveToRelative(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        b.curveToRelative(-0.3f, 0.0f, -0.5f, 0.1f, -0.8f, 0.1f);
        b.lineTo(7.21f, 7.76f);
        b.curveToRelative(-0.74f, 0.32f, -1.22f, 1.04f, -1.22f, 1.85f);
        b.verticalLineToRelative(2.37f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.4f);
        b.lineToRelative(1.8f, -0.7f);
        b.lineToRelative(-1.6f, 8.1f);
        b.lineToRelative(-3.92f, -0.8f);
        b.curveToRelative(-0.54f, -0.11f, -1.07f, 0.24f, -1.18f, 0.78f);
        b.lineTo(3.09f, 17.0f);
        b.curveToRelative(-0.11f, 0.54f, 0.24f, 1.07f, 0.78f, 1.18f);
        b.lineToRelative(4.11f, 0.82f);
        b.curveToRelative(1.06f, 0.21f, 2.1f, -0.46f, 2.34f, -1.52f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsRun = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getDirectionsRun$annotations(Icons.Rounded rounded) {
    }
}
