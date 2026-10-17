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
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _4gPlusMobiledataKt {
    private static ImageVector __4gPlusMobiledata;

    public static final ImageVector get_4gPlusMobiledata(Icons.Outlined outlined) {
        ImageVector imageVector = __4gPlusMobiledata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined._4gPlusMobiledata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(13.0f, 11.0f, 2.0f, 2.0f, 2.0f);
        af0.f(s, -4.0f, 9.0f, 6.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.horizontalLineToRelative(-4.0f);
        s.curveTo(9.9f, 7.0f, 9.0f, 7.9f, 9.0f, 9.0f);
        s.verticalLineToRelative(6.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(4.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kf0.n(s, -4.0f, 13.0f, 24.0f, 11.0f);
        af0.q(s, -2.0f, 9.0f, -2.0f, 2.0f);
        af0.v(s, -2.0f, 2.0f, 2.0f, 2.0f);
        bv.l(s, 2.0f, -2.0f, 2.0f, 11.0f);
        k4.A(s, 7.0f, 7.0f, 5.0f, 5.0f);
        gy.x(s, 3.0f, 7.0f, 1.0f, 7.0f);
        af0.v(s, 4.0f, 3.0f, 2.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(s, 1.0f, -2.0f, 7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4gPlusMobiledata = build;
        build.getClass();
        return build;
    }
}
