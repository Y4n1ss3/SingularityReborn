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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeselectKt {
    private static ImageVector _deselect;

    public static final ImageVector getDeselect(Icons.Filled filled) {
        ImageVector imageVector = _deselect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Deselect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(3.0f, 13.0f, 2.0f, -2.0f, 3.0f);
        k4.D(d, 13.0f, 7.0f, 21.0f, 2.0f);
        gy.s(d, -2.0f, 7.0f, 21.0f);
        k4.C(d, 13.0f, 3.0f, -2.0f, 2.0f);
        uo.r(d, 2.0f, 3.0f, 19.0f, 3.0f);
        d.verticalLineToRelative(2.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        af0.A(d, 5.0f, 21.0f, -2.0f, 3.0f);
        d.curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f);
        r6.B(d, 3.0f, 17.0f, 2.0f, -2.0f);
        bv.s(d, 3.0f, 17.0f, 11.0f, 21.0f);
        bv.l(d, 2.0f, -2.0f, -2.0f, 21.0f);
        k4.C(d, 19.0f, 13.0f, 2.0f, -2.0f);
        uo.r(d, -2.0f, 13.0f, 19.0f, 9.0f);
        j50.D(d, 2.0f, 7.0f, -2.0f, 9.0f);
        j50.y(d, 15.0f, 5.0f, 2.0f, 3.0f);
        uo.r(d, -2.0f, 5.0f, 7.83f, 5.0f);
        fc.t(d, 7.0f, 4.17f, 3.0f, 2.0f);
        kf0.n(d, 2.0f, 7.83f, 19.83f, 17.0f);
        fc.t(d, 19.0f, 16.17f, 15.0f, 2.0f);
        kf0.n(d, 2.0f, 19.83f, 21.19f, 21.19f);
        d.lineTo(2.81f, 2.81f);
        d.lineTo(1.39f, 4.22f);
        r6.w(d, 4.17f, 7.0f, 3.0f, 2.0f);
        bv.w(d, 2.0f, 7.83f, 2.0f, 2.0f);
        uo.u(d, 17.0f, 7.17f, 2.0f, 2.0f);
        uf.k(d, 15.0f, 2.0f, 2.0f, -1.17f);
        gy.B(d, 2.78f, 2.78f, 21.19f, 21.19f);
        d.moveTo(9.0f, 15.0f);
        d.verticalLineToRelative(-3.17f);
        d.lineTo(12.17f, 15.0f);
        d.horizontalLineTo(9.0f);
        d.close();
        kp0.t(d, 15.0f, 12.17f, 9.0f, -3.17f);
        j50.x(d, -2.0f, -2.0f, 17.0f, 7.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 15.0f, 12.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deselect = build;
        build.getClass();
        return build;
    }
}
