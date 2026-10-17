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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbShadeKt {
    private static ImageVector _wbShade;

    public static final ImageVector getWbShade(Icons.Rounded rounded) {
        ImageVector imageVector = _wbShade;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WbShade", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.0f, 14.13f, 14.0f, 14.13f);
        i.curveToRelative(0.0f, 0.23f, 0.09f, 0.46f, 0.26f, 0.63f);
        i.lineToRelative(4.98f, 4.98f);
        i.curveToRelative(0.17f, 0.17f, 0.39f, 0.26f, 0.62f, 0.26f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.79f, 0.0f, 1.18f, -0.95f, 0.62f, -1.51f);
        i.lineToRelative(-4.98f, -4.98f);
        i.curveTo(14.95f, 12.95f, 14.0f, 13.35f, 14.0f, 14.13f);
        af0.l(i, 15.0f, 20.0f, 2.0f);
        i.lineToRelative(-3.0f, -3.0f);
        i.verticalLineToRelative(2.0f);
        i.curveTo(14.0f, 19.55f, 14.45f, 20.0f, 15.0f, 20.0f);
        k4.r(i, 7.65f, 4.35f, 2.85f, 9.15f);
        i.curveTo(2.54f, 9.46f, 2.76f, 10.0f, 3.21f, 10.0f);
        i.horizontalLineTo(4.0f);
        i.verticalLineToRelative(9.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(6.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-9.0f);
        i.horizontalLineToRelative(0.79f);
        i.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        i.lineTo(8.35f, 4.35f);
        i.curveTo(8.16f, 4.16f, 7.84f, 4.16f, 7.65f, 4.35f);
        uo.q(i, 9.0f, 14.0f, 7.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbShade = build;
        build.getClass();
        return build;
    }
}
