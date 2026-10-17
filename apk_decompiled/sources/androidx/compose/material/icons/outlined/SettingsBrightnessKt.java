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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsBrightnessKt {
    private static ImageVector _settingsBrightness;

    public static final ImageVector getSettingsBrightness(Icons.Outlined outlined) {
        ImageVector imageVector = _settingsBrightness;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SettingsBrightness", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 3.0f, 3.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(18.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(23.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 21.0f, 19.01f, 3.0f, 19.01f);
        r6.m(i, 3.0f, 4.99f, 18.0f, 14.02f);
        i.moveTo(8.0f, 16.0f);
        i.horizontalLineToRelative(2.5f);
        i.lineToRelative(1.5f, 1.5f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineTo(16.0f, 16.0f);
        i.verticalLineToRelative(-2.5f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineToRelative(-1.5f, -1.5f);
        i.lineTo(16.0f, 8.0f);
        i.horizontalLineToRelative(-2.5f);
        i.lineTo(12.0f, 6.5f);
        i.lineTo(10.5f, 8.0f);
        i.lineTo(8.0f, 8.0f);
        i.verticalLineToRelative(2.5f);
        i.lineTo(6.5f, 12.0f);
        r6.C(i, 8.0f, 13.5f, 8.0f, 16.0f);
        i.moveTo(12.0f, 9.0f);
        i.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        i.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 12.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsBrightness = build;
        build.getClass();
        return build;
    }
}
