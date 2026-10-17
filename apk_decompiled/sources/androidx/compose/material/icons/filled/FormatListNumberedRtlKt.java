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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatListNumberedRtlKt {
    private static ImageVector _formatListNumberedRtl;

    public static final ImageVector getFormatListNumberedRtl(Icons.Filled filled) {
        ImageVector imageVector = _formatListNumberedRtl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FormatListNumberedRtl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(18.0f, 17.0f, 2.0f, 0.5f, -1.0f);
        r6.D(n, 1.0f, 1.0f, 0.5f, -2.0f);
        af0.C(n, 1.0f, 3.0f, -4.0f, -3.0f);
        n.moveTo(19.0f, 8.0f);
        uo.n(n, 1.0f, 20.0f, 4.0f, -2.0f);
        kf0.C(n, 1.0f, 1.0f, 18.0f, 11.0f);
        n.horizontalLineToRelative(1.8f);
        n.lineTo(18.0f, 13.1f);
        n.verticalLineToRelative(0.9f);
        kf0.x(n, 3.0f, -1.0f, -1.8f);
        n.lineToRelative(1.8f, -2.1f);
        uf.j(n, 21.0f, 10.0f, -3.0f);
        k4.C(n, 2.0f, 5.0f, 14.0f, 2.0f);
        uo.l(n, 2.0f, 7.0f, 2.0f, 17.0f);
        j50.o(n, 14.0f, 2.0f, 2.0f, 19.0f);
        k4.C(n, 2.0f, 11.0f, 14.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 2.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatListNumberedRtl = build;
        build.getClass();
        return build;
    }
}
