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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestaurantKt {
    private static ImageVector _restaurant;

    public static final ImageVector getRestaurant(Icons.Rounded rounded) {
        ImageVector imageVector = _restaurant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Restaurant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(16.0f, 6.0f, 6.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(1.0f);
        h.verticalLineToRelative(7.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        h.lineTo(21.0f, 3.13f);
        h.curveToRelative(0.0f, -0.65f, -0.61f, -1.13f, -1.24f, -0.98f);
        h.curveTo(17.6f, 2.68f, 16.0f, 4.51f, 16.0f, 6.0f);
        k4.r(h, 11.0f, 9.0f, 9.0f, 9.0f);
        h.lineTo(9.0f, 3.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(6.0f);
        h.lineTo(5.0f, 9.0f);
        h.lineTo(5.0f, 3.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(6.0f);
        h.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        h.verticalLineToRelative(8.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        h.verticalLineToRelative(-8.0f);
        h.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        h.lineTo(13.0f, 3.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(h, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restaurant = build;
        build.getClass();
        return build;
    }
}
