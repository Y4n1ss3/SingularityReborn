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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditCalendarKt {
    private static ImageVector _editCalendar;

    public static final ImageVector getEditCalendar(Icons.Outlined outlined) {
        ImageVector imageVector = _editCalendar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditCalendar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(5.0f, 10.0f, 14.0f, 2.0f, 2.0f);
        n.verticalLineTo(6.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.q(n, -1.0f, 2.0f, -2.0f, 2.0f);
        gy.x(n, 8.0f, 2.0f, 6.0f, 2.0f);
        n.horizontalLineTo(5.0f);
        n.curveTo(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        n.lineTo(3.0f, 20.0f);
        n.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        gy.t(n, 7.0f, -2.0f, 5.0f, 10.0f);
        k4.C(n, 5.0f, 6.0f, 14.0f, 2.0f);
        bv.s(n, 5.0f, 6.0f, 22.84f, 16.28f);
        n.lineToRelative(-0.71f, 0.71f);
        n.lineToRelative(-2.12f, -2.12f);
        n.lineToRelative(0.71f, -0.71f);
        n.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        n.lineToRelative(0.71f, 0.71f);
        n.curveTo(23.23f, 15.26f, 23.23f, 15.89f, 22.84f, 16.28f);
        k4.x(n, 19.3f, 15.58f, 2.12f, 2.12f);
        j50.x(n, -5.3f, 5.3f, 14.0f, -2.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 19.3f, 15.58f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editCalendar = build;
        build.getClass();
        return build;
    }
}
