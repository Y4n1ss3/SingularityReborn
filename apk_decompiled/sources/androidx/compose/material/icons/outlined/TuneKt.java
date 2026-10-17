package androidx.compose.material.icons.outlined;

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
import defpackage.bv;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TuneKt {
    private static ImageVector _tune;

    public static final ImageVector getTune(Icons.Outlined outlined) {
        ImageVector imageVector = _tune;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tune", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(3.0f, 17.0f, 2.0f, 6.0f, -2.0f);
        uo.l(s, 3.0f, 17.0f, 3.0f, 5.0f);
        uo.B(s, 2.0f, 10.0f, 13.0f, 5.0f);
        uo.l(s, 3.0f, 5.0f, 13.0f, 21.0f);
        r6.D(s, -2.0f, 8.0f, -2.0f, -8.0f);
        af0.C(s, -2.0f, -2.0f, 6.0f, 2.0f);
        s.moveTo(7.0f, 9.0f);
        bv.q(s, 2.0f, 3.0f, 11.0f, 2.0f);
        kf0.x(s, 4.0f, 2.0f, 2.0f);
        r6.C(s, 9.0f, 9.0f, 7.0f, 9.0f);
        s.moveTo(21.0f, 13.0f);
        bv.q(s, -2.0f, 11.0f, 11.0f, 2.0f);
        kp0.A(s, 10.0f, 15.0f, 9.0f, 2.0f);
        s.lineTo(17.0f, 7.0f);
        uo.n(s, 4.0f, 21.0f, 5.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(s, 17.0f, 3.0f, -2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tune = build;
        build.getClass();
        return build;
    }
}
