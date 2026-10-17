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
import defpackage.af0;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DvrKt {
    private static ImageVector _dvr;

    public static final ImageVector getDvr(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _dvr;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.Dvr", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(23.0f, 3.0f, 1.0f, 3.0f, 16.0f);
        af0.v(s, 7.0f, 2.0f, 8.0f, -2.0f);
        gy.n(s, 7.0f, 23.0f, 3.0f);
        s.moveTo(21.0f, 17.0f);
        s.lineTo(3.0f, 17.0f);
        r6.m(s, 3.0f, 5.0f, 18.0f, 12.0f);
        s.moveTo(19.0f, 8.0f);
        af0.m(s, 8.0f, 8.0f, 2.0f, 11.0f);
        uo.l(s, 19.0f, 8.0f, 19.0f, 12.0f);
        af0.m(s, 8.0f, 12.0f, 2.0f, 11.0f);
        r6.l(s, -2.0f, 7.0f, 8.0f);
        af0.m(s, 5.0f, 8.0f, 2.0f, 2.0f);
        uo.l(s, 7.0f, 8.0f, 7.0f, 12.0f);
        af0.m(s, 5.0f, 12.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(s, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dvr = build;
        build.getClass();
        return build;
    }
}
