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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.Filled filled) {
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HotelClass", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(8.58f, 10.0f, 1.0f, 6.17f, 4.41f);
        a.lineTo(4.83f, 22.0f);
        a.lineTo(11.0f, 17.31f);
        a.lineTo(17.18f, 22.0f);
        a.lineToRelative(-2.35f, -7.59f);
        a.lineTo(21.0f, 10.0f);
        a.horizontalLineToRelative(-7.58f);
        r6.C(a, 11.0f, 2.0f, 8.58f, 10.0f);
        a.moveTo(21.36f, 22.0f);
        a.lineToRelative(-1.86f, -6.01f);
        a.lineTo(23.68f, 13.0f);
        a.horizontalLineToRelative(-3.44f);
        a.lineToRelative(-3.08f, 2.2f);
        gy.B(a, 1.46f, 4.72f, 21.36f, 22.0f);
        a.moveTo(17.0f, 8.0f);
        a.lineToRelative(-1.82f, -6.0f);
        a.lineToRelative(-1.04f, 3.45f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(a, 14.91f, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = build;
        build.getClass();
        return build;
    }
}
