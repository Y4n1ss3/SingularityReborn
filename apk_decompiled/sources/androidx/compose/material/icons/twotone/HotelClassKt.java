package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HotelClass", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.0f, 8.89f, 0.94f, 3.11f);
        e.lineToRelative(2.82f, 0.0f);
        e.lineToRelative(-2.27f, 1.62f);
        e.lineToRelative(0.93f, 3.01f);
        e.lineToRelative(-2.42f, -1.84f);
        e.lineToRelative(-2.42f, 1.84f);
        e.lineToRelative(0.93f, -3.01f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -2.27f, -1.62f, 2.82f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(11.0f, 8.89f, 11.94f, 12.0f, 2.82f);
        k.lineToRelative(-2.27f, 1.62f);
        k.lineToRelative(0.93f, 3.01f);
        k.lineTo(11.0f, 14.79f);
        k.lineToRelative(-2.42f, 1.84f);
        k.lineToRelative(0.93f, -3.01f);
        k.lineTo(7.24f, 12.0f);
        gy.n(k, 2.82f, 11.0f, 8.89f);
        k.moveTo(8.58f, 10.0f);
        k.horizontalLineTo(1.0f);
        k.lineToRelative(6.17f, 4.41f);
        k.lineTo(4.83f, 22.0f);
        k.lineTo(11.0f, 17.31f);
        k.lineTo(17.18f, 22.0f);
        k.lineToRelative(-2.35f, -7.59f);
        k.lineTo(21.0f, 10.0f);
        k.horizontalLineToRelative(-7.58f);
        r6.C(k, 11.0f, 2.0f, 8.58f, 10.0f);
        k.moveTo(21.36f, 22.0f);
        k.lineToRelative(-1.86f, -6.01f);
        k.lineTo(23.68f, 13.0f);
        k.horizontalLineToRelative(-3.44f);
        k.lineToRelative(-3.08f, 2.2f);
        gy.B(k, 1.46f, 4.72f, 21.36f, 22.0f);
        k.moveTo(17.0f, 8.0f);
        k.lineToRelative(-1.82f, -6.0f);
        k.lineToRelative(-1.04f, 3.45f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(k, 14.91f, 8.0f, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = build;
        build.getClass();
        return build;
    }
}
