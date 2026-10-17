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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatQuoteKt {
    private static ImageVector _formatQuote;

    public static final ImageVector getFormatQuote(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatQuote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatQuote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(16.62f, 16.0f, 0.76f, 19.0f, 12.76f);
        fc.w(p, 19.0f, 8.0f, -4.0f, 4.0f);
        kp0.A(p, 3.62f, 6.62f, 16.0f, 0.76f);
        p.lineTo(9.0f, 12.76f);
        p.lineTo(9.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(p, 5.0f, 8.0f, 4.0f, 3.62f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(18.62f, 18.0f, 21.0f, 13.24f, 6.0f);
        kf0.x(u, -8.0f, 8.0f, 2.38f);
        uf.r(u, -2.0f, 4.0f, 5.24f);
        kp0.t(u, 15.0f, 12.0f, 8.0f, 4.0f);
        uo.k(u, 4.76f, 17.38f, 16.0f, -0.76f);
        gy.w(u, 2.0f, -4.0f, 15.0f);
        u.moveTo(3.38f, 18.0f);
        fc.s(u, 5.24f, 11.0f, 13.24f, 6.0f);
        af0.u(u, 3.0f, 8.0f, 2.38f);
        fc.B(u, -2.0f, 4.0f, 5.0f, 12.0f);
        kf0.r(u, 8.0f, 4.0f, 4.76f);
        u.lineTo(7.38f, 16.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(u, -0.76f, 2.0f, -4.0f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatQuote = build;
        build.getClass();
        return build;
    }
}
