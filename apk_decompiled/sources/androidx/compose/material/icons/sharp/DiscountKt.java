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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DiscountKt {
    private static ImageVector _discount;

    public static final ImageVector getDiscount(Icons.Sharp sharp) {
        ImageVector imageVector = _discount;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Discount", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.79f, 21.0f, -9.79f, -9.79f);
        e.lineToRelative(0.0f, 2.83f);
        e.lineToRelative(9.79f, 9.79f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 9.04f, -9.04f, -1.42f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(3.0f, 9.04f, 9.79f, 9.79f);
        e2.lineToRelative(9.04f, -9.04f);
        e2.lineTo(12.04f, 0.0f);
        e2.horizontalLineTo(3.0f);
        e2.verticalLineTo(9.04f);
        e2.close();
        e2.moveTo(7.25f, 3.0f);
        e2.curveTo(7.94f, 3.0f, 8.5f, 3.56f, 8.5f, 4.25f);
        e2.reflectiveCurveTo(7.94f, 5.5f, 7.25f, 5.5f);
        e2.reflectiveCurveTo(6.0f, 4.94f, 6.0f, 4.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(e2, 6.56f, 3.0f, 7.25f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _discount = build;
        build.getClass();
        return build;
    }
}
