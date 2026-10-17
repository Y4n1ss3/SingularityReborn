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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpcomingKt {
    private static ImageVector _upcoming;

    public static final ImageVector getUpcoming(Icons.Outlined outlined) {
        ImageVector imageVector = _upcoming;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Upcoming", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.6f, 10.81f, 16.19f, 9.4f);
        i.lineToRelative(3.56f, -3.55f);
        i.lineToRelative(1.41f, 1.41f);
        i.curveTo(21.05f, 7.29f, 17.6f, 10.81f, 17.6f, 10.81f);
        r6.B(i, 13.0f, 3.0f, -2.0f, 5.0f);
        uo.r(i, 2.0f, 3.0f, 6.4f, 10.81f);
        i.lineTo(7.81f, 9.4f);
        i.lineTo(4.26f, 5.84f);
        i.lineTo(2.84f, 7.26f);
        i.curveTo(2.95f, 7.29f, 6.4f, 10.81f, 6.4f, 10.81f);
        af0.l(i, 20.0f, 14.0f, -3.42f);
        i.curveToRelative(-0.77f, 1.76f, -2.54f, 3.0f, -4.58f, 3.0f);
        i.reflectiveCurveToRelative(-3.81f, -1.24f, -4.58f, -3.0f);
        af0.g(i, 4.0f, 5.0f, 16.0f, 14.0f);
        i.moveTo(20.0f, 12.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        i.verticalLineToRelative(5.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.horizontalLineTo(4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.verticalLineToRelative(-5.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.horizontalLineToRelative(5.0f);
        i.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        i.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _upcoming = build;
        build.getClass();
        return build;
    }
}
