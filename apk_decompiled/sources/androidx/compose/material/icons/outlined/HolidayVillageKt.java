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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HolidayVillageKt {
    private static ImageVector _holidayVillage;

    public static final ImageVector getHolidayVillage(Icons.Outlined outlined) {
        ImageVector imageVector = _holidayVillage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HolidayVillage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(8.0f, 4.0f, -6.0f, 6.0f, 10.0f);
        uf.w(e, 12.0f, 10.0f, 8.0f, 4.0f);
        k4.A(e, 12.0f, 18.0f, 9.0f, -3.0f);
        af0.o(e, 7.0f, 3.0f, 4.0f, -7.17f);
        e.lineToRelative(4.0f, -4.0f);
        uf.x(e, 4.0f, 4.0f, 18.0f);
        k4.A(e, 9.0f, 13.0f, 7.0f, -2.0f);
        uo.r(e, 2.0f, 13.0f, 18.0f, 20.0f);
        e.verticalLineTo(8.35f);
        e.lineTo(13.65f, 4.0f);
        e.horizontalLineToRelative(-2.83f);
        j50.z(e, 16.0f, 9.18f, 20.0f, 18.0f);
        e.moveTo(22.0f, 20.0f);
        e.verticalLineTo(6.69f);
        e.lineTo(19.31f, 4.0f);
        e.horizontalLineToRelative(-2.83f);
        e.lineTo(20.0f, 7.52f);
        e.verticalLineTo(20.0f);
        e.horizontalLineTo(22.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _holidayVillage = build;
        build.getClass();
        return build;
    }
}
