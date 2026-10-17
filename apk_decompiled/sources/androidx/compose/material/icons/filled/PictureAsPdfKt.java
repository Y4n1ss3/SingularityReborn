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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PictureAsPdfKt {
    private static ImageVector _pictureAsPdf;

    public static final ImageVector getPictureAsPdf(Icons.Filled filled) {
        ImageVector imageVector = _pictureAsPdf;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PictureAsPdf", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 2.0f, 8.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(11.5f, 9.5f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        i.lineTo(9.0f, 11.0f);
        i.verticalLineToRelative(2.0f);
        i.lineTo(7.5f, 13.0f);
        i.lineTo(7.5f, 7.0f);
        i.lineTo(10.0f, 7.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        r6.l(i, 1.0f, 16.5f, 11.5f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        i.horizontalLineToRelative(-2.5f);
        i.lineTo(12.5f, 7.0f);
        i.lineTo(15.0f, 7.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        r6.l(i, 3.0f, 20.5f, 8.5f);
        af0.m(i, 19.0f, 8.5f, 1.0f, 1.5f);
        i.lineTo(20.5f, 11.0f);
        af0.m(i, 19.0f, 11.0f, 2.0f, -1.5f);
        r6.m(i, 17.5f, 7.0f, 3.0f, 1.5f);
        k4.C(i, 9.0f, 9.5f, 1.0f, -1.0f);
        bv.r(i, 9.0f, 8.5f, 1.0f);
        i.moveTo(4.0f, 6.0f);
        i.lineTo(2.0f, 6.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(i, 14.0f, -2.0f, 4.0f, 20.0f);
        uo.l(i, 4.0f, 6.0f, 14.0f, 11.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(i, 1.0f, -3.0f, -1.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pictureAsPdf = build;
        build.getClass();
        return build;
    }
}
