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
import defpackage.c21;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyRubleKt {
    private static ImageVector _currencyRuble;

    public static final ImageVector getCurrencyRuble(Icons.Filled filled) {
        ImageVector imageVector = _currencyRuble;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CurrencyRuble", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uo.b(13.5f, 3.0f, 7.0f, 9.0f, 5.0f);
        uf.s(b, 2.0f, 2.0f, 2.0f, 5.0f);
        r6.D(b, 2.0f, 2.0f, 3.0f, 2.0f);
        uf.s(b, -3.0f, 4.0f, -2.0f, 9.0f);
        b.verticalLineToRelative(-2.0f);
        b.horizontalLineToRelative(4.5f);
        b.curveToRelative(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f);
        b.curveTo(19.0f, 5.46f, 16.54f, 3.0f, 13.5f, 3.0f);
        c21.d(b, 13.5f, 12.0f, 9.0f, 5.0f);
        b.horizontalLineToRelative(4.5f);
        b.curveTo(15.43f, 5.0f, 17.0f, 6.57f, 17.0f, 8.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 15.43f, 12.0f, 13.5f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyRuble = build;
        build.getClass();
        return build;
    }
}
