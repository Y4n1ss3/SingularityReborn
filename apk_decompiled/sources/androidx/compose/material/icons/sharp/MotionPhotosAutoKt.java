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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotionPhotosAutoKt {
    private static ImageVector _motionPhotosAuto;

    public static final ImageVector getMotionPhotosAuto(Icons.Sharp sharp) {
        ImageVector imageVector = _motionPhotosAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MotionPhotosAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(2.88f, 7.88f, 1.54f, 1.54f);
        e.curveTo(4.15f, 10.23f, 4.0f, 11.1f, 4.0f, 12.0f);
        e.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        e.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        e.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        e.curveToRelative(-0.9f, 0.0f, -1.77f, 0.15f, -2.58f, 0.42f);
        e.lineTo(7.89f, 2.89f);
        e.curveTo(9.15f, 2.32f, 10.54f, 2.0f, 12.0f, 2.0f);
        e.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        e.reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f);
        e.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        e.curveTo(2.0f, 10.53f, 2.32f, 9.14f, 2.88f, 7.88f);
        e.close();
        e.moveTo(7.0f, 5.5f);
        e.curveTo(7.0f, 6.33f, 6.33f, 7.0f, 5.5f, 7.0f);
        e.reflectiveCurveTo(4.0f, 6.33f, 4.0f, 5.5f);
        e.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        e.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        af0.l(e, 12.03f, 8.99f, -0.07f);
        e.lineToRelative(-1.16f, 3.31f);
        gy.n(e, 2.39f, 12.03f, 8.99f);
        e.moveTo(12.0f, 18.0f);
        e.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        e.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        e.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        e.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        af0.l(e, 11.29f, 7.5f, 1.43f);
        e.lineToRelative(3.01f, 8.0f);
        kf0.B(e, -1.39f, -0.72f, -2.04f, -3.23f);
        e.lineTo(9.66f, 15.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(e, 8.28f, 11.29f, 7.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosAuto = build;
        build.getClass();
        return build;
    }
}
