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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhpKt {
    private static ImageVector _php;

    public static final ImageVector getPhp(Icons.Filled filled) {
        ImageVector imageVector = _php;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Php", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(13.0f, 9.0f, 1.5f, 6.0f, 13.0f);
        bv.B(d, -2.5f, -2.0f, 15.0f, 9.5f);
        bv.A(d, 9.0f, 11.0f, 2.0f, 2.0f);
        kf0.D(d, 9.0f, 8.0f, 10.5f, 1.0f);
        d.curveTo(8.0f, 12.3f, 7.3f, 13.0f, 6.5f, 13.0f);
        gy.o(d, -2.0f, 2.0f, 3.0f, 9.0f);
        d.horizontalLineToRelative(3.5f);
        d.curveTo(7.3f, 9.0f, 8.0f, 9.7f, 8.0f, 10.5f);
        r6.B(d, 6.5f, 10.5f, -2.0f, 1.0f);
        uo.r(d, 2.0f, 10.5f, 21.5f, 10.5f);
        d.verticalLineToRelative(1.0f);
        d.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        af0.w(d, -2.0f, 2.0f, -1.5f, 9.0f);
        d.horizontalLineTo(20.0f);
        d.curveTo(20.8f, 9.0f, 21.5f, 9.7f, 21.5f, 10.5f);
        r6.B(d, 20.0f, 10.5f, -2.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 2.0f, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _php = build;
        build.getClass();
        return build;
    }
}
