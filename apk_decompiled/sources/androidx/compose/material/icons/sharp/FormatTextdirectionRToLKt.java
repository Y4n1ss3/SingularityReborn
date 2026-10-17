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
import defpackage.er;
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatTextdirectionRToLKt {
    private static ImageVector _formatTextdirectionRToL;

    public static final ImageVector getFormatTextdirectionRToL(Icons.Sharp sharp) {
        ImageVector imageVector = _formatTextdirectionRToL;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatTextdirectionRToL", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(10.0f, 10.0f, 5.0f, 2.0f);
        fc.w(m, 12.0f, 4.0f, 2.0f, 11.0f);
        uo.n(m, 2.0f, 16.0f, 4.0f, 2.0f);
        m.lineTo(18.0f, 2.0f);
        m.horizontalLineToRelative(-8.0f);
        m.curveTo(7.79f, 2.0f, 6.0f, 3.79f, 6.0f, 6.0f);
        m.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        bv.v(m, 8.0f, 17.0f, -3.0f);
        m.lineToRelative(-4.0f, 4.0f);
        r6.A(m, 4.0f, 4.0f, -3.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(m, -2.0f, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionRToL = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFormatTextdirectionRToL$annotations(Icons.Sharp sharp) {
    }
}
