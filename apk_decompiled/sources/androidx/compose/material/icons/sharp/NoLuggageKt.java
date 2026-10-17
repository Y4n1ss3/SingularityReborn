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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoLuggageKt {
    private static ImageVector _noLuggage;

    public static final ImageVector getNoLuggage(Icons.Sharp sharp) {
        ImageVector imageVector = _noLuggage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoLuggage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(12.75f, 9.0f, 0.92f, 1.75f, 1.75f);
        r6.v(n, 9.0f, 16.0f, 4.17f);
        fc.u(n, 3.0f, 3.0f, 6.0f, -4.0f);
        n.verticalLineTo(2.0f);
        n.horizontalLineTo(9.0f);
        n.verticalLineToRelative(4.0f);
        n.horizontalLineTo(8.83f);
        gy.w(n, 3.0f, 3.0f, 12.75f);
        j50.y(n, 10.5f, 3.5f, 3.0f, 6.0f);
        uo.r(n, -3.0f, 3.5f, 21.19f, 21.19f);
        n.lineTo(2.81f, 2.81f);
        n.lineTo(1.39f, 4.22f);
        fc.t(n, 5.0f, 7.83f, 21.0f, 2.0f);
        r6.D(n, 1.0f, 2.0f, -1.0f, 6.0f);
        r6.D(n, 1.0f, 2.0f, -1.0f, 1.17f);
        gy.B(n, 1.61f, 1.61f, 21.19f, 21.19f);
        n.moveTo(8.0f, 18.0f);
        k4.z(n, -7.17f, 1.5f, 1.5f, 18.0f);
        kp0.D(n, 8.0f, 11.25f, 18.0f, -3.92f);
        n.lineToRelative(1.5f, 1.5f);
        n.verticalLineTo(18.0f);
        n.horizontalLineTo(11.25f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noLuggage = build;
        build.getClass();
        return build;
    }
}
