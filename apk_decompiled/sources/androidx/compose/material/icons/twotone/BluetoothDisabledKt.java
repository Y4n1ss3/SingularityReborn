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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BluetoothDisabledKt {
    private static ImageVector _bluetoothDisabled;

    public static final ImageVector getBluetoothDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bluetoothDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BluetoothDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 5.83f, 1.88f, 1.88f);
        e.lineToRelative(-1.6f, 1.6f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(3.02f, -3.02f);
        fc.w(e, 12.0f, 2.0f, -1.0f, 5.03f);
        uf.v(e, 2.0f, 2.0f, -3.2f);
        e.moveTo(5.41f, 4.0f);
        e.lineTo(4.0f, 5.41f);
        e.lineTo(10.59f, 12.0f);
        e.lineTo(5.0f, 17.59f);
        e.lineTo(6.41f, 19.0f);
        fc.t(e, 11.0f, 14.41f, 22.0f, 1.0f);
        e.lineToRelative(4.29f, -4.29f);
        e.lineToRelative(2.3f, 2.29f);
        r6.C(e, 20.0f, 18.59f, 5.41f, 4.0f);
        e.moveTo(13.0f, 18.17f);
        e.verticalLineToRelative(-3.76f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.88f, 1.88f, 13.0f, 18.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothDisabled = build;
        build.getClass();
        return build;
    }
}
