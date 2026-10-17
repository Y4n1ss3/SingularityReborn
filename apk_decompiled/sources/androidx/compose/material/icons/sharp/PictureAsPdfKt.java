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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PictureAsPdfKt {
    private static ImageVector _pictureAsPdf;

    public static final ImageVector getPictureAsPdf(Icons.Sharp sharp) {
        ImageVector imageVector = _pictureAsPdf;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PictureAsPdf", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(22.0f, 2.0f, 6.0f, 2.0f, 16.0f);
        gy.n(s, 16.0f, 22.0f, 2.0f);
        s.moveTo(11.5f, 11.0f);
        s.lineTo(9.0f, 11.0f);
        s.verticalLineToRelative(2.0f);
        s.lineTo(7.5f, 13.0f);
        r6.m(s, 7.5f, 7.0f, 4.0f, 4.0f);
        s.moveTo(16.5f, 11.5f);
        s.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        s.horizontalLineToRelative(-2.5f);
        s.lineTo(12.5f, 7.0f);
        s.lineTo(15.0f, 7.0f);
        s.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        r6.l(s, 3.0f, 20.5f, 8.5f);
        af0.m(s, 19.0f, 8.5f, 1.0f, 1.5f);
        s.lineTo(20.5f, 11.0f);
        af0.m(s, 19.0f, 11.0f, 2.0f, -1.5f);
        r6.m(s, 17.5f, 7.0f, 3.0f, 1.5f);
        k4.C(s, 9.0f, 9.5f, 1.0f, -1.0f);
        bv.r(s, 9.0f, 8.5f, 1.0f);
        s.moveTo(4.0f, 6.0f);
        af0.m(s, 2.0f, 6.0f, 16.0f, 16.0f);
        s.verticalLineToRelative(-2.0f);
        r6.C(s, 4.0f, 20.0f, 4.0f, 6.0f);
        k4.C(s, 14.0f, 11.5f, 1.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(s, -1.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pictureAsPdf = build;
        build.getClass();
        return build;
    }
}
