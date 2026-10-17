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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsOverscanKt {
    private static ImageVector _settingsOverscan;

    public static final ImageVector getSettingsOverscan(Icons.Filled filled) {
        ImageVector imageVector = _settingsOverscan;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsOverscan", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k.moveTo(21.0f, 3.0f);
        k.lineTo(3.0f, 3.0f);
        k.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k.verticalLineToRelative(14.0f);
        k.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k.horizontalLineToRelative(18.0f);
        k.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        k.lineTo(23.0f, 5.0f);
        k.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(k, 21.0f, 19.01f, 3.0f, 19.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(k, 3.0f, 4.99f, 18.0f, 14.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsOverscan = build;
        build.getClass();
        return build;
    }
}
