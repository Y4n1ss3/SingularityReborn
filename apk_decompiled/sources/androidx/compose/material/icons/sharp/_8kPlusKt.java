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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _8kPlusKt {
    private static ImageVector __8kPlus;

    public static final ImageVector get_8kPlus(Icons.Sharp sharp) {
        ImageVector imageVector = __8kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._8kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(7.5f, 12.5f, 1.0f, 14.0f, -1.0f);
        k4.D(n, 12.5f, 7.5f, 10.0f, 1.0f);
        k4.p(n, 1.5f, -1.0f, 10.0f);
        k4.A(n, 21.0f, 3.0f, 3.0f, 18.0f);
        uo.r(n, 18.0f, 3.0f, 10.0f, 14.0f);
        n.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        n.horizontalLineTo(7.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        n.verticalLineToRelative(-4.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineToRelative(2.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        k4.D(n, 14.0f, 16.0f, 15.0f, -1.75f);
        uo.x(n, -1.75f, -2.25f, 15.0f, 11.0f);
        kf0.r(n, 9.0f, 1.5f, 2.25f);
        n.lineTo(14.25f, 9.0f);
        n.horizontalLineTo(16.0f);
        gy.B(n, -2.25f, 3.0f, 16.0f, 15.0f);
        j50.y(n, 19.0f, 12.5f, -1.5f, 14.0f);
        af0.z(n, -1.0f, -1.5f, 15.0f, -1.0f);
        af0.q(n, 1.5f, 10.0f, 1.0f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(n, 19.0f, 12.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __8kPlus = build;
        build.getClass();
        return build;
    }
}
