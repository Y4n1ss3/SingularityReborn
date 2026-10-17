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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BatteryStdKt {
    private static ImageVector _batteryStd;

    public static final ImageVector getBatteryStd(Icons.Outlined outlined) {
        ImageVector imageVector = _batteryStd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BatteryStd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(15.67f, 4.0f, 14.0f, 2.0f, -4.0f);
        f.verticalLineToRelative(2.0f);
        f.horizontalLineTo(8.33f);
        f.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        f.verticalLineToRelative(15.33f);
        f.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
        f.horizontalLineToRelative(7.33f);
        f.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        f.verticalLineTo(5.33f);
        f.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        f.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, f.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryStd = build;
        build.getClass();
        return build;
    }
}
