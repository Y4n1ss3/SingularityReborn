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
public final class BatteryChargingFullKt {
    private static ImageVector _batteryChargingFull;

    public static final ImageVector getBatteryChargingFull(Icons.Rounded rounded) {
        ImageVector imageVector = _batteryChargingFull;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BatteryChargingFull", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.67f, 4.0f, 14.0f, 4.0f);
        i.lineTo(14.0f, 3.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-2.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(1.0f);
        i.lineTo(8.33f, 4.0f);
        i.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        i.verticalLineToRelative(15.33f);
        i.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.34f, 22.0f);
        i.horizontalLineToRelative(7.32f);
        i.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        i.lineTo(17.0f, 5.33f);
        i.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        k4.x(i, 14.61f, 13.24f, -2.67f, 5.0f);
        i.curveToRelative(-0.24f, 0.45f, -0.94f, 0.28f, -0.94f, -0.24f);
        i.verticalLineToRelative(-3.5f);
        i.lineTo(9.83f, 14.5f);
        i.curveToRelative(-0.38f, 0.0f, -0.62f, -0.4f, -0.44f, -0.74f);
        i.lineToRelative(2.67f, -5.0f);
        i.curveToRelative(0.24f, -0.45f, 0.94f, -0.28f, 0.94f, 0.24f);
        i.verticalLineToRelative(3.5f);
        i.horizontalLineToRelative(1.17f);
        i.curveToRelative(0.37f, 0.0f, 0.62f, 0.4f, 0.44f, 0.74f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryChargingFull = build;
        build.getClass();
        return build;
    }
}
