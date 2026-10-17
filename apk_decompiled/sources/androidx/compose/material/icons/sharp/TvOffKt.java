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
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TvOffKt {
    private static ImageVector _tvOff;

    public static final ImageVector getTvOff(Icons.Sharp sharp) {
        ImageVector imageVector = _tvOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TvOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(21.0f, 7.0f, 10.88f, 2.0f, 2.0f);
        uo.u(n, 5.0f, -9.58f, 3.29f, -3.3f);
        n.lineTo(16.0f, 1.0f);
        n.lineToRelative(-4.0f, 4.0f);
        n.lineToRelative(-4.0f, -4.0f);
        n.lineToRelative(-0.7f, 0.7f);
        n.lineTo(10.58f, 5.0f);
        n.horizontalLineTo(8.12f);
        n.lineToRelative(2.0f, 2.0f);
        n.close();
        n.moveTo(2.41f, 2.13f);
        n.lineToRelative(-0.14f, 0.14f);
        n.lineTo(1.0f, 3.54f);
        kp0.v(n, 1.53f, 1.53f, 1.0f, 21.0f);
        n.horizontalLineToRelative(17.46f);
        n.lineToRelative(1.99f, 1.99f);
        n.lineToRelative(1.26f, -1.26f);
        gy.B(n, 0.15f, -0.15f, 2.41f, 2.13f);
        kp0.t(n, 3.0f, 19.0f, 7.0f, 1.46f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(n, 12.0f, 12.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tvOff = build;
        build.getClass();
        return build;
    }
}
