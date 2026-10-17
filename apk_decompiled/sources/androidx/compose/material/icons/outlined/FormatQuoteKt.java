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
import defpackage.fc;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatQuoteKt {
    private static ImageVector _formatQuote;

    public static final ImageVector getFormatQuote(Icons.Outlined outlined) {
        ImageVector imageVector = _formatQuote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FormatQuote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(18.62f, 18.0f, -5.24f, 2.0f, -4.0f);
        i.lineTo(13.0f, 14.0f);
        fc.w(i, 13.0f, 6.0f, 8.0f, 7.24f);
        uo.l(i, 18.62f, 18.0f, 16.62f, 16.0f);
        i.horizontalLineToRelative(0.76f);
        i.lineTo(19.0f, 12.76f);
        fc.w(i, 19.0f, 8.0f, -4.0f, 4.0f);
        uo.w(i, 3.62f, -2.0f, 4.0f);
        i.moveTo(8.62f, 18.0f);
        i.lineTo(3.38f, 18.0f);
        i.lineToRelative(2.0f, -4.0f);
        i.lineTo(3.0f, 14.0f);
        fc.w(i, 3.0f, 6.0f, 8.0f, 7.24f);
        uo.l(i, 8.62f, 18.0f, 6.62f, 16.0f);
        i.horizontalLineToRelative(0.76f);
        i.lineTo(9.0f, 12.76f);
        i.lineTo(9.0f, 8.0f);
        af0.m(i, 5.0f, 8.0f, 4.0f, 3.62f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(i, -2.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatQuote = build;
        build.getClass();
        return build;
    }
}
