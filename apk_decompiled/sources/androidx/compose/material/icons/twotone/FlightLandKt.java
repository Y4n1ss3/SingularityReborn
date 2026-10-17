package androidx.compose.material.icons.twotone;

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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlightLandKt {
    private static ImageVector _flightLand;

    public static final ImageVector getFlightLand(Icons.TwoTone twoTone) {
        ImageVector imageVector = _flightLand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FlightLand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(2.5f, 19.0f, 19.0f, 2.0f, -19.0f);
        r6.l(n, -2.0f, 19.34f, 15.85f);
        n.curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.84f, -1.06f);
        n.curveToRelative(0.21f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f);
        n.lineToRelative(-5.31f, -1.42f);
        n.lineToRelative(-2.76f, -9.02f);
        n.lineTo(10.12f, 2.0f);
        n.verticalLineToRelative(8.28f);
        n.lineTo(5.15f, 8.95f);
        n.lineToRelative(-0.93f, -2.32f);
        n.lineToRelative(-1.45f, -0.39f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(n, 5.17f, 16.57f, 4.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightLand = build;
        build.getClass();
        return build;
    }
}
