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
public final class FlightTakeoffKt {
    private static ImageVector _flightTakeoff;

    public static final ImageVector getFlightTakeoff(Icons.Rounded rounded) {
        ImageVector imageVector = _flightTakeoff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlightTakeoff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        a.close();
        a.moveTo(22.07f, 9.64f);
        a.curveToRelative(-0.22f, -0.8f, -1.04f, -1.27f, -1.84f, -1.06f);
        a.lineTo(14.92f, 10.0f);
        a.lineTo(8.46f, 3.98f);
        a.curveToRelative(-0.27f, -0.26f, -0.66f, -0.35f, -1.02f, -0.25f);
        a.curveToRelative(-0.68f, 0.19f, -1.0f, 0.97f, -0.65f, 1.58f);
        a.lineToRelative(3.44f, 5.96f);
        a.lineToRelative(-4.97f, 1.33f);
        a.lineToRelative(-1.57f, -1.24f);
        a.curveToRelative(-0.25f, -0.19f, -0.57f, -0.26f, -0.88f, -0.18f);
        a.lineToRelative(-0.33f, 0.09f);
        a.curveToRelative(-0.32f, 0.08f, -0.47f, 0.45f, -0.3f, 0.73f);
        a.lineToRelative(1.88f, 3.25f);
        a.curveToRelative(0.23f, 0.39f, 0.69f, 0.58f, 1.12f, 0.47f);
        a.lineTo(21.0f, 11.48f);
        a.curveToRelative(0.8f, -0.22f, 1.28f, -1.04f, 1.07f, -1.84f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightTakeoff = build;
        build.getClass();
        return build;
    }
}
