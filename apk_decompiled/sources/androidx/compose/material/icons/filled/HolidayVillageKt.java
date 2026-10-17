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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HolidayVillageKt {
    private static ImageVector _holidayVillage;

    public static final ImageVector getHolidayVillage(Icons.Filled filled) {
        ImageVector imageVector = _holidayVillage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HolidayVillage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = af0.j(18.0f, 20.0f, 8.35f, 13.65f, 4.0f);
        fc.s(j, -2.83f, 16.0f, 9.18f, 20.0f);
        af0.x(j, 18.0f, 22.0f, 20.0f, 6.69f);
        j.lineTo(19.31f, 4.0f);
        fc.s(j, -2.83f, 20.0f, 7.52f, 20.0f);
        k4.w(j, 22.0f, 8.0f, 4.0f);
        r6.A(j, -6.0f, 6.0f, 10.0f, 5.0f);
        r6.D(j, -5.0f, 2.0f, 5.0f, 5.0f);
        bv.k(j, 10.0f, 8.0f, 4.0f);
        k4.A(j, 9.0f, 13.0f, 7.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(j, 2.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _holidayVillage = build;
        build.getClass();
        return build;
    }
}
