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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultipleStopKt {
    private static ImageVector _multipleStop;

    public static final ImageVector getMultipleStop(Icons.Sharp sharp) {
        ImageVector imageVector = _multipleStop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MultipleStop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.0f, 4.0f, 4.0f, 4.0f);
        fc.u(e, -4.0f, 4.0f, 9.0f, -4.0f);
        c21.c(e, 7.0f, 4.0f, 4.0f);
        k4.C(e, 7.0f, 17.0f, 4.0f, -2.0f);
        k4.q(e, 7.0f, -3.0f, -4.0f, 4.0f);
        uf.x(e, 4.0f, 4.0f, 17.0f);
        k4.C(e, 19.0f, 15.0f, -2.0f, 2.0f);
        uo.r(e, 2.0f, 15.0f, 15.0f, 15.0f);
        bv.l(e, -2.0f, 2.0f, 2.0f, 15.0f);
        k4.A(e, 11.0f, 7.0f, 9.0f, 2.0f);
        uo.r(e, 2.0f, 7.0f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.e(e, 5.0f, 2.0f, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _multipleStop = build;
        build.getClass();
        return build;
    }
}
