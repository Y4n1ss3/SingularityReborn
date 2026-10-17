package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CalendarViewDayKt {
    private static ImageVector _calendarViewDay;

    public static final ImageVector getCalendarViewDay(Icons.TwoTone twoTone) {
        ImageVector imageVector = _calendarViewDay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CalendarViewDay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(3.0f, 17.0f, 18.0f, 2.0f);
        uo.l(b, 3.0f, 19.0f, 19.0f, 12.0f);
        bv.q(b, 1.0f, 5.0f, 13.0f, -1.0f);
        b.horizontalLineToRelative(14.0f);
        b.moveToRelative(2.0f, -2.0f);
        af0.m(b, 3.0f, 10.0f, 5.0f, 18.0f);
        bv.m(b, -5.0f, 3.0f, 6.0f, 18.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, 2.0f, 3.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.f(5.0f, 12.0f, 14.0f, 1.0f, 5.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _calendarViewDay = build;
        build.getClass();
        return build;
    }
}
