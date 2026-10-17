package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BatteryUnknownKt {
    private static ImageVector _batteryUnknown;

    public static final ImageVector getBatteryUnknown(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _batteryUnknown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.BatteryUnknown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.67f, 4.0f, 14.0f, 4.0f);
        fc.w(i, 14.0f, 2.0f, -4.0f, 2.0f);
        i.lineTo(8.33f, 4.0f);
        i.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        i.verticalLineToRelative(15.33f);
        i.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
        i.horizontalLineToRelative(7.33f);
        i.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        i.lineTo(17.0f, 5.33f);
        i.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        r6.B(i, 13.0f, 18.0f, -2.0f, -2.0f);
        fc.x(i, 2.0f, 2.0f, 14.3f, 12.69f);
        i.reflectiveCurveToRelative(-0.38f, 0.42f, -0.67f, 0.71f);
        i.curveToRelative(-0.48f, 0.48f, -0.83f, 1.15f, -0.83f, 1.6f);
        i.horizontalLineToRelative(-1.6f);
        i.curveToRelative(0.0f, -0.83f, 0.46f, -1.52f, 0.93f, -2.0f);
        i.lineToRelative(0.93f, -0.94f);
        i.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        i.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        i.lineTo(9.0f, 11.0f);
        i.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        i.curveToRelative(0.0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryUnknown = build;
        build.getClass();
        return build;
    }
}
