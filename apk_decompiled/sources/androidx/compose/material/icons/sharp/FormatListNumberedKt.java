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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatListNumberedKt {
    private static ImageVector _formatListNumbered;

    public static final ImageVector getFormatListNumbered(Icons.Sharp sharp) {
        ImageVector imageVector = _formatListNumbered;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatListNumbered", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(2.0f, 17.0f, 2.0f, 0.5f);
        af0.m(b, 3.0f, 17.5f, 1.0f, 1.0f);
        bv.q(b, 0.5f, 2.0f, 19.0f, 1.0f);
        bv.C(b, 3.0f, -4.0f, 2.0f, 16.0f);
        bv.m(b, 1.0f, 3.0f, 8.0f, 1.0f);
        b.lineTo(4.0f, 4.0f);
        af0.m(b, 2.0f, 4.0f, 1.0f, 1.0f);
        bv.m(b, 3.0f, 2.0f, 11.0f, 1.8f);
        af0.m(b, 2.0f, 13.1f, 0.9f, 3.0f);
        b.verticalLineToRelative(-1.0f);
        b.lineTo(3.2f, 13.0f);
        b.lineTo(5.0f, 10.9f);
        b.lineTo(5.0f, 10.0f);
        bv.r(b, 2.0f, 10.0f, 1.0f);
        bv.y(b, 7.0f, 5.0f, 2.0f, 14.0f);
        r6.C(b, 21.0f, 5.0f, 7.0f, 5.0f);
        k4.C(b, 7.0f, 19.0f, 14.0f, -2.0f);
        bv.r(b, 7.0f, 17.0f, 2.0f);
        k4.C(b, 7.0f, 13.0f, 14.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(b, 7.0f, 11.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatListNumbered = build;
        build.getClass();
        return build;
    }
}
