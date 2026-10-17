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
import defpackage.af0;
import defpackage.bv;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _123Kt {
    private static ImageVector __123;

    public static final ImageVector get_123(Icons.Sharp sharp) {
        ImageVector imageVector = __123;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._123", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uo.b(7.0f, 15.0f, 5.5f, -4.5f, 4.0f);
        c21.c(b, 9.0f, 3.0f, 15.0f);
        k4.C(b, 13.5f, 13.5f, -3.0f, -1.0f);
        af0.p(b, 3.0f, 9.0f, 9.0f, 1.5f);
        gy.o(b, 3.0f, 1.0f, 9.0f, 15.0f);
        uo.r(b, 4.5f, 13.5f, 19.5f, 15.0f);
        bv.A(b, 9.0f, 15.0f, 1.5f, 3.0f);
        r6.D(b, 1.0f, -2.0f, 1.0f, 2.0f);
        b.verticalLineToRelative(1.0f);
        b.horizontalLineToRelative(-3.0f);
        b.verticalLineTo(15.0f);
        b.horizontalLineTo(19.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __123 = build;
        build.getClass();
        return build;
    }
}
