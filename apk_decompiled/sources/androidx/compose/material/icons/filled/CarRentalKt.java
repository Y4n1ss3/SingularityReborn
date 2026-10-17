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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarRentalKt {
    private static ImageVector _carRental;

    public static final ImageVector getCarRental(Icons.Filled filled) {
        ImageVector imageVector = _carRental;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CarRental", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(16.39f, 9.0f, 7.61f);
        d.curveTo(7.18f, 9.0f, 6.8f, 9.28f, 6.66f, 9.68f);
        d.lineToRelative(-1.66f, 5.0f);
        d.verticalLineToRelative(6.81f);
        d.curveTo(5.0f, 21.78f, 5.23f, 22.0f, 5.5f, 22.0f);
        d.horizontalLineToRelative(1.0f);
        d.curveTo(6.78f, 22.0f, 7.0f, 21.78f, 7.0f, 21.5f);
        kf0.r(d, 20.0f, 10.0f, 1.5f);
        d.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        d.horizontalLineToRelative(1.0f);
        d.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        d.verticalLineToRelative(-6.81f);
        d.lineToRelative(-1.66f, -5.0f);
        d.curveTo(17.2f, 9.28f, 16.82f, 9.0f, 16.39f, 9.0f);
        d.close();
        d.moveTo(7.78f, 18.0f);
        d.curveToRelative(-0.68f, 0.0f, -1.22f, -0.54f, -1.22f, -1.22f);
        d.reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f);
        d.reflectiveCurveTo(9.0f, 16.11f, 9.0f, 16.78f);
        d.reflectiveCurveTo(8.46f, 18.0f, 7.78f, 18.0f);
        d.close();
        d.moveTo(16.22f, 18.0f);
        d.curveTo(15.55f, 18.0f, 15.0f, 17.46f, 15.0f, 16.78f);
        d.reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f);
        d.reflectiveCurveToRelative(1.22f, 0.54f, 1.22f, 1.22f);
        d.reflectiveCurveTo(16.9f, 18.0f, 16.22f, 18.0f);
        k4.x(d, 6.29f, 14.0f, 1.33f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(d, 8.78f, 1.33f, 4.0f, 6.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.83f, 3.0f);
        b.curveTo(10.41f, 1.83f, 9.3f, 1.0f, 8.0f, 1.0f);
        b.curveTo(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
        b.curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.83f, -2.0f);
        af0.g(b, 16.0f, 2.0f, 2.0f, 5.0f);
        kf0.v(b, 1.0f, 3.0f, 10.83f);
        b.moveTo(8.0f, 5.0f);
        b.curveTo(7.45f, 5.0f, 7.0f, 4.55f, 7.0f, 4.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 8.55f, 5.0f, 8.0f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRental = build;
        build.getClass();
        return build;
    }
}
