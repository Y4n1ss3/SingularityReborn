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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GamepadKt {
    private static ImageVector _gamepad;

    public static final ImageVector getGamepad(Icons.TwoTone twoTone) {
        ImageVector imageVector = _gamepad;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Gamepad", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(6.67f, 11.0f, 4.0f, 11.0f, 2.0f);
        uo.w(s, 2.67f, 1.0f, -1.0f);
        s.moveTo(13.0f, 6.67f);
        fc.w(s, 13.0f, 4.0f, -2.0f, 2.67f);
        fc.B(s, 1.0f, 1.0f, 11.0f, 17.33f);
        fc.w(s, 11.0f, 20.0f, 2.0f, -2.67f);
        fc.B(s, -1.0f, -1.0f, 16.33f, 12.0f);
        s.lineToRelative(1.0f, 1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(s, 20.0f, 13.0f, -2.0f, -2.67f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(9.0f, 16.5f, 9.0f, 22.0f, 6.0f);
        k.verticalLineToRelative(-5.5f);
        fc.C(k, -3.0f, -3.0f, -3.0f, 3.0f);
        k4.C(k, 13.0f, 20.0f, -2.0f, -2.67f);
        k.lineToRelative(1.0f, -1.0f);
        gy.B(k, 1.0f, 1.0f, 13.0f, 20.0f);
        k.moveTo(15.0f, 7.5f);
        k.lineTo(15.0f, 2.0f);
        k.lineTo(9.0f, 2.0f);
        k.verticalLineToRelative(5.5f);
        fc.C(k, 3.0f, 3.0f, 3.0f, -3.0f);
        k4.C(k, 11.0f, 4.0f, 2.0f, 2.67f);
        k.lineToRelative(-1.0f, 1.0f);
        gy.B(k, -1.0f, -1.0f, 11.0f, 4.0f);
        k.moveTo(7.5f, 9.0f);
        af0.m(k, 2.0f, 9.0f, 6.0f, 5.5f);
        fc.C(k, 3.0f, -3.0f, -3.0f, -3.0f);
        k.moveTo(6.67f, 13.0f);
        af0.m(k, 4.0f, 13.0f, -2.0f, 2.67f);
        fc.C(k, 1.0f, 1.0f, -1.0f, 1.0f);
        k.moveTo(16.5f, 9.0f);
        k.lineToRelative(-3.0f, 3.0f);
        k.lineToRelative(3.0f, 3.0f);
        k.lineTo(22.0f, 15.0f);
        uf.j(k, 22.0f, 9.0f, -5.5f);
        k.moveTo(20.0f, 13.0f);
        k.horizontalLineToRelative(-2.67f);
        k.lineToRelative(-1.0f, -1.0f);
        k.lineToRelative(1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(k, 20.0f, 11.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gamepad = build;
        build.getClass();
        return build;
    }
}
