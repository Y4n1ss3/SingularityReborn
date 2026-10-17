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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Rounded rounded) {
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneBluetoothSpeaker", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.23f, 15.26f, -2.54f, -0.29f);
        e.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        e.lineToRelative(-1.84f, 1.84f);
        e.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        e.lineToRelative(1.85f, -1.85f);
        e.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        e.lineToRelative(-0.29f, -2.52f);
        e.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        e.lineTo(5.03f, 3.01f);
        e.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        e.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        e.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        e.verticalLineToRelative(-1.73f);
        e.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        k4.x(e, 16.79f, 6.01f, -2.45f, 2.45f);
        e.curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f);
        e.curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f);
        e.lineTo(17.0f, 7.23f);
        e.verticalLineToRelative(3.15f);
        e.curveToRelative(0.0f, 0.2f, 0.12f, 0.39f, 0.31f, 0.47f);
        e.curveToRelative(0.06f, 0.03f, 0.13f, 0.04f, 0.19f, 0.04f);
        e.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.36f, -0.15f);
        e.lineToRelative(2.18f, -2.18f);
        e.curveToRelative(0.2f, -0.2f, 0.2f, -0.52f, 0.0f, -0.71f);
        e.lineToRelative(-1.83f, -1.83f);
        e.lineToRelative(1.83f, -1.83f);
        e.curveToRelative(0.09f, -0.09f, 0.15f, -0.22f, 0.15f, -0.36f);
        e.reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.36f);
        e.lineToRelative(-2.18f, -2.18f);
        e.curveToRelative(-0.14f, -0.14f, -0.36f, -0.19f, -0.55f, -0.11f);
        e.curveToRelative(-0.19f, 0.08f, -0.31f, 0.26f, -0.31f, 0.46f);
        e.verticalLineToRelative(3.15f);
        e.lineToRelative(-1.95f, -1.95f);
        e.curveToRelative(-0.2f, -0.2f, -0.52f, -0.2f, -0.71f, 0.0f);
        e.curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f);
        fc.B(e, 2.45f, 2.46f, 18.01f, 2.86f);
        e.lineToRelative(0.96f, 0.96f);
        gy.B(e, -0.96f, 0.96f, 18.01f, 2.86f);
        e.moveTo(18.01f, 7.23f);
        e.lineToRelative(0.96f, 0.96f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, -0.96f, 0.96f, 18.01f, 7.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = build;
        build.getClass();
        return build;
    }
}
