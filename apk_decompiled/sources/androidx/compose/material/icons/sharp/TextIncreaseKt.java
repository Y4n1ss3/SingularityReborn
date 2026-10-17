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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextIncreaseKt {
    private static ImageVector _textIncrease;

    public static final ImageVector getTextIncrease(Icons.Sharp sharp) {
        ImageVector imageVector = _textIncrease;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TextIncrease", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(0.99f, 19.0f, 2.42f, 1.27f, -3.58f);
        uo.n(i, 5.65f, 11.59f, 19.0f, 2.42f);
        i.lineTo(8.75f, 5.0f);
        gy.n(i, -2.5f, 0.99f, 19.0f);
        i.moveTo(5.41f, 13.39f);
        i.lineTo(7.44f, 7.6f);
        uf.A(i, 0.12f, 2.03f, 5.79f, 5.41f);
        k4.C(i, 20.0f, 11.0f, 3.0f, 2.0f);
        af0.v(i, -3.0f, 3.0f, -2.0f, -3.0f);
        af0.w(i, -3.0f, -2.0f, 3.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 2.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textIncrease = build;
        build.getClass();
        return build;
    }
}
