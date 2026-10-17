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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarBorderPurple500Kt {
    private static ImageVector _starBorderPurple500;

    public static final ImageVector getStarBorderPurple500(Icons.Sharp sharp) {
        ImageVector imageVector = _starBorderPurple500;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.StarBorderPurple500", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 9.24f, -7.19f, -0.62f);
        e.lineTo(12.0f, 2.0f);
        e.lineTo(9.19f, 8.63f);
        e.lineTo(2.0f, 9.24f);
        e.lineToRelative(5.46f, 4.73f);
        e.lineTo(5.82f, 21.0f);
        e.lineTo(12.0f, 17.27f);
        e.lineTo(18.18f, 21.0f);
        gy.B(e, -1.63f, -7.03f, 22.0f, 9.24f);
        e.moveTo(12.0f, 15.4f);
        e.lineToRelative(-3.76f, 2.27f);
        e.lineToRelative(1.0f, -4.28f);
        e.lineToRelative(-3.32f, -2.88f);
        e.lineToRelative(4.38f, -0.38f);
        e.lineTo(12.0f, 6.1f);
        e.lineToRelative(1.71f, 4.04f);
        e.lineToRelative(4.38f, 0.38f);
        e.lineToRelative(-3.32f, 2.88f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.0f, 4.28f, 12.0f, 15.4f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starBorderPurple500 = build;
        build.getClass();
        return build;
    }
}
