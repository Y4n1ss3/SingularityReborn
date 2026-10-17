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
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(Icons.Filled filled) {
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Factory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(22.0f, 10.0f, 12.0f, 2.0f, 10.0f);
        y.lineToRelative(7.0f, -3.0f);
        y.verticalLineToRelative(2.0f);
        y.lineToRelative(5.0f, -2.0f);
        y.lineToRelative(0.0f, 0.0f);
        gy.w(y, 0.0f, 3.0f, 22.0f);
        y.moveTo(17.2f, 8.5f);
        y.lineTo(18.0f, 2.0f);
        uf.A(y, 3.0f, 0.8f, 6.5f, 17.2f);
        k4.C(y, 11.0f, 18.0f, 2.0f, -4.0f);
        uo.r(y, -2.0f, 18.0f, 7.0f, 18.0f);
        gy.t(y, 2.0f, -4.0f, 7.0f, 18.0f);
        k4.C(y, 17.0f, 14.0f, -2.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(y, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factory = build;
        build.getClass();
        return build;
    }
}
