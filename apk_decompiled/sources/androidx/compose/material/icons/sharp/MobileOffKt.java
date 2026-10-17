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
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileOffKt {
    private static ImageVector _mobileOff;

    public static final ImageVector getMobileOff(Icons.Sharp sharp) {
        ImageVector imageVector = _mobileOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MobileOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(17.0f, 5.0f, 8.61f, 2.0f, 2.0f);
        r6.v(n, 1.0f, 5.0f, 0.61f);
        uo.l(n, 8.39f, 5.0f, 2.9f, 2.35f);
        n.lineTo(1.49f, 3.76f);
        fc.t(n, 5.0f, 7.27f, 23.0f, 14.0f);
        n.verticalLineToRelative(-1.73f);
        n.lineToRelative(1.7f, 1.7f);
        gy.B(n, 1.41f, -1.41f, 2.9f, 2.35f);
        n.moveTo(7.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(n, 9.27f, 16.73f, 19.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileOff = build;
        build.getClass();
        return build;
    }
}
