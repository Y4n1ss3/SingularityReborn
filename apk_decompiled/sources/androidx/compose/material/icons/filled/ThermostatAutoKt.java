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
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThermostatAutoKt {
    private static ImageVector _thermostatAuto;

    public static final ImageVector getThermostatAuto(Icons.Filled filled) {
        ImageVector imageVector = _thermostatAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThermostatAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(11.0f, 12.0f, 6.0f);
        d.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        d.reflectiveCurveTo(5.0f, 4.34f, 5.0f, 6.0f);
        d.verticalLineToRelative(6.0f);
        d.curveToRelative(-1.21f, 0.91f, -2.0f, 2.37f, -2.0f, 4.0f);
        d.curveToRelative(0.0f, 1.12f, 0.38f, 2.14f, 1.0f, 2.97f);
        d.verticalLineTo(19.0f);
        d.horizontalLineToRelative(0.02f);
        d.curveToRelative(0.91f, 1.21f, 2.35f, 2.0f, 3.98f, 2.0f);
        d.reflectiveCurveToRelative(3.06f, -0.79f, 3.98f, -2.0f);
        d.horizontalLineTo(12.0f);
        d.verticalLineToRelative(-0.03f);
        d.curveToRelative(0.62f, -0.83f, 1.0f, -1.85f, 1.0f, -2.97f);
        d.curveTo(13.0f, 14.37f, 12.21f, 12.91f, 11.0f, 12.0f);
        d.close();
        d.moveTo(5.0f, 16.0f);
        d.curveToRelative(0.0f, -0.94f, 0.45f, -1.84f, 1.2f, -2.4f);
        d.lineTo(7.0f, 13.0f);
        d.verticalLineTo(6.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(7.0f);
        d.lineToRelative(0.8f, 0.6f);
        d.curveToRelative(0.75f, 0.57f, 1.2f, 1.46f, 1.2f, 2.4f);
        kp0.r(d, 5.0f, 18.62f, 4.0f, -1.61f);
        d.lineToRelative(-3.38f, 9.0f);
        uo.n(d, 1.56f, 16.0f, 10.7f, 3.63f);
        d.lineToRelative(0.8f, 2.3f);
        kf0.m(d, 22.0f, 18.62f, 4.0f);
        d.moveTo(16.47f, 9.39f);
        d.lineToRelative(1.31f, -3.72f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(d, 0.08f, 1.31f, 3.72f, 16.47f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thermostatAuto = build;
        build.getClass();
        return build;
    }
}
