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
import defpackage.c21;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsRailwayFilledKt {
    private static ImageVector _directionsRailwayFilled;

    public static final ImageVector getDirectionsRailwayFilled(Icons.Rounded rounded) {
        ImageVector imageVector = _directionsRailwayFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DirectionsRailwayFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f);
        b.verticalLineToRelative(9.5f);
        b.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        b.lineToRelative(-1.21f, 0.81f);
        b.curveTo(6.11f, 19.93f, 6.0f, 20.13f, 6.0f, 20.35f);
        b.verticalLineToRelative(0.0f);
        b.curveTo(6.0f, 20.71f, 6.29f, 21.0f, 6.65f, 21.0f);
        b.horizontalLineToRelative(10.7f);
        b.curveToRelative(0.36f, 0.0f, 0.65f, -0.29f, 0.65f, -0.65f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.22f, -0.11f, -0.42f, -0.29f, -0.54f);
        b.lineTo(16.5f, 19.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.verticalLineTo(6.0f);
        b.curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 16.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(11.17f, 13.0f, 12.0f, 13.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(12.83f, 16.0f, 12.0f, 16.0f);
        c21.d(b, 18.0f, 10.0f, 6.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 12.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsRailwayFilled = build;
        build.getClass();
        return build;
    }
}
