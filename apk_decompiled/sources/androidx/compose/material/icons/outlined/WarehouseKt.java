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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WarehouseKt {
    private static ImageVector _warehouse;

    public static final ImageVector getWarehouse(Icons.Outlined outlined) {
        ImageVector imageVector = _warehouse;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Warehouse", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(20.0f, 8.35f, 19.0f, -2.0f, -8.0f);
        uf.B(c, 6.0f, 8.0f, 4.0f, 8.35f);
        gy.B(c, 8.0f, -3.2f, 20.0f, 8.35f);
        c.moveTo(22.0f, 21.0f);
        c.verticalLineTo(7.0f);
        c.lineTo(12.0f, 3.0f);
        af0.m(c, 2.0f, 7.0f, 14.0f, 6.0f);
        fc.y(c, -8.0f, 8.0f, 8.0f, 22.0f);
        k4.A(c, 11.0f, 19.0f, 9.0f, 2.0f);
        uo.r(c, 2.0f, 19.0f, 13.0f, 16.0f);
        bv.l(c, -2.0f, 2.0f, 2.0f, 16.0f);
        k4.C(c, 15.0f, 19.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(c, 2.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _warehouse = build;
        build.getClass();
        return build;
    }
}
