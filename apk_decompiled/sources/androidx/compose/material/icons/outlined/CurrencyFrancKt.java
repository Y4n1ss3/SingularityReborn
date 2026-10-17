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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyFrancKt {
    private static ImageVector _currencyFranc;

    public static final ImageVector getCurrencyFranc(Icons.Outlined outlined) {
        ImageVector imageVector = _currencyFranc;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CurrencyFranc", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 5.0f, 0.0f, -2.0f);
        e.lineToRelative(-11.0f, 0.0f);
        e.lineToRelative(0.0f, 13.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, 3.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, -3.0f);
        e.lineToRelative(4.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        e.lineToRelative(-4.0f, 0.0f);
        e.lineToRelative(0.0f, -3.0f);
        e.lineToRelative(8.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -8.0f, 0.0f, 0.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyFranc = build;
        build.getClass();
        return build;
    }
}
