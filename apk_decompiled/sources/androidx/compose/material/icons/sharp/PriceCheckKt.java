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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PriceCheckKt {
    private static ImageVector _priceCheck;

    public static final ImageVector getPriceCheck(Icons.Sharp sharp) {
        ImageVector imageVector = _priceCheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PriceCheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.0f, 8.0f, -5.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        e.lineToRelative(5.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        e.lineToRelative(-2.5f, 0.0f);
        e.lineToRelative(0.0f, -1.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 1.0f);
        e.lineToRelative(-2.5f, 0.0f);
        e.lineToRelative(0.0f, 6.0f);
        e.lineToRelative(5.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(-5.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(2.5f, 0.0f);
        e.lineToRelative(0.0f, 1.0f);
        e.lineToRelative(2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -1.0f, 2.5f, 0.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(19.59f, 12.52f, -5.66f, 5.65f);
        e2.lineToRelative(-2.83f, -2.83f);
        e2.lineToRelative(-1.41f, 1.42f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 4.24f, 4.24f, 7.07f, -7.07f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _priceCheck = build;
        build.getClass();
        return build;
    }
}
