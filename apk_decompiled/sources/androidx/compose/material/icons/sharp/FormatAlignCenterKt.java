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
import defpackage.af0;
import defpackage.bv;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatAlignCenterKt {
    private static ImageVector _formatAlignCenter;

    public static final ImageVector getFormatAlignCenter(Icons.Sharp sharp) {
        ImageVector imageVector = _formatAlignCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatAlignCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(7.0f, 15.0f, 2.0f, 10.0f, -2.0f);
        uo.l(s, 7.0f, 15.0f, 3.0f, 21.0f);
        bv.C(s, 18.0f, -2.0f, 3.0f, 19.0f);
        bv.m(s, 2.0f, 3.0f, 13.0f, 18.0f);
        bv.n(s, -2.0f, 3.0f, 11.0f, 2.0f);
        bv.y(s, 7.0f, 7.0f, 2.0f, 10.0f);
        r6.C(s, 17.0f, 7.0f, 7.0f, 7.0f);
        bv.y(s, 3.0f, 3.0f, 2.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(s, 21.0f, 3.0f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatAlignCenter = build;
        build.getClass();
        return build;
    }
}
