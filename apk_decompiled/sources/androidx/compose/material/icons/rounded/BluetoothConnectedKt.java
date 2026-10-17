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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BluetoothConnectedKt {
    private static ImageVector _bluetoothConnected;

    public static final ImageVector getBluetoothConnected(Icons.Rounded rounded) {
        ImageVector imageVector = _bluetoothConnected;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BluetoothConnected", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 13.0f);
        b.curveToRelative(0.55f, -0.55f, 0.55f, -1.44f, 0.0f, -1.99f);
        b.lineTo(6.0f, 11.0f);
        b.curveToRelative(-0.55f, -0.55f, -1.45f, -0.55f, -2.0f, 0.0f);
        b.reflectiveCurveToRelative(-0.55f, 1.45f, 0.0f, 2.0f);
        b.reflectiveCurveToRelative(1.45f, 0.55f, 2.0f, 0.0f);
        b.close();
        b.moveTo(20.0f, 11.0f);
        b.curveToRelative(-0.56f, -0.56f, -1.45f, -0.56f, -2.0f, -0.01f);
        b.lineTo(18.0f, 11.0f);
        b.curveToRelative(-0.55f, 0.55f, -0.55f, 1.44f, 0.0f, 1.99f);
        b.lineTo(18.0f, 13.0f);
        b.curveToRelative(0.55f, 0.55f, 1.44f, 0.55f, 1.99f, 0.0f);
        b.lineTo(20.0f, 13.0f);
        b.curveToRelative(0.55f, -0.55f, 0.55f, -1.45f, 0.0f, -2.0f);
        k4.x(b, 17.0f, 7.0f, -4.29f, -4.29f);
        b.curveToRelative(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f);
        b.verticalLineToRelative(6.18f);
        b.lineTo(7.11f, 5.7f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(10.59f, 12.0f);
        b.lineTo(5.7f, 16.89f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineTo(11.0f, 14.41f);
        b.verticalLineToRelative(6.18f);
        b.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        b.lineTo(17.0f, 17.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        b.lineTo(13.41f, 12.0f);
        b.lineTo(17.0f, 8.42f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        k4.r(b, 14.88f, 16.29f, 13.0f, 18.17f);
        uo.t(b, -3.76f, 1.88f, 1.88f);
        b.moveTo(13.0f, 9.59f);
        b.lineTo(13.0f, 5.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.88f, 1.88f, 13.0f, 9.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothConnected = build;
        build.getClass();
        return build;
    }
}
