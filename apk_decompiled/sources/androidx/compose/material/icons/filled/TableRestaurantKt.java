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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TableRestaurantKt {
    private static ImageVector _tableRestaurant;

    public static final ImageVector getTableRestaurant(Icons.Filled filled) {
        ImageVector imageVector = _tableRestaurant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TableRestaurant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.96f, 9.73f, -1.43f, -5.0f);
        e.curveTo(20.41f, 4.3f, 20.02f, 4.0f, 19.57f, 4.0f);
        e.horizontalLineTo(4.43f);
        e.curveTo(3.98f, 4.0f, 3.59f, 4.3f, 3.47f, 4.73f);
        e.lineToRelative(-1.43f, 5.0f);
        e.curveTo(1.86f, 10.36f, 2.34f, 11.0f, 3.0f, 11.0f);
        uo.n(e, 2.2f, 4.0f, 20.0f, 2.0f);
        e.lineToRelative(0.67f, -5.0f);
        uo.n(e, 10.67f, 18.0f, 20.0f, 2.0f);
        e.lineToRelative(-1.2f, -9.0f);
        e.horizontalLineTo(21.0f);
        e.curveTo(21.66f, 11.0f, 22.14f, 10.36f, 21.96f, 9.73f);
        k4.x(e, 6.93f, 13.0f, 0.27f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(e, 9.6f, 0.27f, 2.0f, 6.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableRestaurant = build;
        build.getClass();
        return build;
    }
}
