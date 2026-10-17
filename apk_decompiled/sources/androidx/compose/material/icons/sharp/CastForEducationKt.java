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
import defpackage.bv;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastForEducationKt {
    private static ImageVector _castForEducation;

    public static final ImageVector getCastForEducation(Icons.Sharp sharp) {
        ImageVector imageVector = _castForEducation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CastForEducation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(23.0f, 3.0f, 1.0f, 3.0f, 5.0f);
        uo.n(s, 2.0f, 3.0f, 5.0f, 18.0f);
        r6.D(s, 14.0f, -7.0f, 2.0f, 9.0f);
        uo.l(s, 23.0f, 3.0f, 1.0f, 18.0f);
        s.verticalLineToRelative(3.0f);
        s.horizontalLineToRelative(3.0f);
        s.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        bv.v(s, 1.0f, 14.0f, 2.0f);
        s.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        s.horizontalLineToRelative(2.0f);
        s.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        bv.v(s, 1.0f, 10.0f, 2.0f);
        s.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        s.horizontalLineToRelative(2.0f);
        s.curveToRelative(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
        bv.v(s, 11.0f, 11.09f, 2.0f);
        s.lineTo(14.5f, 15.0f);
        s.lineToRelative(3.5f, -1.91f);
        s.verticalLineToRelative(-2.0f);
        r6.C(s, 14.5f, 13.0f, 11.0f, 11.09f);
        s.moveTo(14.5f, 6.0f);
        s.lineTo(9.0f, 9.0f);
        s.lineToRelative(5.5f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(s, 20.0f, 9.0f, -5.5f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castForEducation = build;
        build.getClass();
        return build;
    }
}
