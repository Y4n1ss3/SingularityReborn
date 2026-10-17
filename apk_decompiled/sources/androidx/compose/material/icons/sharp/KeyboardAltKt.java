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
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardAltKt {
    private static ImageVector _keyboardAlt;

    public static final ImageVector getKeyboardAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _keyboardAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.KeyboardAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(23.0f, 4.0f, 1.0f, 17.0f, 22.0f);
        kf0.D(i, 4.0f, 7.0f, 12.0f, 2.0f);
        fc.j(i, 5.0f, -2.0f, 7.0f);
        kp0.t(i, 5.0f, 10.0f, 8.0f, 2.0f);
        kf0.n(i, 2.0f, 5.0f, 11.0f, 12.0f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineTo(9.0f);
        i.verticalLineToRelative(-2.0f);
        i.horizontalLineTo(11.0f);
        i.close();
        kp0.t(i, 9.0f, 10.0f, 8.0f, 2.0f);
        kf0.n(i, 2.0f, 9.0f, 16.0f, 16.0f);
        i.verticalLineToRelative(1.0f);
        i.horizontalLineTo(8.0f);
        i.verticalLineToRelative(-1.0f);
        i.horizontalLineTo(16.0f);
        i.close();
        bv.y(i, 15.0f, 12.0f, 2.0f, -2.0f);
        kf0.n(i, -2.0f, 15.0f, 13.0f, 10.0f);
        j50.C(i, 8.0f, 2.0f, 2.0f, 13.0f);
        bv.y(i, 17.0f, 14.0f, -2.0f, 2.0f);
        kf0.n(i, 2.0f, 17.0f, 19.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(i, -2.0f, 8.0f, 2.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardAlt = build;
        build.getClass();
        return build;
    }
}
