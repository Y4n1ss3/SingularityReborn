package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatTextdirectionLToRKt {
    private static ImageVector _formatTextdirectionLToR;

    public static final ImageVector getFormatTextdirectionLToR(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _formatTextdirectionLToR;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.FormatTextdirectionLToR", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(9.0f, 10.0f, 5.0f, 2.0f);
        fc.w(m, 11.0f, 4.0f, 2.0f, 11.0f);
        uo.n(m, 2.0f, 15.0f, 4.0f, 2.0f);
        m.lineTo(17.0f, 2.0f);
        m.lineTo(9.0f, 2.0f);
        m.curveTo(6.79f, 2.0f, 5.0f, 3.79f, 5.0f, 6.0f);
        m.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        k4.x(m, 21.0f, 18.0f, -4.0f, -4.0f);
        bv.q(m, 3.0f, 5.0f, 17.0f, 2.0f);
        m.horizontalLineToRelative(12.0f);
        m.verticalLineToRelative(3.0f);
        m.lineToRelative(4.0f, -4.0f);
        m.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, m.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionLToR = build;
        build.getClass();
        return build;
    }
}
