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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastForEducationKt {
    private static ImageVector _castForEducation;

    public static final ImageVector getCastForEducation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _castForEducation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CastForEducation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 3.0f, 3.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.B(i, 3.0f, 2.0f, 3.0f, 5.0f);
        af0.v(i, 18.0f, 14.0f, -7.0f, 2.0f);
        i.horizontalLineToRelative(7.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(23.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.C(i, 1.0f, 18.0f, 3.0f, 3.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        bv.v(i, 1.0f, 14.0f, 2.0f);
        i.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        bv.v(i, 1.0f, 10.0f, 2.0f);
        i.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
        bv.v(i, 11.0f, 11.09f, 2.0f);
        i.lineTo(14.5f, 15.0f);
        i.lineToRelative(3.5f, -1.91f);
        i.verticalLineToRelative(-2.0f);
        r6.C(i, 14.5f, 13.0f, 11.0f, 11.09f);
        i.moveTo(14.5f, 6.0f);
        i.lineTo(9.0f, 9.0f);
        i.lineToRelative(5.5f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 20.0f, 9.0f, -5.5f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castForEducation = build;
        build.getClass();
        return build;
    }
}
