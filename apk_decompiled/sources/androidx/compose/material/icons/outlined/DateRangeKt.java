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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangeKt {
    private static ImageVector _dateRange;

    public static final ImageVector getDateRange(Icons.Outlined outlined) {
        ImageVector imageVector = _dateRange;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DateRange", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 11.0f, 2.0f, 2.0f);
        bv.r(b, 7.0f, 13.0f, -2.0f);
        b.moveTo(21.0f, 6.0f);
        b.verticalLineToRelative(14.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.lineTo(5.0f, 22.0f);
        b.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.lineToRelative(0.01f, -14.0f);
        b.curveToRelative(0.0f, -1.1f, 0.88f, -2.0f, 1.99f, -2.0f);
        uo.n(b, 1.0f, 6.0f, 2.0f, 2.0f);
        uo.B(b, 2.0f, 8.0f, 16.0f, 2.0f);
        kf0.x(b, 2.0f, 2.0f, 1.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        af0.l(b, 5.0f, 8.0f, 14.0f);
        b.lineTo(19.0f, 6.0f);
        bv.r(b, 5.0f, 6.0f, 2.0f);
        b.moveTo(19.0f, 20.0f);
        b.lineTo(19.0f, 10.0f);
        kp0.x(b, 5.0f, 10.0f, 10.0f, 14.0f);
        k4.C(b, 15.0f, 13.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 11.0f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(b, 2.0f, -2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dateRange = build;
        build.getClass();
        return build;
    }
}
