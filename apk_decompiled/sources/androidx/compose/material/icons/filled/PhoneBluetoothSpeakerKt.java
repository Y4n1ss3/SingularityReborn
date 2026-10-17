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
import defpackage.bv;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Filled filled) {
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhoneBluetoothSpeaker", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        i.moveTo(20.0f, 15.5f);
        i.curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        i.curveToRelative(-0.35f, -0.11f, -0.74f, -0.03f, -1.02f, 0.24f);
        i.lineToRelative(-2.2f, 2.2f);
        i.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        i.lineToRelative(2.2f, -2.21f);
        i.curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1.0f);
        i.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.lineTo(4.0f, 3.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-3.5f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = build;
        build.getClass();
        return build;
    }
}
