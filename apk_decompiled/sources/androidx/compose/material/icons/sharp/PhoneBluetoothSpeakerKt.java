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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Sharp sharp) {
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneBluetoothSpeaker", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.71f, 9.5f, 17.0f, 7.21f);
        i.lineTo(17.0f, 11.0f);
        i.horizontalLineToRelative(0.5f);
        i.lineToRelative(2.85f, -2.85f);
        i.lineTo(18.21f, 6.0f);
        i.lineToRelative(2.15f, -2.15f);
        i.lineTo(17.5f, 1.0f);
        i.lineTo(17.0f, 1.0f);
        i.verticalLineToRelative(3.79f);
        i.lineTo(14.71f, 2.5f);
        i.lineToRelative(-0.71f, 0.71f);
        i.lineTo(16.79f, 6.0f);
        bv.o(i, 14.0f, 8.79f, 0.71f, 0.71f);
        i.moveTo(18.0f, 2.91f);
        i.lineToRelative(0.94f, 0.94f);
        gy.B(i, -0.94f, 0.94f, 18.0f, 2.91f);
        i.moveTo(18.0f, 7.21f);
        i.lineToRelative(0.94f, 0.94f);
        gy.B(i, -0.94f, 0.94f, 18.0f, 7.21f);
        i.moveTo(21.0f, 15.46f);
        i.lineToRelative(-5.27f, -0.61f);
        i.lineToRelative(-2.52f, 2.52f);
        i.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        i.lineToRelative(2.53f, -2.53f);
        i.lineTo(8.54f, 3.0f);
        i.lineTo(3.03f, 3.0f);
        i.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, -5.51f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = build;
        build.getClass();
        return build;
    }
}
