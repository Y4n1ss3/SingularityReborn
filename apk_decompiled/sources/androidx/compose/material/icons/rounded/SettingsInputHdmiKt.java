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
import defpackage.fc;
import defpackage.j50;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsInputHdmiKt {
    private static ImageVector _settingsInputHdmi;

    public static final ImageVector getSettingsInputHdmi(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsInputHdmi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsInputHdmi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 7.0f, 4.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(8.0f);
        d.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        d.verticalLineToRelative(3.0f);
        d.curveTo(5.45f, 7.0f, 5.0f, 7.45f, 5.0f, 8.0f);
        d.verticalLineToRelative(4.7f);
        d.curveToRelative(0.0f, 0.2f, 0.06f, 0.39f, 0.17f, 0.55f);
        d.lineTo(8.0f, 19.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(6.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(-2.0f);
        d.lineToRelative(2.83f, -5.75f);
        d.curveTo(18.94f, 13.09f, 19.0f, 12.89f, 19.0f, 12.7f);
        d.verticalLineTo(8.0f);
        d.curveTo(19.0f, 7.45f, 18.55f, 7.0f, 18.0f, 7.0f);
        af0.r(d, 16.0f, 7.0f, -2.0f, 5.5f);
        d.curveTo(14.0f, 5.22f, 13.78f, 5.0f, 13.5f, 5.0f);
        d.reflectiveCurveTo(13.0f, 5.22f, 13.0f, 5.5f);
        uf.z(d, 7.0f, -2.0f, 5.5f);
        d.curveTo(11.0f, 5.22f, 10.78f, 5.0f, 10.5f, 5.0f);
        d.reflectiveCurveTo(10.0f, 5.22f, 10.0f, 5.5f);
        uo.m(d, 7.0f, 8.0f, 4.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputHdmi = build;
        build.getClass();
        return build;
    }
}
