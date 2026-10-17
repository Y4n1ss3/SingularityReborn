package androidx.compose.material.icons.filled;

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
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreditCardOffKt {
    private static ImageVector _creditCardOff;

    public static final ImageVector getCreditCardOff(Icons.Filled filled) {
        ImageVector imageVector = _creditCardOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CreditCardOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.9f, 21.9f, 2.1f, 2.1f);
        i.lineTo(0.69f, 3.51f);
        i.lineToRelative(1.55f, 1.55f);
        i.curveTo(2.09f, 5.34f, 2.01f, 5.66f, 2.01f, 6.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(13.17f);
        gy.B(i, 3.31f, 3.31f, 21.9f, 21.9f);
        kp0.t(i, 4.0f, 12.0f, 8.0f, 1.17f);
        gy.w(i, 4.0f, 4.0f, 4.0f);
        i.moveTo(6.83f, 4.0f);
        i.horizontalLineTo(20.0f);
        i.curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f);
        fc.v(i, 14.83f, 12.0f, 20.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(i, -9.17f, 6.83f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _creditCardOff = build;
        build.getClass();
        return build;
    }
}
