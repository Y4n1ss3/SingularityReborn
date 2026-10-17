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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsInputAntennaKt {
    private static ImageVector _settingsInputAntenna;

    public static final ImageVector getSettingsInputAntenna(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsInputAntenna;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsInputAntenna", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 5.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        b.close();
        b.moveTo(13.0f, 14.29f);
        b.curveToRelative(0.88f, -0.39f, 1.5f, -1.26f, 1.5f, -2.29f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b.reflectiveCurveTo(9.5f, 10.62f, 9.5f, 12.0f);
        b.curveToRelative(0.0f, 1.02f, 0.62f, 1.9f, 1.5f, 2.29f);
        b.verticalLineToRelative(3.3f);
        b.lineTo(7.59f, 21.0f);
        b.lineTo(9.0f, 22.41f);
        b.lineToRelative(3.0f, -3.0f);
        b.lineToRelative(3.0f, 3.0f);
        b.lineTo(16.41f, 21.0f);
        bv.r(b, 13.0f, 17.59f, -3.3f);
        b.moveTo(12.0f, 1.0f);
        b.curveTo(5.93f, 1.0f, 1.0f, 5.93f, 1.0f, 12.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f);
        b.reflectiveCurveToRelative(9.0f, 4.03f, 9.0f, 9.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -6.07f, -4.93f, -11.0f, -11.0f, -11.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputAntenna = build;
        build.getClass();
        return build;
    }
}
