package androidx.compose.material.icons.sharp;

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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsSuggestKt {
    private static ImageVector _settingsSuggest;

    public static final ImageVector getSettingsSuggest(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsSuggest;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsSuggest", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.41f, 6.59f, 15.0f, 5.5f);
        i.lineToRelative(2.41f, -1.09f);
        i.lineTo(18.5f, 2.0f);
        i.lineToRelative(1.09f, 2.41f);
        i.lineTo(22.0f, 5.5f);
        i.lineToRelative(-2.41f, 1.09f);
        r6.C(i, 18.5f, 9.0f, 17.41f, 6.59f);
        i.moveTo(21.28f, 12.72f);
        i.lineTo(20.5f, 11.0f);
        i.lineToRelative(-0.78f, 1.72f);
        i.lineTo(18.0f, 13.5f);
        i.lineToRelative(1.72f, 0.78f);
        i.lineTo(20.5f, 16.0f);
        i.lineToRelative(0.78f, -1.72f);
        r6.C(i, 23.0f, 13.5f, 21.28f, 12.72f);
        i.moveTo(16.24f, 14.37f);
        i.lineToRelative(1.94f, 1.47f);
        i.lineToRelative(-2.5f, 4.33f);
        i.lineToRelative(-2.24f, -0.94f);
        i.curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f);
        i.lineTo(12.5f, 22.0f);
        i.horizontalLineToRelative(-5.0f);
        i.lineToRelative(-0.3f, -2.41f);
        i.curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f);
        i.lineToRelative(-2.24f, 0.94f);
        i.lineToRelative(-2.5f, -4.33f);
        i.lineToRelative(1.94f, -1.47f);
        i.curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14.0f);
        i.reflectiveCurveToRelative(0.0f, -0.25f, 0.01f, -0.37f);
        i.lineToRelative(-1.94f, -1.47f);
        i.lineToRelative(2.5f, -4.33f);
        i.lineToRelative(2.24f, 0.94f);
        i.curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f);
        i.lineTo(7.5f, 6.0f);
        i.horizontalLineToRelative(5.0f);
        i.lineToRelative(0.3f, 2.41f);
        i.curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f);
        i.lineToRelative(2.24f, -0.94f);
        i.lineToRelative(2.5f, 4.33f);
        i.lineToRelative(-1.94f, 1.47f);
        i.curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f);
        i.reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f);
        i.close();
        i.moveTo(13.0f, 14.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 13.0f, 15.66f, 13.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSuggest = build;
        build.getClass();
        return build;
    }
}
