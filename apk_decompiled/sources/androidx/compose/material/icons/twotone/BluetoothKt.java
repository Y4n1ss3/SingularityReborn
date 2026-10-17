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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BluetoothKt {
    private static ImageVector _bluetooth;

    public static final ImageVector getBluetooth(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bluetooth;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Bluetooth", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(17.71f, 7.71f, 12.0f, 2.0f, -1.0f);
        k.verticalLineToRelative(7.59f);
        k.lineTo(6.41f, 5.0f);
        k.lineTo(5.0f, 6.41f);
        k.lineTo(10.59f, 12.0f);
        k.lineTo(5.0f, 17.59f);
        k.lineTo(6.41f, 19.0f);
        k.lineTo(11.0f, 14.41f);
        k.lineTo(11.0f, 22.0f);
        k.horizontalLineToRelative(1.0f);
        k.lineToRelative(5.71f, -5.71f);
        fc.C(k, -4.3f, -4.29f, 4.3f, -4.29f);
        k.moveTo(13.0f, 5.83f);
        k.lineToRelative(1.88f, 1.88f);
        r6.C(k, 13.0f, 9.59f, 13.0f, 5.83f);
        k.moveTo(14.88f, 16.29f);
        k.lineTo(13.0f, 18.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(k, -3.76f, 1.88f, 1.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetooth = build;
        build.getClass();
        return build;
    }
}
