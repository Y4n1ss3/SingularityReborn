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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlightLandKt {
    private static ImageVector _flightLand;

    public static final ImageVector getFlightLand(Icons.Rounded rounded) {
        ImageVector imageVector = _flightLand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlightLand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(20.5f, 19.0f, -17.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(17.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        k4.x(a, 3.51f, 11.61f, 15.83f, 4.24f);
        a.curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.84f, -1.06f);
        a.curveToRelative(0.21f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f);
        a.lineToRelative(-5.31f, -1.42f);
        a.lineToRelative(-2.58f, -8.45f);
        a.curveToRelative(-0.11f, -0.36f, -0.39f, -0.63f, -0.75f, -0.73f);
        a.curveToRelative(-0.68f, -0.18f, -1.35f, 0.33f, -1.35f, 1.04f);
        a.verticalLineToRelative(6.88f);
        a.lineTo(5.15f, 8.95f);
        a.lineTo(4.4f, 7.09f);
        a.curveToRelative(-0.12f, -0.29f, -0.36f, -0.51f, -0.67f, -0.59f);
        a.lineToRelative(-0.33f, -0.09f);
        a.curveToRelative(-0.32f, -0.09f, -0.63f, 0.15f, -0.63f, 0.48f);
        a.verticalLineToRelative(3.75f);
        a.curveToRelative(0.0f, 0.46f, 0.3f, 0.85f, 0.74f, 0.97f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightLand = build;
        build.getClass();
        return build;
    }
}
