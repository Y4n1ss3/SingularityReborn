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
import defpackage.c21;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChargingStationKt {
    private static ImageVector _chargingStation;

    public static final ImageVector getChargingStation(Icons.Rounded rounded) {
        ImageVector imageVector = _chargingStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ChargingStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(17.0f, 1.0f, 7.0f);
        d.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        d.verticalLineToRelative(18.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(3.0f);
        d.curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f);
        c21.d(d, 17.0f, 18.0f, 7.0f, 6.0f);
        uo.r(d, 10.0f, 18.0f, 12.5f, 11.0f);
        d.verticalLineTo(9.12f);
        d.curveToRelative(0.0f, -0.53f, -0.71f, -0.7f, -0.95f, -0.22f);
        d.lineToRelative(-1.69f, 3.38f);
        d.curveTo(9.7f, 12.61f, 9.94f, 13.0f, 10.31f, 13.0f);
        d.horizontalLineToRelative(1.19f);
        d.verticalLineToRelative(1.88f);
        d.curveToRelative(0.0f, 0.53f, 0.71f, 0.7f, 0.95f, 0.22f);
        d.lineToRelative(1.69f, -3.38f);
        d.curveTo(14.3f, 11.39f, 14.06f, 11.0f, 13.69f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(d, 12.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chargingStation = build;
        build.getClass();
        return build;
    }
}
