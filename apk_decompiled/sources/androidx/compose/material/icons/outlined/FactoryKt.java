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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(Icons.Outlined outlined) {
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Factory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(22.0f, 22.0f, 2.0f, 10.0f);
        c.lineToRelative(7.0f, -3.0f);
        c.verticalLineToRelative(2.0f);
        c.lineToRelative(5.0f, -2.0f);
        c.lineToRelative(0.0f, 3.0f);
        kf0.B(c, 3.0f, 1.0f, -8.0f, 3.0f);
        uf.x(c, 1.0f, 8.0f, 22.0f);
        c.moveTo(12.0f, 9.95f);
        c.lineToRelative(-5.0f, 2.0f);
        c.verticalLineTo(10.0f);
        c.lineToRelative(-3.0f, 1.32f);
        c.verticalLineTo(20.0f);
        kf0.x(c, 16.0f, -8.0f, -8.0f);
        uo.l(c, 12.0f, 9.95f, 11.0f, 18.0f);
        bv.l(c, 2.0f, -4.0f, -2.0f, 18.0f);
        k4.C(c, 7.0f, 18.0f, 2.0f, -4.0f);
        bv.s(c, 7.0f, 18.0f, 17.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(c, -2.0f, 4.0f, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factory = build;
        build.getClass();
        return build;
    }
}
