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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsRailwayKt {
    private static ImageVector _directionsRailway;

    public static final ImageVector getDirectionsRailway(Icons.Rounded rounded) {
        ImageVector imageVector = _directionsRailway;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DirectionsRailway", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 15.5f);
        b.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        af0.m(b, 6.0f, 20.5f, 0.5f, 12.0f);
        b.verticalLineToRelative(-0.5f);
        b.lineTo(16.5f, 19.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.lineTo(20.0f, 5.0f);
        b.curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f);
        b.reflectiveCurveToRelative(-8.0f, 0.5f, -8.0f, 4.0f);
        r6.l(b, 10.5f, 12.0f, 17.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        k4.r(b, 18.0f, 10.0f, 6.0f, 10.0f);
        r6.m(b, 6.0f, 5.0f, 12.0f, 5.0f);
        b.moveTo(4.0f, 15.5f);
        b.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        b.lineToRelative(-1.14f, 1.15f);
        b.curveToRelative(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f);
        b.horizontalLineToRelative(10.58f);
        b.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        b.lineTo(16.5f, 19.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.lineTo(20.0f, 5.0f);
        b.curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f);
        b.reflectiveCurveToRelative(-8.0f, 0.5f, -8.0f, 4.0f);
        r6.l(b, 10.5f, 12.0f, 17.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        k4.r(b, 18.0f, 10.0f, 6.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(b, 6.0f, 5.0f, 12.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsRailway = build;
        build.getClass();
        return build;
    }
}
