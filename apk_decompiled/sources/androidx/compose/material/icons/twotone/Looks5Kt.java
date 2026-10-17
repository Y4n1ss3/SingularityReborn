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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Looks5Kt {
    private static ImageVector _looks5;

    public static final ImageVector getLooks5(Icons.TwoTone twoTone) {
        ImageVector imageVector = _looks5;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Looks5", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(19.0f, 5.0f, 5.0f, 5.0f, 14.0f);
        gy.n(s, 14.0f, 19.0f, 5.0f);
        k4.C(s, 15.0f, 9.0f, -4.0f, 2.0f);
        s.horizontalLineToRelative(2.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        s.verticalLineToRelative(2.0f);
        s.curveToRelative(0.0f, 1.11f, -0.9f, 2.0f, -2.0f, 2.0f);
        af0.m(s, 9.0f, 17.0f, -2.0f, 4.0f);
        s.verticalLineToRelative(-2.0f);
        s.lineTo(9.0f, 13.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(s, 9.0f, 7.0f, 6.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(5.0f, 21.0f, 14.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.lineTo(21.0f, 5.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.lineTo(5.0f, 3.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(14.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        r6.B(a, 5.0f, 5.0f, 14.0f, 14.0f);
        r6.C(a, 5.0f, 19.0f, 5.0f, 5.0f);
        k4.C(a, 9.0f, 13.0f, 4.0f, 2.0f);
        af0.m(a, 9.0f, 15.0f, 2.0f, 4.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        a.verticalLineToRelative(-2.0f);
        a.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.n(a, -2.0f, 11.0f, 9.0f, 4.0f);
        a.lineTo(15.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(a, 9.0f, 7.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _looks5 = build;
        build.getClass();
        return build;
    }
}
