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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalGasStationKt {
    private static ImageVector _localGasStation;

    public static final ImageVector getLocalGasStation(Icons.Rounded rounded) {
        ImageVector imageVector = _localGasStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalGasStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.77f, 7.23f, 0.01f, -0.01f);
        e.lineToRelative(-3.19f, -3.19f);
        e.curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f);
        e.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        e.lineToRelative(1.58f, 1.58f);
        e.curveToRelative(-1.05f, 0.4f, -1.76f, 1.47f, -1.58f, 2.71f);
        e.curveToRelative(0.16f, 1.1f, 1.1f, 1.99f, 2.2f, 2.11f);
        e.curveToRelative(0.47f, 0.05f, 0.88f, -0.03f, 1.27f, -0.2f);
        e.verticalLineToRelative(7.21f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.lineTo(17.0f, 14.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-1.0f);
        e.lineTo(14.0f, 5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.lineTo(6.0f, 3.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(15.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(8.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(e, -6.5f, 1.5f, 4.86f);
        e.curveToRelative(0.0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f);
        e.curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f);
        e.lineTo(20.5f, 9.0f);
        e.curveToRelative(0.0f, -0.69f, -0.28f, -1.32f, -0.73f, -1.77f);
        k4.r(e, 12.0f, 10.0f, 6.0f, 10.0f);
        e.lineTo(6.0f, 6.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(4.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        r6.l(e, 4.0f, 18.0f, 10.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localGasStation = build;
        build.getClass();
        return build;
    }
}
