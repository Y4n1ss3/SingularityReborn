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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassFullKt {
    private static ImageVector _hourglassFull;

    public static final ImageVector getHourglassFull(Icons.Sharp sharp) {
        ImageVector imageVector = _hourglassFull;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HourglassFull", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(6.0f, 2.0f, 6.0f, 0.01f);
        m.lineTo(6.0f, 8.01f);
        m.lineTo(10.0f, 12.0f);
        m.lineToRelative(-4.0f, 4.0f);
        kp0.v(m, 0.01f, 0.01f, 6.0f, 22.0f);
        kf0.x(m, 12.0f, -5.99f, -0.01f);
        m.lineTo(18.0f, 16.0f);
        m.lineToRelative(-4.0f, -4.0f);
        m.lineToRelative(4.0f, -3.99f);
        kp0.v(m, -0.01f, -0.01f, 18.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(m, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassFull = build;
        build.getClass();
        return build;
    }
}
