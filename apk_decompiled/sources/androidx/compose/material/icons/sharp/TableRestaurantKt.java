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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TableRestaurantKt {
    private static ImageVector _tableRestaurant;

    public static final ImageVector getTableRestaurant(Icons.Sharp sharp) {
        ImageVector imageVector = _tableRestaurant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TableRestaurant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(22.33f, 11.0f, -2.0f, -7.0f, 3.67f);
        u.lineToRelative(-2.0f, 7.0f);
        u.horizontalLineTo(5.2f);
        u.lineTo(4.0f, 20.0f);
        u.horizontalLineToRelative(2.0f);
        u.lineToRelative(0.67f, -5.0f);
        uo.n(u, 10.67f, 18.0f, 20.0f, 2.0f);
        gy.w(u, -1.2f, -9.0f, 22.33f);
        u.moveTo(6.93f, 13.0f);
        u.lineToRelative(0.27f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(u, 9.6f, 0.27f, 2.0f, 6.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableRestaurant = build;
        build.getClass();
        return build;
    }
}
