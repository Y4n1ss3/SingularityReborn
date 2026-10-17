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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AtmKt {
    private static ImageVector _atm;

    public static final ImageVector getAtm(Icons.Sharp sharp) {
        ImageVector imageVector = _atm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Atm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(8.0f, 9.0f, 1.5f, 2.25f);
        fc.w(m, 10.25f, 15.0f, 1.5f, -4.5f);
        m.lineTo(14.0f, 10.5f);
        r6.C(m, 14.0f, 9.0f, 8.0f, 9.0f);
        m.moveTo(7.0f, 9.0f);
        af0.m(m, 2.0f, 9.0f, 6.0f, 1.5f);
        uo.B(m, -1.5f, 2.0f, 5.5f, 15.0f);
        r6.C(m, 7.0f, 15.0f, 7.0f, 9.0f);
        k4.C(m, 5.5f, 12.0f, -2.0f, -1.5f);
        gy.n(m, 2.0f, 5.5f, 12.0f);
        k4.C(m, 22.0f, 9.0f, -6.5f, 6.0f);
        af0.m(m, 17.0f, 15.0f, -4.5f, 1.0f);
        fc.w(m, 18.0f, 14.0f, 1.5f, -3.51f);
        m.horizontalLineToRelative(1.0f);
        m.lineTo(20.5f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(m, 22.0f, 15.0f, 22.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _atm = build;
        build.getClass();
        return build;
    }
}
