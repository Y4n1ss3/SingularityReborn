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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoBackpackKt {
    private static ImageVector _noBackpack;

    public static final ImageVector getNoBackpack(Icons.Sharp sharp) {
        ImageVector imageVector = _noBackpack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoBackpack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(2.76f, 2.76f);
        i.curveTo(4.06f, 7.31f, 4.0f, 7.64f, 4.0f, 8.0f);
        gy.C(i, 14.0f, 15.17f, 0.61f, 0.61f);
        uo.l(i, 21.19f, 21.19f, 6.0f, 14.0f);
        gy.C(i, -2.0f, 3.17f, 2.0f, 2.0f);
        k4.w(i, 6.0f, 6.98f, 4.15f);
        i.curveToRelative(0.01f, 0.0f, 0.01f, -0.01f, 0.02f, -0.01f);
        uf.p(i, 2.0f, 3.0f, 2.0f, 4.0f);
        kf0.r(i, 2.0f, 3.0f, 2.14f);
        i.curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f);
        k4.z(i, 9.17f, -2.0f, -2.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(i, -3.17f, 6.98f, 4.15f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noBackpack = build;
        build.getClass();
        return build;
    }
}
