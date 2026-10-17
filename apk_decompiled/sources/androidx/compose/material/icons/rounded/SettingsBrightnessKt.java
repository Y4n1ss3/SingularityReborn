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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsBrightnessKt {
    private static ImageVector _settingsBrightness;

    public static final ImageVector getSettingsBrightness(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsBrightness;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsBrightness", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        k4.r(d, 17.15f, 12.35f, 16.0f, 13.5f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        d.horizontalLineToRelative(-2.0f);
        d.lineToRelative(-1.15f, 1.15f);
        d.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        d.lineTo(10.5f, 16.0f);
        d.horizontalLineToRelative(-2.0f);
        d.curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f);
        d.verticalLineToRelative(-2.0f);
        d.lineToRelative(-1.15f, -1.15f);
        d.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        d.lineTo(8.0f, 10.5f);
        d.verticalLineToRelative(-2.0f);
        d.curveTo(8.0f, 8.22f, 8.22f, 8.0f, 8.5f, 8.0f);
        d.horizontalLineToRelative(2.0f);
        d.lineToRelative(1.15f, -1.15f);
        d.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        d.lineTo(13.5f, 8.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveTo(15.78f, 8.0f, 16.0f, 8.22f, 16.0f, 8.5f);
        d.verticalLineToRelative(2.0f);
        d.lineToRelative(1.15f, 1.15f);
        d.curveTo(17.34f, 11.84f, 17.34f, 12.16f, 17.15f, 12.35f);
        bv.v(d, 12.0f, 9.0f, 6.0f);
        d.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        d.curveTo(15.0f, 10.34f, 13.66f, 9.0f, 12.0f, 9.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsBrightness = build;
        build.getClass();
        return build;
    }
}
