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
public final class DonutSmallKt {
    private static ImageVector _donutSmall;

    public static final ImageVector getDonutSmall(Icons.Filled filled) {
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DonutSmall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(11.0f, 9.16f, 2.0f);
        d.curveToRelative(-5.0f, 0.5f, -9.0f, 4.79f, -9.0f, 10.0f);
        d.reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f);
        d.verticalLineToRelative(-7.16f);
        d.curveToRelative(-1.0f, -0.41f, -2.0f, -1.52f, -2.0f, -2.84f);
        d.reflectiveCurveToRelative(1.0f, -2.43f, 2.0f, -2.84f);
        r6.g(d, 14.86f, 11.0f, 22.0f);
        d.curveToRelative(-0.48f, -4.75f, -4.0f, -8.53f, -9.0f, -9.0f);
        d.verticalLineToRelative(7.16f);
        d.curveToRelative(1.0f, 0.3f, 1.52f, 0.98f, 1.86f, 1.84f);
        bv.g(d, 13.0f, 14.84f, 22.0f);
        d.curveToRelative(5.0f, -0.47f, 8.52f, -4.25f, 9.0f, -9.0f);
        d.horizontalLineToRelative(-7.14f);
        d.curveToRelative(-0.34f, 0.86f, -0.86f, 1.54f, -1.86f, 1.84f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = build;
        build.getClass();
        return build;
    }
}
