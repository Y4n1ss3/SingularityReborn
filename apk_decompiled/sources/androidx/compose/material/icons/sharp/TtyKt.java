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
import defpackage.af0;
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TtyKt {
    private static ImageVector _tty;

    public static final ImageVector getTty(Icons.Sharp sharp) {
        ImageVector imageVector = _tty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Tty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(20.0f, 15.0f, 6.0f);
        h.curveToRelative(-3.28f, 0.0f, -6.35f, -0.89f, -9.0f, -2.43f);
        h.curveTo(8.27f, 16.99f, 6.01f, 14.73f, 4.43f, 12.0f);
        h.curveTo(2.89f, 9.35f, 2.0f, 6.28f, 2.0f, 3.0f);
        h.horizontalLineToRelative(6.0f);
        h.lineToRelative(1.0f, 5.0f);
        h.lineToRelative(-2.9f, 2.9f);
        h.curveToRelative(1.43f, 2.5f, 3.5f, 4.57f, 6.0f, 6.0f);
        r6.C(h, 15.0f, 14.0f, 20.0f, 15.0f);
        j50.y(h, 14.0f, 6.0f, 2.0f, 4.0f);
        uo.r(h, -2.0f, 6.0f, 13.0f, 9.0f);
        j50.D(h, 2.0f, 7.0f, -2.0f, 9.0f);
        j50.y(h, 11.0f, 6.0f, 2.0f, 4.0f);
        uo.r(h, -2.0f, 6.0f, 18.0f, 7.0f);
        bv.l(h, -2.0f, 2.0f, 2.0f, 7.0f);
        k4.C(h, 19.0f, 4.0f, -2.0f, 2.0f);
        uo.r(h, 2.0f, 4.0f, 21.0f, 7.0f);
        bv.l(h, -2.0f, 2.0f, 2.0f, 7.0f);
        k4.C(h, 22.0f, 4.0f, -2.0f, 2.0f);
        uo.r(h, 2.0f, 4.0f, 14.0f, 12.0f);
        bv.l(h, 2.0f, -2.0f, -2.0f, 12.0f);
        k4.C(h, 11.0f, 12.0f, 2.0f, -2.0f);
        uo.r(h, -2.0f, 12.0f, 19.0f, 10.0f);
        bv.l(h, -2.0f, 2.0f, 2.0f, 10.0f);
        k4.C(h, 22.0f, 10.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(h, 2.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tty = build;
        build.getClass();
        return build;
    }
}
