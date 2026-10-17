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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Sharp sharp) {
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Pinch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(23.18f, 15.4f, 22.1f, 23.0f, -9.0f);
        k.lineTo(8.0f, 17.62f);
        k.lineToRelative(1.22f, -1.23f);
        k.lineTo(13.0f, 17.24f);
        k.verticalLineTo(6.5f);
        k.curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f);
        k.reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f);
        uo.D(k, 6.0f, 1.38f, 23.18f, 15.4f);
        kp0.t(k, 6.0f, 2.5f, 1.0f, 5.0f);
        gy.i(k, 5.0f, 9.5f, 3.56f);
        fc.v(k, 3.56f, 9.5f, 6.0f, 11.0f);
        kf0.o(k, 1.0f, 6.0f, 1.5f, 2.44f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(k, 8.44f, 2.5f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = build;
        build.getClass();
        return build;
    }
}
