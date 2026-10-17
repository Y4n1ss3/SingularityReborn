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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsBluetoothKt {
    private static ImageVector _settingsBluetooth;

    public static final ImageVector getSettingsBluetooth(Icons.Filled filled) {
        ImageVector imageVector = _settingsBluetooth;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsBluetooth", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 24.0f, 2.0f, -2.0f, -2.0f);
        bv.m(n, 2.0f, 7.0f, 24.0f, 2.0f);
        bv.n(n, -2.0f, 7.0f, 22.0f, 2.0f);
        k4.C(n, 15.0f, 24.0f, 2.0f, -2.0f);
        fc.x(n, -2.0f, 2.0f, 17.71f, 5.71f);
        fc.w(n, 12.0f, 0.0f, -1.0f, 7.59f);
        n.lineTo(6.41f, 3.0f);
        n.lineTo(5.0f, 4.41f);
        n.lineTo(10.59f, 10.0f);
        n.lineTo(5.0f, 15.59f);
        n.lineTo(6.41f, 17.0f);
        n.lineTo(11.0f, 12.41f);
        n.lineTo(11.0f, 20.0f);
        n.horizontalLineToRelative(1.0f);
        n.lineToRelative(5.71f, -5.71f);
        fc.C(n, -4.3f, -4.29f, 4.3f, -4.29f);
        n.moveTo(13.0f, 3.83f);
        n.lineToRelative(1.88f, 1.88f);
        r6.C(n, 13.0f, 7.59f, 13.0f, 3.83f);
        n.moveTo(14.88f, 14.29f);
        n.lineTo(13.0f, 16.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(n, -3.76f, 1.88f, 1.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsBluetooth = build;
        build.getClass();
        return build;
    }
}
