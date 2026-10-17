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
import defpackage.er;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatTextdirectionLToRKt {
    private static ImageVector _formatTextdirectionLToR;

    public static final ImageVector getFormatTextdirectionLToR(Icons.Outlined outlined) {
        ImageVector imageVector = _formatTextdirectionLToR;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FormatTextdirectionLToR", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(9.0f, 4.0f, 4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        h.moveToRelative(8.0f, -2.0f);
        h.lineTo(9.0f, 2.0f);
        h.curveTo(6.79f, 2.0f, 5.0f, 3.79f, 5.0f, 6.0f);
        h.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        uo.B(h, 5.0f, 2.0f, 11.0f, 4.0f);
        kf0.x(h, 2.0f, 11.0f, 2.0f);
        h.lineTo(15.0f, 4.0f);
        gy.n(h, 2.0f, 17.0f, 2.0f);
        h.moveTo(17.0f, 14.0f);
        bv.q(h, 3.0f, 5.0f, 17.0f, 2.0f);
        bv.p(h, 12.0f, 3.0f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(h, -4.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionLToR = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFormatTextdirectionLToR$annotations(Icons.Outlined outlined) {
    }
}
