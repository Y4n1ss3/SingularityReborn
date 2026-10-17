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
import defpackage.bv;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlightKt {
    private static ImageVector _flight;

    public static final ImageVector getFlight(Icons.Sharp sharp) {
        ImageVector imageVector = _flight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Flight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(21.0f, 16.0f, -2.0f, -8.0f, -5.0f);
        n.verticalLineTo(3.5f);
        n.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        n.reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f);
        k4.y(n, 9.0f, -8.0f, 5.0f, 2.0f);
        n.lineToRelative(8.0f, -2.5f);
        n.verticalLineTo(19.0f);
        n.lineToRelative(-2.0f, 1.5f);
        n.verticalLineTo(22.0f);
        n.lineToRelative(3.5f, -1.0f);
        n.lineToRelative(3.5f, 1.0f);
        bv.q(n, -1.5f, 13.0f, 19.0f, -5.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(n, 8.0f, 2.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flight = build;
        build.getClass();
        return build;
    }
}
