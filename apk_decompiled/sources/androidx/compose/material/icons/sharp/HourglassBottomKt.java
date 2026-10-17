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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassBottomKt {
    private static ImageVector _hourglassBottom;

    public static final ImageVector getHourglassBottom(Icons.Sharp sharp) {
        ImageVector imageVector = _hourglassBottom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HourglassBottom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 22.0f, -0.01f, -6.0f);
        e.lineTo(14.0f, 12.0f);
        e.lineToRelative(3.99f, -4.01f);
        r6.w(e, 18.0f, 2.0f, 6.0f, 6.0f);
        e.lineToRelative(4.0f, 4.0f);
        kp0.k(e, -4.0f, 3.99f, 22.0f, 18.0f);
        kp0.t(e, 8.0f, 7.5f, 4.0f, 8.0f);
        e.verticalLineToRelative(3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, -4.0f, 4.0f, 8.0f, 7.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassBottom = build;
        build.getClass();
        return build;
    }
}
