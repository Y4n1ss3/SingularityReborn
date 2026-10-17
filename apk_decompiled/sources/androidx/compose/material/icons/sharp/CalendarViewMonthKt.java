package androidx.compose.material.icons.sharp;

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
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CalendarViewMonthKt {
    private static ImageVector _calendarViewMonth;

    public static final ImageVector getCalendarViewMonth(Icons.Sharp sharp) {
        ImageVector imageVector = _calendarViewMonth;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CalendarViewMonth", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(22.0f, 4.0f, 2.0f, 16.0f, 20.0f);
        k4.B(i, 4.0f, 8.0f, 11.0f, 4.0f);
        c21.c(i, 6.0f, 4.0f, 11.0f);
        j50.y(i, 14.0f, 11.0f, -4.0f, 6.0f);
        uo.r(i, 4.0f, 11.0f, 20.0f, 11.0f);
        j50.D(i, -4.0f, 6.0f, 4.0f, 11.0f);
        k4.A(i, 8.0f, 18.0f, 4.0f, -5.0f);
        uo.r(i, 4.0f, 18.0f, 14.0f, 18.0f);
        bv.l(i, -4.0f, -5.0f, 4.0f, 18.0f);
        k4.C(i, 20.0f, 18.0f, -4.0f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 4.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _calendarViewMonth = build;
        build.getClass();
        return build;
    }
}
