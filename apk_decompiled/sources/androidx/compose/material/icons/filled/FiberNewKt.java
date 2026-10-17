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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.Filled filled) {
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FiberNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        d.lineTo(2.0f, 18.0f);
        d.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.89f, 21.11f, 4.0f, 20.0f, 4.0f);
        r6.g(d, 8.5f, 15.0f, 7.3f);
        uo.x(d, -2.55f, -3.5f, 15.0f, 3.5f);
        uo.u(d, 9.0f, 1.25f, 2.5f, 3.5f);
        k4.t(d, 9.0f, 8.5f, 15.0f);
        k4.A(d, 13.5f, 10.26f, 11.0f, 1.12f);
        af0.z(d, 2.5f, 1.26f, 11.0f, 1.11f);
        af0.n(d, 2.5f, 15.0f, -4.0f, 9.0f);
        uo.r(d, 4.0f, 10.26f, 20.5f, 14.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(-4.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        uf.p(d, 9.0f, 1.25f, 4.51f, 1.13f);
        uf.p(d, 9.99f, 1.25f, 3.51f, 1.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(d, 9.0f, 1.25f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = build;
        build.getClass();
        return build;
    }
}
