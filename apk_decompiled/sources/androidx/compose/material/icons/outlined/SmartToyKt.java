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
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmartToyKt {
    private static ImageVector _smartToy;

    public static final ImageVector getSmartToy(Icons.Outlined outlined) {
        ImageVector imageVector = _smartToy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SmartToy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 9.0f, 7.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineToRelative(-3.0f);
        d.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        d.reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f);
        d.horizontalLineTo(6.0f);
        d.curveTo(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        d.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        d.verticalLineToRelative(4.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-4.0f);
        d.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        d.reflectiveCurveTo(21.66f, 9.0f, 20.0f, 9.0f);
        k4.r(d, 18.0f, 19.0f, 6.0f, 19.0f);
        c21.c(d, 7.0f, 12.0f, 19.0f);
        d.moveTo(9.0f, 13.0f);
        d.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        d.reflectiveCurveTo(8.17f, 10.0f, 9.0f, 10.0f);
        d.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        d.reflectiveCurveTo(9.83f, 13.0f, 9.0f, 13.0f);
        d.close();
        d.moveTo(16.5f, 11.5f);
        d.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        d.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        d.reflectiveCurveTo(14.17f, 10.0f, 15.0f, 10.0f);
        d.reflectiveCurveTo(16.5f, 10.67f, 16.5f, 11.5f);
        r6.B(d, 8.0f, 15.0f, 8.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(d, 8.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartToy = build;
        build.getClass();
        return build;
    }
}
