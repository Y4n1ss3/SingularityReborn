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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BluetoothConnectedKt {
    private static ImageVector _bluetoothConnected;

    public static final ImageVector getBluetoothConnected(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bluetoothConnected;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BluetoothConnected", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(7.0f, 12.0f, -2.0f, -2.0f);
        e.lineToRelative(-2.0f, 2.0f);
        fc.C(e, 2.0f, 2.0f, 2.0f, -2.0f);
        e.moveTo(17.71f, 7.71f);
        fc.w(e, 12.0f, 2.0f, -1.0f, 7.59f);
        e.lineTo(6.41f, 5.0f);
        e.lineTo(5.0f, 6.41f);
        e.lineTo(10.59f, 12.0f);
        e.lineTo(5.0f, 17.59f);
        e.lineTo(6.41f, 19.0f);
        e.lineTo(11.0f, 14.41f);
        e.lineTo(11.0f, 22.0f);
        e.horizontalLineToRelative(1.0f);
        e.lineToRelative(5.71f, -5.71f);
        fc.C(e, -4.3f, -4.29f, 4.3f, -4.29f);
        e.moveTo(13.0f, 5.83f);
        e.lineToRelative(1.88f, 1.88f);
        r6.C(e, 13.0f, 9.59f, 13.0f, 5.83f);
        e.moveTo(14.88f, 16.29f);
        e.lineTo(13.0f, 18.17f);
        uo.t(e, -3.76f, 1.88f, 1.88f);
        e.moveTo(19.0f, 10.0f);
        e.lineToRelative(-2.0f, 2.0f);
        e.lineToRelative(2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 2.0f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothConnected = build;
        build.getClass();
        return build;
    }
}
