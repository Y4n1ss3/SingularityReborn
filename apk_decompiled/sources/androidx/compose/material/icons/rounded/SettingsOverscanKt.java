package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsOverscanKt {
    private static ImageVector _settingsOverscan;

    public static final ImageVector getSettingsOverscan(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsOverscan;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsOverscan", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(12.01f, 7.0f, 10.0f, 9.0f, 4.0f);
        uo.l(k, 12.01f, 7.0f, 17.0f, 10.0f);
        k.verticalLineToRelative(4.0f);
        gy.B(k, 2.0f, -1.99f, 17.0f, 10.0f);
        k.moveTo(7.0f, 10.0f);
        k.lineToRelative(-2.0f, 2.01f);
        uf.o(k, 7.0f, 14.0f, 10.0f);
        k.moveTo(14.0f, 15.0f);
        k.horizontalLineToRelative(-4.0f);
        gy.B(k, 2.01f, 2.0f, 14.0f, 15.0f);
        k.moveTo(20.0f, 4.0f);
        k.horizontalLineTo(4.0f);
        k.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        k.verticalLineToRelative(12.0f);
        k.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k.horizontalLineToRelative(16.0f);
        k.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        k.verticalLineTo(6.0f);
        k.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        c21.d(k, 20.0f, 18.01f, 4.0f, 5.99f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(k, 16.0f, 18.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsOverscan = build;
        build.getClass();
        return build;
    }
}
