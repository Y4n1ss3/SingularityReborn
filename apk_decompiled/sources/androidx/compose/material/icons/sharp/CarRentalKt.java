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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarRentalKt {
    private static ImageVector _carRental;

    public static final ImageVector getCarRental(Icons.Sharp sharp) {
        ImageVector imageVector = _carRental;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CarRental", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
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
        b.reflectiveCurveTo(8.55f, 5.0f, 8.0f, 5.0f);
        r6.g(b, 17.11f, 9.0f, 6.89f);
        fc.t(b, 5.0f, 14.69f, 22.0f, 2.0f);
        r6.D(b, -2.0f, 10.0f, 2.0f, 2.0f);
        kf0.t(b, -7.31f, 17.11f, 9.0f);
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
