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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsInputSvideoKt {
    private static ImageVector _settingsInputSvideo;

    public static final ImageVector getSettingsInputSvideo(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsInputSvideo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsInputSvideo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 11.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(5.0f, 10.67f, 5.0f, 11.5f);
        b.reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f);
        b.reflectiveCurveTo(8.0f, 12.33f, 8.0f, 11.5f);
        b.close();
        b.moveTo(15.0f, 6.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.horizontalLineToRelative(-3.0f);
        b.curveTo(9.67f, 5.0f, 9.0f, 5.67f, 9.0f, 6.5f);
        b.reflectiveCurveTo(9.67f, 8.0f, 10.5f, 8.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.close();
        b.moveTo(8.5f, 15.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveTo(7.67f, 18.0f, 8.5f, 18.0f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveTo(9.33f, 15.0f, 8.5f, 15.0f);
        b.close();
        b.moveTo(12.0f, 1.0f);
        b.curveTo(5.93f, 1.0f, 1.0f, 5.93f, 1.0f, 12.0f);
        b.reflectiveCurveToRelative(4.93f, 11.0f, 11.0f, 11.0f);
        b.reflectiveCurveToRelative(11.0f, -4.93f, 11.0f, -11.0f);
        b.reflectiveCurveTo(18.07f, 1.0f, 12.0f, 1.0f);
        b.close();
        b.moveTo(12.0f, 21.0f);
        b.curveToRelative(-4.96f, 0.0f, -9.0f, -4.04f, -9.0f, -9.0f);
        b.reflectiveCurveToRelative(4.04f, -9.0f, 9.0f, -9.0f);
        b.reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f);
        b.reflectiveCurveToRelative(-4.04f, 9.0f, -9.0f, 9.0f);
        b.close();
        b.moveTo(17.5f, 10.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        b.close();
        b.moveTo(15.5f, 15.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.67f, -1.5f, -1.5f, -1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputSvideo = build;
        build.getClass();
        return build;
    }
}
