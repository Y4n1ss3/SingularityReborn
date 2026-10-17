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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrightnessHighKt {
    private static ImageVector _brightnessHigh;

    public static final ImageVector getBrightnessHigh(Icons.Sharp sharp) {
        ImageVector imageVector = _brightnessHigh;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BrightnessHigh", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(20.0f, 8.69f, 20.0f, 4.0f, -4.69f);
        k.lineTo(12.0f, 0.69f);
        k.lineTo(8.69f, 4.0f);
        k.lineTo(4.0f, 4.0f);
        k.verticalLineToRelative(4.69f);
        k.lineTo(0.69f, 12.0f);
        k.lineTo(4.0f, 15.31f);
        k.lineTo(4.0f, 20.0f);
        k.horizontalLineToRelative(4.69f);
        k.lineTo(12.0f, 23.31f);
        k.lineTo(15.31f, 20.0f);
        k.lineTo(20.0f, 20.0f);
        k.verticalLineToRelative(-4.69f);
        r6.C(k, 23.31f, 12.0f, 20.0f, 8.69f);
        k.moveTo(12.0f, 18.0f);
        k.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        k.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        k.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        k.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        k.close();
        k.moveTo(12.0f, 8.0f);
        k.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        k.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        k.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(k, -1.79f, -4.0f, -4.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightnessHigh = build;
        build.getClass();
        return build;
    }
}
