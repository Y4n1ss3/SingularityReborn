package androidx.compose.material.icons.filled;

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
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Filled filled) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DonutLarge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(11.0f, 5.08f, 2.0f);
        d.curveTo(6.0f, 2.5f, 2.0f, 6.81f, 2.0f, 12.0f);
        d.reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f);
        d.verticalLineToRelative(-3.08f);
        d.curveToRelative(-3.0f, -0.48f, -6.0f, -3.4f, -6.0f, -6.92f);
        d.reflectiveCurveTo(8.0f, 5.56f, 11.0f, 5.08f);
        r6.g(d, 18.97f, 11.0f, 22.0f);
        d.curveToRelative(-0.47f, -5.0f, -4.0f, -8.53f, -9.0f, -9.0f);
        d.verticalLineToRelative(3.08f);
        d.curveTo(16.0f, 5.51f, 18.54f, 8.0f, 18.97f, 11.0f);
        bv.g(d, 13.0f, 18.92f, 22.0f);
        d.curveToRelative(5.0f, -0.47f, 8.53f, -4.0f, 9.0f, -9.0f);
        d.horizontalLineToRelative(-3.03f);
        d.curveTo(18.54f, 16.0f, 16.0f, 18.49f, 13.0f, 18.92f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = build;
        build.getClass();
        return build;
    }
}
