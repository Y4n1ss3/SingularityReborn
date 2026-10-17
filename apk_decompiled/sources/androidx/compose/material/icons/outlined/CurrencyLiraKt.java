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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyLiraKt {
    private static ImageVector _currencyLira;

    public static final ImageVector getCurrencyLira(Icons.Outlined outlined) {
        ImageVector imageVector = _currencyLira;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CurrencyLira", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(9.0f, 8.76f, 3.0f, 2.0f, 4.51f);
        c.lineTo(15.0f, 5.0f);
        c.verticalLineToRelative(2.36f);
        c.lineToRelative(-4.0f, 2.51f);
        c.lineToRelative(0.01f, 2.35f);
        c.lineTo(15.0f, 9.72f);
        k4.z(c, 2.36f, -4.0f, 2.51f, 19.0f);
        c.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        c.horizontalLineToRelative(2.0f);
        c.curveToRelative(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        k4.q(c, 9.0f, -5.16f, -3.0f, 1.88f);
        c.lineToRelative(0.0f, -2.36f);
        c.lineToRelative(3.0f, -1.88f);
        c.verticalLineToRelative(-2.36f);
        c.lineTo(6.0f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(c, 0.0f, -2.36f, 9.0f, 8.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyLira = build;
        build.getClass();
        return build;
    }
}
