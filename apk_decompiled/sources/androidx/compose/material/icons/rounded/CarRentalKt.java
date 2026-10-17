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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarRentalKt {
    private static ImageVector _carRental;

    public static final ImageVector getCarRental(Icons.Rounded rounded) {
        ImageVector imageVector = _carRental;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CarRental", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 7.0f);
        b.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.83f, -2.0f);
        b.horizontalLineTo(16.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(5.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-7.17f);
        b.curveTo(10.35f, 1.65f, 8.95f, 0.76f, 7.4f, 1.06f);
        b.curveTo(6.23f, 1.29f, 5.28f, 2.25f, 5.05f, 3.42f);
        b.curveTo(4.7f, 5.32f, 6.15f, 7.0f, 8.0f, 7.0f);
        b.close();
        b.moveTo(8.0f, 3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveTo(8.55f, 5.0f, 8.0f, 5.0f);
        b.reflectiveCurveTo(7.0f, 4.55f, 7.0f, 4.0f);
        b.reflectiveCurveTo(7.45f, 3.0f, 8.0f, 3.0f);
        r6.g(b, 16.39f, 9.0f, 7.61f);
        b.curveTo(7.18f, 9.0f, 6.8f, 9.28f, 6.66f, 9.68f);
        b.lineTo(5.0f, 14.69f);
        b.verticalLineTo(21.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(b, -1.0f, 10.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-6.31f);
        b.lineToRelative(-1.66f, -5.01f);
        b.curveTo(17.2f, 9.28f, 16.82f, 9.0f, 16.39f, 9.0f);
        b.close();
        b.moveTo(9.0f, 17.5f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveTo(9.55f, 17.5f, 9.0f, 17.5f);
        b.close();
        b.moveTo(15.0f, 17.5f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveTo(15.55f, 17.5f, 15.0f, 17.5f);
        k4.x(b, 7.67f, 13.0f, 0.66f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(b, 7.34f, 0.66f, 2.0f, 7.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRental = build;
        build.getClass();
        return build;
    }
}
