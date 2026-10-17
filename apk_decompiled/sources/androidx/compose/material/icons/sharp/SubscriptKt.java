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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SubscriptKt {
    private static ImageVector _subscript;

    public static final ImageVector getSubscript(Icons.Sharp sharp) {
        ImageVector imageVector = _subscript;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Subscript", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(20.0f, 18.0f, 1.0f, 3.0f, 1.0f);
        af0.v(s, -4.0f, -3.0f, 3.0f, -1.0f);
        af0.v(s, -3.0f, -1.0f, 4.0f, 3.0f);
        kp0.r(s, 20.0f, 5.88f, 18.0f, 2.66f);
        s.lineToRelative(3.4f, -5.42f);
        kf0.B(s, 0.12f, 3.4f, 5.42f, 2.66f);
        s.lineToRelative(-4.65f, -7.27f);
        s.lineTo(17.81f, 4.0f);
        kf0.B(s, -2.68f, -3.07f, 4.99f, -0.12f);
        s.lineTo(8.85f, 4.0f);
        s.horizontalLineTo(6.19f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(s, 4.32f, 6.73f, 5.88f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subscript = build;
        build.getClass();
        return build;
    }
}
