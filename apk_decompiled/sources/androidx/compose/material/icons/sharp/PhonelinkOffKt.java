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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkOffKt {
    private static ImageVector _phonelinkOff;

    public static final ImageVector getPhonelinkOff(Icons.Sharp sharp) {
        ImageVector imageVector = _phonelinkOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhonelinkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.56f, 4.0f, -2.5f, -2.49f);
        uo.l(e, 4.56f, 4.0f, 24.0f, 8.0f);
        bv.p(e, -8.0f, 4.61f, 2.0f, 2.0f);
        fc.w(e, 18.0f, 10.0f, 4.0f, 7.0f);
        e.horizontalLineToRelative(-1.61f);
        gy.B(e, 3.0f, 3.0f, 24.0f, 20.0f);
        e.moveTo(22.0f, 6.0f);
        e.lineTo(22.0f, 4.0f);
        bv.o(e, 7.39f, 4.0f, 2.0f, 2.0f);
        e.moveTo(2.06f, 1.51f);
        e.lineTo(0.65f, 2.92f);
        e.lineTo(2.0f, 4.27f);
        e.lineTo(2.0f, 17.0f);
        af0.m(e, 0.0f, 17.0f, 3.0f, 17.73f);
        e.lineToRelative(2.35f, 2.35f);
        gy.B(e, 1.41f, -1.41f, 2.06f, 1.51f);
        e.moveTo(4.0f, 17.0f);
        e.lineTo(4.0f, 6.27f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 14.73f, 17.0f, 4.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkOff = build;
        build.getClass();
        return build;
    }
}
