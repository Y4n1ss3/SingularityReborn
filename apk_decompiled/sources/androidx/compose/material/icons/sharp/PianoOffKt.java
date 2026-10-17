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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PianoOffKt {
    private static ImageVector _pianoOff;

    public static final ImageVector getPianoOff(Icons.Sharp sharp) {
        ImageVector imageVector = _pianoOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PianoOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        fc.t(i, 3.0f, 5.83f, 21.0f, 15.17f);
        gy.B(i, 1.61f, 1.61f, 21.19f, 21.19f);
        uo.p(i, 8.25f, 19.0f, 5.0f, 7.83f);
        r6.A(i, 2.0f, 2.0f, 4.67f, 1.25f);
        kf0.D(i, 19.0f, 9.75f, 19.0f, -4.5f);
        k4.q(i, 11.0f, -0.67f, 3.25f, 3.25f);
        bv.z(i, 19.0f, 9.75f, 5.83f, 3.0f);
        k4.q(i, 21.0f, 15.17f, -2.0f, -2.0f);
        kf0.r(i, 5.0f, -2.0f, 9.17f);
        fc.u(i, -4.0f, -4.0f, 5.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(i, 3.17f, 5.83f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pianoOff = build;
        build.getClass();
        return build;
    }
}
