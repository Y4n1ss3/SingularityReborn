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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CenterFocusWeakKt {
    private static ImageVector _centerFocusWeak;

    public static final ImageVector getCenterFocusWeak(Icons.Sharp sharp) {
        ImageVector imageVector = _centerFocusWeak;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CenterFocusWeak", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(5.0f, 15.0f, 3.0f, 15.0f, 6.0f);
        bv.C(s, 6.0f, -2.0f, 5.0f, 19.0f);
        bv.m(s, -4.0f, 5.0f, 5.0f, 4.0f);
        s.lineTo(9.0f, 3.0f);
        af0.m(s, 3.0f, 3.0f, 6.0f, 2.0f);
        uo.l(s, 5.0f, 5.0f, 21.0f, 3.0f);
        af0.v(s, -6.0f, 2.0f, 4.0f, 4.0f);
        gy.n(s, 2.0f, 21.0f, 3.0f);
        k4.C(s, 19.0f, 19.0f, -4.0f, 2.0f);
        gy.D(s, 6.0f, -6.0f, -2.0f, 4.0f);
        s.moveTo(12.0f, 8.0f);
        s.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        s.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        s.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        s.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        s.close();
        s.moveTo(12.0f, 14.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        s.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        s.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(s, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _centerFocusWeak = build;
        build.getClass();
        return build;
    }
}
