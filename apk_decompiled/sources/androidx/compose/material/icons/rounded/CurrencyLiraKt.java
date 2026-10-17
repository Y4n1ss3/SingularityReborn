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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyLiraKt {
    private static ImageVector _currencyLira;

    public static final ImageVector getCurrencyLira(Icons.Rounded rounded) {
        ImageVector imageVector = _currencyLira;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyLira", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.0f, 15.84f, -1.47f, 0.92f);
        e.curveTo(6.86f, 17.18f, 6.0f, 16.7f, 6.0f, 15.91f);
        e.curveToRelative(0.0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f);
        e.lineTo(9.0f, 13.48f);
        e.verticalLineToRelative(-2.36f);
        e.lineToRelative(-1.47f, 0.92f);
        e.curveTo(6.86f, 12.46f, 6.0f, 11.98f, 6.0f, 11.19f);
        e.curveToRelative(0.0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f);
        e.lineTo(9.0f, 8.76f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(3.51f);
        e.lineToRelative(2.47f, -1.55f);
        e.curveTo(14.14f, 5.54f, 15.0f, 6.02f, 15.0f, 6.81f);
        e.curveToRelative(0.0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f);
        e.lineTo(11.0f, 9.87f);
        e.lineToRelative(0.01f, 2.35f);
        e.lineToRelative(2.46f, -1.54f);
        e.curveToRelative(0.67f, -0.42f, 1.53f, 0.06f, 1.53f, 0.85f);
        e.curveToRelative(0.0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f);
        e.lineTo(11.0f, 14.59f);
        e.verticalLineTo(19.0f);
        e.curveToRelative(2.47f, 0.0f, 4.52f, -1.79f, 4.93f, -4.15f);
        e.curveToRelative(0.08f, -0.49f, 0.49f, -0.85f, 0.98f, -0.85f);
        e.curveToRelative(0.61f, 0.0f, 1.09f, 0.54f, 1.0f, 1.14f);
        e.curveTo(17.37f, 18.46f, 14.48f, 21.0f, 11.0f, 21.0f);
        e.horizontalLineToRelative(-1.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(e, 15.84f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyLira = build;
        build.getClass();
        return build;
    }
}
