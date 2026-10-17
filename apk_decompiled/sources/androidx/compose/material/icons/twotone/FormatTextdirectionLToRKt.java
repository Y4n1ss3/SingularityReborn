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
import defpackage.bv;
import defpackage.er;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatTextdirectionLToRKt {
    private static ImageVector _formatTextdirectionLToR;

    public static final ImageVector getFormatTextdirectionLToR(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatTextdirectionLToR;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatTextdirectionLToR", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(9.0f, 8.0f, 4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(d, 0.9f, 2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(9.0f, 10.0f, 5.0f, 2.0f);
        fc.w(m, 11.0f, 4.0f, 2.0f, 11.0f);
        uo.n(m, 2.0f, 15.0f, 4.0f, 2.0f);
        m.lineTo(17.0f, 2.0f);
        m.lineTo(9.0f, 2.0f);
        m.curveTo(6.79f, 2.0f, 5.0f, 3.79f, 5.0f, 6.0f);
        m.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        bv.v(m, 9.0f, 4.0f, 4.0f);
        m.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        m.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        k4.x(m, 21.0f, 18.0f, -4.0f, -4.0f);
        bv.q(m, 3.0f, 5.0f, 17.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(m, 12.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionLToR = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFormatTextdirectionLToR$annotations(Icons.TwoTone twoTone) {
    }
}
