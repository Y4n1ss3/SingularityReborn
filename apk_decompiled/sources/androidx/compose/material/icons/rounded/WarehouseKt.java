package androidx.compose.material.icons.rounded;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WarehouseKt {
    private static ImageVector _warehouse;

    public static final ImageVector getWarehouse(Icons.Rounded rounded) {
        ImageVector imageVector = _warehouse;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Warehouse", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(22.0f, 19.0f, 8.35f);
        d.curveToRelative(0.0f, -0.82f, -0.5f, -1.55f, -1.26f, -1.86f);
        d.lineToRelative(-8.0f, -3.2f);
        d.curveToRelative(-0.48f, -0.19f, -1.01f, -0.19f, -1.49f, 0.0f);
        d.lineToRelative(-8.0f, 3.2f);
        d.curveTo(2.5f, 6.8f, 2.0f, 7.54f, 2.0f, 8.35f);
        d.verticalLineTo(19.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.v(d, 3.0f, -9.0f, 10.0f, 9.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveTo(21.1f, 21.0f, 22.0f, 20.1f, 22.0f, 19.0f);
        uo.q(d, 11.0f, 19.0f, 9.0f, 2.0f);
        uo.r(d, 2.0f, 19.0f, 13.0f, 16.0f);
        bv.l(d, -2.0f, 2.0f, 2.0f, 16.0f);
        k4.C(d, 15.0f, 19.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 2.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _warehouse = build;
        build.getClass();
        return build;
    }
}
