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
import defpackage.af0;
import defpackage.c21;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsRailwayFilledKt {
    private static ImageVector _directionsRailwayFilled;

    public static final ImageVector getDirectionsRailwayFilled(Icons.Filled filled) {
        ImageVector imageVector = _directionsRailwayFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DirectionsRailwayFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f);
        b.verticalLineToRelative(9.5f);
        b.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        af0.m(b, 6.0f, 20.0f, 1.0f, 12.0f);
        b.verticalLineToRelative(-1.0f);
        b.lineToRelative(-1.5f, -1.0f);
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
