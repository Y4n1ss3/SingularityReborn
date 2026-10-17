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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsCarFilledKt {
    private static ImageVector _directionsCarFilled;

    public static final ImageVector getDirectionsCarFilled(Icons.Filled filled) {
        ImageVector imageVector = _directionsCarFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DirectionsCarFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.92f, 6.01f);
        b.curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f);
        b.horizontalLineToRelative(-11.0f);
        b.curveTo(5.84f, 5.0f, 5.29f, 5.42f, 5.08f, 6.01f);
        b.lineTo(3.0f, 12.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(b, -1.0f, 12.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.t(b, -8.0f, 18.92f, 6.01f);
        b.moveTo(7.5f, 16.0f);
        b.curveTo(6.67f, 16.0f, 6.0f, 15.33f, 6.0f, 14.5f);
        b.reflectiveCurveTo(6.67f, 13.0f, 7.5f, 13.0f);
        b.reflectiveCurveTo(9.0f, 13.67f, 9.0f, 14.5f);
        b.reflectiveCurveTo(8.33f, 16.0f, 7.5f, 16.0f);
        b.close();
        b.moveTo(16.5f, 16.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(17.33f, 16.0f, 16.5f, 16.0f);
        k4.x(b, 5.81f, 10.0f, 1.04f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(b, 10.29f, 1.04f, 3.0f, 5.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsCarFilled = build;
        build.getClass();
        return build;
    }
}
