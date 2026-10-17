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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.Rounded rounded) {
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fastfood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(21.9f, 5.0f, 18.0f, 2.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        c.verticalLineToRelative(3.0f);
        c.horizontalLineToRelative(-3.9f);
        c.curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f);
        c.lineToRelative(0.12f, 1.21f);
        c.curveTo(14.9f, 8.16f, 18.0f, 10.77f, 18.0f, 15.0f);
        c.lineToRelative(0.02f, 8.0f);
        c.horizontalLineToRelative(1.7f);
        c.curveToRelative(0.84f, 0.0f, 1.53f, -0.65f, 1.63f, -1.47f);
        c.lineTo(22.89f, 6.1f);
        c.curveToRelative(0.06f, -0.59f, -0.4f, -1.1f, -0.99f, -1.1f);
        r6.g(c, 15.0f, 21.0f, 2.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(13.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        af0.l(c, 2.1f, 15.0f, 12.8f);
        c.curveToRelative(0.62f, 0.0f, 1.11f, -0.56f, 0.99f, -1.16f);
        c.curveToRelative(-0.65f, -3.23f, -4.02f, -4.85f, -7.39f, -4.85f);
        c.reflectiveCurveToRelative(-6.73f, 1.62f, -7.39f, 4.85f);
        c.curveToRelative(-0.12f, 0.6f, 0.38f, 1.16f, 0.99f, 1.16f);
        r6.g(c, 15.0f, 17.0f, 2.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(13.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(c, -0.45f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = build;
        build.getClass();
        return build;
    }
}
