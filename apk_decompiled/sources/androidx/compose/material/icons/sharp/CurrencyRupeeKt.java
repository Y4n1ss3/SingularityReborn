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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyRupeeKt {
    private static ImageVector _currencyRupee;

    public static final ImageVector getCurrencyRupee(Icons.Sharp sharp) {
        ImageVector imageVector = _currencyRupee;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CurrencyRupee", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.66f, 7.0f);
        b.curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f);
        fc.t(b, 6.0f, 5.0f, 3.0f, 12.0f);
        b.verticalLineToRelative(2.0f);
        b.lineToRelative(-3.26f, 0.0f);
        b.curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f);
        b.lineTo(18.0f, 7.0f);
        b.verticalLineToRelative(2.0f);
        b.lineToRelative(-2.02f, 0.0f);
        b.curveToRelative(-0.25f, 2.8f, -2.61f, 5.0f, -5.48f, 5.0f);
        uo.g(b, 9.77f, 6.73f, 7.0f, -2.77f);
        af0.m(b, 7.0f, 14.0f, -2.0f, 3.5f);
        b.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        b.lineTo(6.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.k(b, 7.0f, 13.66f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyRupee = build;
        build.getClass();
        return build;
    }
}
