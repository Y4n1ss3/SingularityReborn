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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermContactCalendarKt {
    private static ImageVector _permContactCalendar;

    public static final ImageVector getPermContactCalendar(Icons.Rounded rounded) {
        ImageVector imageVector = _permContactCalendar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PermContactCalendar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(19.0f, 3.0f, -1.0f, 18.0f, 2.0f);
        p.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        p.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        p.verticalLineToRelative(1.0f);
        p.lineTo(8.0f, 3.0f);
        p.lineTo(8.0f, 2.0f);
        p.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        p.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        p.verticalLineToRelative(1.0f);
        p.lineTo(5.0f, 3.0f);
        p.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(14.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(14.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(21.0f, 5.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.close();
        p.moveTo(12.0f, 6.0f);
        p.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        p.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        p.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        p.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        k4.r(p, 18.0f, 18.0f, 6.0f, 18.0f);
        p.verticalLineToRelative(-1.0f);
        p.curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f);
        p.reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permContactCalendar = build;
        build.getClass();
        return build;
    }
}
