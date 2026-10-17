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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardKt {
    private static ImageVector _keyboard;

    public static final ImageVector getKeyboard(Icons.Sharp sharp) {
        ImageVector imageVector = _keyboard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Keyboard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 5.0f, 2.01f, 5.0f);
        i.lineTo(2.0f, 19.0f);
        gy.n(i, 20.0f, 22.0f, 5.0f);
        k4.C(i, 11.0f, 8.0f, 2.0f, 2.0f);
        gy.n(i, -2.0f, 11.0f, 8.0f);
        k4.C(i, 11.0f, 11.0f, 2.0f, 2.0f);
        fc.x(i, -2.0f, -2.0f, 8.0f, 8.0f);
        bv.C(i, 2.0f, 2.0f, 8.0f, 10.0f);
        uo.l(i, 8.0f, 8.0f, 8.0f, 11.0f);
        bv.C(i, 2.0f, 2.0f, 8.0f, 13.0f);
        r6.l(i, -2.0f, 7.0f, 13.0f);
        af0.m(i, 5.0f, 13.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 7.0f, 10.0f);
        i.lineTo(5.0f, 10.0f);
        r6.m(i, 5.0f, 8.0f, 2.0f, 2.0f);
        i.moveTo(16.0f, 17.0f);
        af0.m(i, 8.0f, 17.0f, -2.0f, 8.0f);
        bv.m(i, 2.0f, 16.0f, 13.0f, -2.0f);
        r6.p(i, -2.0f, 2.0f, 2.0f);
        i.moveTo(16.0f, 10.0f);
        uo.n(i, -2.0f, 14.0f, 8.0f, 2.0f);
        bv.m(i, 2.0f, 19.0f, 13.0f, -2.0f);
        r6.p(i, -2.0f, 2.0f, 2.0f);
        i.moveTo(19.0f, 10.0f);
        uo.n(i, -2.0f, 17.0f, 8.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboard = build;
        build.getClass();
        return build;
    }
}
