package androidx.compose.material.icons.twotone;

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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreditCardOffKt {
    private static ImageVector _creditCardOff;

    public static final ImageVector getCreditCardOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _creditCardOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CreditCardOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(20.0f, 17.17f, 12.0f, -5.17f);
        uo.l(c, 20.0f, 17.17f, 10.83f, 8.0f);
        fc.q(c, 20.0f, 6.0f, 8.83f);
        uo.l(c, 10.83f, 8.0f, 4.0f, 6.83f);
        c.verticalLineTo(8.0f);
        c.horizontalLineToRelative(1.17f);
        c.lineTo(4.0f, 6.83f);
        c.close();
        c.moveTo(15.17f, 18.0f);
        j50.x(c, -6.0f, -6.0f, 4.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(c, 15.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(6.83f, 4.0f, 20.0f);
        d.curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f);
        fc.t(d, 20.0f, 17.17f, 12.0f, -5.17f);
        kp0.v(d, -4.0f, -4.0f, 20.0f, 6.0f);
        kf0.m(d, 8.83f, 6.83f, 4.0f);
        d.moveTo(20.49f, 23.31f);
        d.lineTo(17.17f, 20.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        d.lineTo(2.01f, 6.0f);
        d.curveToRelative(0.0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.93f);
        d.lineTo(0.69f, 3.51f);
        d.lineTo(2.1f, 2.1f);
        gy.B(d, 19.8f, 19.8f, 20.49f, 23.31f);
        kp0.t(d, 4.0f, 6.83f, 8.0f, 1.17f);
        uo.l(d, 4.0f, 6.83f, 15.17f, 18.0f);
        j50.x(d, -6.0f, -6.0f, 4.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(d, 15.17f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _creditCardOff = build;
        build.getClass();
        return build;
    }
}
