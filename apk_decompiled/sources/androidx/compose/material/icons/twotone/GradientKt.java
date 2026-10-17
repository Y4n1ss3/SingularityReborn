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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GradientKt {
    private static ImageVector _gradient;

    public static final ImageVector getGradient(Icons.TwoTone twoTone) {
        ImageVector imageVector = _gradient;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Gradient", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(13.0f, 11.0f, 2.0f, 2.0f, -2.0f);
        q.moveTo(19.0f, 21.0f);
        q.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q.lineTo(21.0f, 5.0f);
        q.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q.lineTo(5.0f, 3.0f);
        q.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q.verticalLineToRelative(14.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        j50.t(q, 14.0f, 9.0f, 18.0f);
        af0.m(q, 7.0f, 18.0f, -2.0f, 2.0f);
        bv.m(q, 2.0f, 13.0f, 18.0f, -2.0f);
        r6.p(q, -2.0f, 2.0f, 2.0f);
        k4.C(q, 17.0f, 18.0f, -2.0f, -2.0f);
        fc.x(q, 2.0f, 2.0f, 5.0f, 13.0f);
        bv.C(q, 2.0f, -2.0f, 5.0f, 11.0f);
        fc.w(q, 5.0f, 5.0f, 14.0f, 6.0f);
        af0.v(q, -2.0f, 2.0f, 2.0f, 2.0f);
        af0.v(q, -2.0f, -2.0f, -2.0f, 2.0f);
        af0.v(q, -2.0f, -2.0f, -2.0f, 2.0f);
        q.lineTo(9.0f, 15.0f);
        bv.q(q, -2.0f, 7.0f, 13.0f, 2.0f);
        bv.r(q, 5.0f, 15.0f, -2.0f);
        k4.C(q, 7.0f, 9.0f, 2.0f, 2.0f);
        uo.l(q, 7.0f, 11.0f, 15.0f, 9.0f);
        j50.n(q, 2.0f, 2.0f, -2.0f);
        k4.C(q, 11.0f, 9.0f, 2.0f, 2.0f);
        kp0.A(q, -2.0f, 9.0f, 11.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(q, 2.0f, 9.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gradient = build;
        build.getClass();
        return build;
    }
}
