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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompassCalibrationKt {
    private static ImageVector _compassCalibration;

    public static final ImageVector getCompassCalibration(Icons.Outlined outlined) {
        ImageVector imageVector = _compassCalibration;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CompassCalibration", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 12.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        b.close();
        b.moveTo(12.0f, 3.0f);
        b.curveTo(8.1f, 3.0f, 4.56f, 4.59f, 2.0f, 7.15f);
        b.lineToRelative(5.0f, 5.0f);
        b.curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5.0f, -2.08f);
        b.reflectiveCurveToRelative(3.72f, 0.79f, 5.0f, 2.07f);
        b.lineToRelative(5.0f, -5.0f);
        b.curveTo(19.44f, 4.59f, 15.9f, 3.0f, 12.0f, 3.0f);
        b.close();
        b.moveTo(16.84f, 9.47f);
        b.curveToRelative(-1.44f, -0.91f, -3.1f, -1.4f, -4.84f, -1.4f);
        b.curveToRelative(-1.74f, 0.0f, -3.41f, 0.49f, -4.85f, 1.41f);
        b.lineTo(4.94f, 7.26f);
        b.curveTo(6.99f, 5.79f, 9.44f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(2.56f, 0.0f, 5.0f, 0.79f, 7.05f, 2.26f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -2.21f, 2.21f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compassCalibration = build;
        build.getClass();
        return build;
    }
}
