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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventSeatKt {
    private static ImageVector _eventSeat;

    public static final ImageVector getEventSeat(Icons.Outlined outlined) {
        ImageVector imageVector = _eventSeat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EventSeat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(15.0f, 5.0f, 7.0f, 9.0f, 12.0f);
        y.lineTo(9.0f, 5.0f);
        y.horizontalLineToRelative(6.0f);
        y.moveToRelative(0.0f, -2.0f);
        y.lineTo(9.0f, 3.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.B(y, 9.0f, 10.0f, 17.0f, 5.0f);
        y.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(y, 22.0f, 10.0f, -3.0f, 3.0f);
        fc.x(y, 3.0f, -3.0f, 5.0f, 10.0f);
        af0.m(y, 2.0f, 10.0f, 3.0f, 3.0f);
        r6.l(y, -3.0f, 20.0f, 15.0f);
        af0.m(y, 4.0f, 15.0f, 6.0f, 2.0f);
        r6.D(y, -4.0f, 12.0f, 4.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(y, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventSeat = build;
        build.getClass();
        return build;
    }
}
