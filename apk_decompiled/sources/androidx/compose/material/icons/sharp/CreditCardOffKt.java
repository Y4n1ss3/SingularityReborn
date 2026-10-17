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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreditCardOffKt {
    private static ImageVector _creditCardOff;

    public static final ImageVector getCreditCardOff(Icons.Sharp sharp) {
        ImageVector imageVector = _creditCardOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CreditCardOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(6.83f, 4.0f, 22.0f, 15.17f);
        fc.v(q, 14.83f, 12.0f, 20.0f, 8.0f);
        gy.n(q, -9.17f, 6.83f, 4.0f);
        q.moveTo(20.49f, 23.31f);
        fc.v(q, 17.17f, 20.0f, 2.0f, 4.83f);
        q.lineTo(0.69f, 3.51f);
        q.lineTo(2.1f, 2.1f);
        gy.B(q, 19.8f, 19.8f, 20.49f, 23.31f);
        q.moveTo(9.17f, 12.0f);
        j50.x(q, -4.0f, -4.0f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(q, 9.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _creditCardOff = build;
        build.getClass();
        return build;
    }
}
