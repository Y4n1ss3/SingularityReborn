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
import defpackage.af0;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditCalendarKt {
    private static ImageVector _editCalendar;

    public static final ImageVector getEditCalendar(Icons.Filled filled) {
        ImageVector imageVector = _editCalendar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EditCalendar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(12.0f, 22.0f, 5.0f);
        d.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.lineTo(3.01f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, 0.88f, -2.0f, 1.99f, -2.0f);
        af0.q(d, 1.0f, 2.0f, 2.0f, 2.0f);
        af0.q(d, 8.0f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(1.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        uf.s(d, 6.0f, -2.0f, -2.0f, 5.0f);
        k4.p(d, 10.0f, 7.0f, 22.0f);
        d.moveTo(22.13f, 16.99f);
        d.lineToRelative(0.71f, -0.71f);
        d.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        d.lineToRelative(-0.71f, -0.71f);
        d.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        gy.B(d, -0.71f, 0.71f, 22.13f, 16.99f);
        d.moveTo(21.42f, 17.7f);
        j50.x(d, -5.3f, 5.3f, 14.0f, -2.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 5.3f, -5.3f, 21.42f, 17.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editCalendar = build;
        build.getClass();
        return build;
    }
}
