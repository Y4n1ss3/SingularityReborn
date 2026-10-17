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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GamepadKt {
    private static ImageVector _gamepad;

    public static final ImageVector getGamepad(Icons.Filled filled) {
        ImageVector imageVector = _gamepad;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Gamepad", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(15.0f, 7.5f, 2.0f, 9.0f, 5.5f);
        fc.C(f, 3.0f, 3.0f, 3.0f, -3.0f);
        k4.A(f, 7.5f, 9.0f, 2.0f, 6.0f);
        f.horizontalLineToRelative(5.5f);
        fc.C(f, 3.0f, -3.0f, -3.0f, -3.0f);
        kp0.t(f, 9.0f, 16.5f, 22.0f, 6.0f);
        f.verticalLineToRelative(-5.5f);
        fc.C(f, -3.0f, -3.0f, -3.0f, 3.0f);
        f.moveTo(16.5f, 9.0f);
        f.lineToRelative(-3.0f, 3.0f);
        kp0.v(f, 3.0f, 3.0f, 22.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(f, -5.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gamepad = build;
        build.getClass();
        return build;
    }
}
