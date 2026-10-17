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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyPoundKt {
    private static ImageVector _currencyPound;

    public static final ImageVector getCurrencyPound(Icons.Outlined outlined) {
        ImageVector imageVector = _currencyPound;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CurrencyPound", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.0f, 21.0f);
        b.curveToRelative(1.93f, 0.0f, 3.62f, -1.17f, 4.0f, -3.0f);
        b.lineToRelative(-1.75f, -0.88f);
        b.curveTo(16.0f, 18.21f, 15.33f, 19.0f, 14.0f, 19.0f);
        b.lineToRelative(-4.9f, 0.0f);
        b.curveToRelative(0.83f, -1.0f, 1.5f, -2.34f, 1.5f, -4.0f);
        b.curveToRelative(0.0f, -0.35f, -0.03f, -0.69f, -0.08f, -1.0f);
        b.lineTo(14.0f, 14.0f);
        b.verticalLineToRelative(-2.0f);
        b.lineToRelative(-4.18f, 0.0f);
        b.curveTo(9.0f, 10.42f, 8.0f, 9.6f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        b.curveToRelative(1.5f, 0.0f, 2.79f, 0.95f, 3.28f, 2.28f);
        b.lineTo(16.63f, 6.0f);
        b.curveToRelative(-0.8f, -2.05f, -2.79f, -3.5f, -5.13f, -3.5f);
        b.curveTo(8.46f, 2.5f, 6.0f, 4.96f, 6.0f, 8.0f);
        b.curveToRelative(0.0f, 1.78f, 0.79f, 2.9f, 1.49f, 4.0f);
        b.lineTo(6.0f, 12.0f);
        b.verticalLineToRelative(2.0f);
        b.lineToRelative(2.47f, 0.0f);
        b.curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1.0f);
        b.curveToRelative(0.0f, 2.7f, -2.6f, 4.0f, -2.6f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(b, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyPound = build;
        build.getClass();
        return build;
    }
}
