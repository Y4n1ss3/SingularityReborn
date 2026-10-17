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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastForEducationKt {
    private static ImageVector _castForEducation;

    public static final ImageVector getCastForEducation(Icons.Filled filled) {
        ImageVector imageVector = _castForEducation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CastForEducation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(21.0f, 3.0f, 3.0f);
        d.curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f);
        k4.l(d, 3.0f, 2.0f, 5.0f, 18.0f);
        r6.D(d, 14.0f, -7.0f, 2.0f, 7.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f);
        uo.C(d, 1.0f, 18.0f, 3.0f, 3.0f);
        d.curveTo(4.0f, 19.34f, 2.66f, 18.0f, 1.0f, 18.0f);
        bv.v(d, 1.0f, 14.0f, 2.0f);
        d.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveTo(8.0f, 17.13f, 4.87f, 14.0f, 1.0f, 14.0f);
        bv.v(d, 1.0f, 10.0f, 2.0f);
        d.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveTo(12.0f, 14.92f, 7.07f, 10.0f, 1.0f, 10.0f);
        bv.v(d, 11.0f, 11.09f, 2.0f);
        d.lineTo(14.5f, 15.0f);
        d.lineToRelative(3.5f, -1.91f);
        d.verticalLineToRelative(-2.0f);
        r6.C(d, 14.5f, 13.0f, 11.0f, 11.09f);
        d.moveTo(14.5f, 6.0f);
        d.lineTo(9.0f, 9.0f);
        d.lineToRelative(5.5f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(d, 20.0f, 9.0f, 14.5f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castForEducation = build;
        build.getClass();
        return build;
    }
}
