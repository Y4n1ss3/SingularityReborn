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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsOverscanKt {
    private static ImageVector _settingsOverscan;

    public static final ImageVector getSettingsOverscan(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsOverscan;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsOverscan", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(12.01f, 5.5f, 10.0f, 8.0f, 4.0f);
        fc.B(k, -1.99f, -2.5f, 18.0f, 10.0f);
        k.verticalLineToRelative(4.0f);
        gy.B(k, 2.5f, -1.99f, 18.0f, 10.0f);
        k.moveTo(6.0f, 10.0f);
        k.lineToRelative(-2.5f, 2.01f);
        bv.r(k, 6.0f, 14.0f, -4.0f);
        k.moveTo(14.0f, 16.0f);
        k.horizontalLineToRelative(-4.0f);
        gy.B(k, 2.01f, 2.5f, 14.0f, 16.0f);
        k.moveTo(23.0f, 3.0f);
        af0.m(k, 1.0f, 3.0f, 18.0f, 22.0f);
        uo.l(k, 23.0f, 3.0f, 21.0f, 19.01f);
        k.lineTo(3.0f, 19.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(k, 3.0f, 4.99f, 18.0f, 14.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsOverscan = build;
        build.getClass();
        return build;
    }
}
