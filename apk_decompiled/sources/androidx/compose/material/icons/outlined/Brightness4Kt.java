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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness4Kt {
    private static ImageVector _brightness4;

    public static final ImageVector getBrightness4(Icons.Outlined outlined) {
        ImageVector imageVector = _brightness4;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Brightness4", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k.moveTo(18.0f, 14.48f);
        k.lineTo(18.0f, 18.0f);
        k.horizontalLineToRelative(-3.52f);
        k.lineTo(12.0f, 20.48f);
        k.lineTo(9.52f, 18.0f);
        k.lineTo(6.0f, 18.0f);
        k.verticalLineToRelative(-3.52f);
        k.lineTo(3.52f, 12.0f);
        k.lineTo(6.0f, 9.52f);
        k.lineTo(6.0f, 6.0f);
        k.horizontalLineToRelative(3.52f);
        k.lineTo(12.0f, 3.52f);
        k.lineTo(14.48f, 6.0f);
        k.lineTo(18.0f, 6.0f);
        k.verticalLineToRelative(3.52f);
        r6.C(k, 20.48f, 12.0f, 18.0f, 14.48f);
        k.moveTo(12.29f, 7.0f);
        k.curveToRelative(-0.74f, 0.0f, -1.45f, 0.17f, -2.08f, 0.46f);
        k.curveToRelative(1.72f, 0.79f, 2.92f, 2.53f, 2.92f, 4.54f);
        k.reflectiveCurveToRelative(-1.2f, 3.75f, -2.92f, 4.54f);
        k.curveToRelative(0.63f, 0.29f, 1.34f, 0.46f, 2.08f, 0.46f);
        k.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(k, -2.24f, -5.0f, -5.0f, -5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness4 = build;
        build.getClass();
        return build;
    }
}
