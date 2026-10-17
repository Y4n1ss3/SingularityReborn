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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlightClassKt {
    private static ImageVector _flightClass;

    public static final ImageVector getFlightClass(Icons.Rounded rounded) {
        ImageVector imageVector = _flightClass;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlightClass", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(16.0f, 4.0f, -2.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(5.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(2.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineTo(6.0f);
        a.curveTo(18.0f, 4.9f, 17.1f, 4.0f, 16.0f, 4.0f);
        a.close();
        a.moveTo(6.0f, 4.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.verticalLineToRelative(3.0f);
        a.lineToRelative(2.5f, 8.0f);
        a.horizontalLineTo(17.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.horizontalLineTo(9.49f);
        a.curveToRelative(-0.88f, 0.0f, -1.66f, -0.58f, -1.92f, -1.43f);
        a.lineTo(5.08f, 8.28f);
        a.curveTo(5.03f, 8.09f, 5.0f, 7.9f, 5.0f, 7.71f);
        a.verticalLineTo(5.0f);
        a.curveTo(5.0f, 4.45f, 5.45f, 4.0f, 6.0f, 4.0f);
        a.close();
        a.moveTo(18.0f, 20.0f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.horizontalLineTo(9.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.horizontalLineToRelative(8.0f);
        a.curveTo(17.55f, 19.0f, 18.0f, 19.45f, 18.0f, 20.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightClass = build;
        build.getClass();
        return build;
    }
}
