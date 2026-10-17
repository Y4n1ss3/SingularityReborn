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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HomeRepairServiceKt {
    private static ImageVector _homeRepairService;

    public static final ImageVector getHomeRepairService(Icons.Outlined outlined) {
        ImageVector imageVector = _homeRepairService;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HomeRepairService", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(20.0f, 8.0f, -3.0f, 6.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineTo(9.0f);
        e.curveTo(7.9f, 4.0f, 7.0f, 4.9f, 7.0f, 6.0f);
        e.verticalLineToRelative(2.0f);
        e.horizontalLineTo(4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        bv.x(e, 10.0f, 20.0f, 10.0f);
        e.curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f);
        r6.B(e, 9.0f, 6.0f, 6.0f, 2.0f);
        bv.s(e, 9.0f, 6.0f, 20.0f, 18.0f);
        uf.k(e, 4.0f, -3.0f, 2.0f, 1.0f);
        af0.v(e, 2.0f, -1.0f, 8.0f, 1.0f);
        bv.l(e, 2.0f, -1.0f, 2.0f, 18.0f);
        bv.y(e, 18.0f, 13.0f, -1.0f, -2.0f);
        af0.s(e, 1.0f, 8.0f, -1.0f, 6.0f);
        af0.B(e, 1.0f, 4.0f, -3.0f, 3.0f);
        e.horizontalLineToRelative(10.0f);
        e.horizontalLineToRelative(3.0f);
        e.verticalLineToRelative(3.0f);
        e.horizontalLineTo(18.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeRepairService = build;
        build.getClass();
        return build;
    }
}
