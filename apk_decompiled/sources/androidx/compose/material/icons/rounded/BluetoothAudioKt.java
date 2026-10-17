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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BluetoothAudioKt {
    private static ImageVector _bluetoothAudio;

    public static final ImageVector getBluetoothAudio(Icons.Rounded rounded) {
        ImageVector imageVector = _bluetoothAudio;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BluetoothAudio", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.98f, 10.28f, -1.38f, 1.38f);
        e.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        e.lineToRelative(1.38f, 1.38f);
        e.curveToRelative(0.28f, 0.28f, 0.75f, 0.15f, 0.85f, -0.23f);
        e.curveToRelative(0.11f, -0.5f, 0.17f, -1.0f, 0.17f, -1.52f);
        e.curveToRelative(0.0f, -0.51f, -0.06f, -1.01f, -0.18f, -1.48f);
        e.curveToRelative(-0.09f, -0.38f, -0.56f, -0.52f, -0.84f, -0.24f);
        e.close();
        e.moveTo(20.1f, 7.78f);
        e.curveToRelative(-0.25f, -0.55f, -0.98f, -0.67f, -1.4f, -0.24f);
        e.curveToRelative(-0.26f, 0.26f, -0.31f, 0.64f, -0.17f, 0.98f);
        e.curveToRelative(0.46f, 1.07f, 0.72f, 2.24f, 0.72f, 3.47f);
        e.curveToRelative(0.0f, 1.24f, -0.26f, 2.42f, -0.73f, 3.49f);
        e.curveToRelative(-0.14f, 0.32f, -0.09f, 0.69f, 0.16f, 0.94f);
        e.curveToRelative(0.41f, 0.41f, 1.1f, 0.29f, 1.35f, -0.23f);
        e.curveToRelative(0.63f, -1.3f, 0.98f, -2.76f, 0.98f, -4.3f);
        e.curveToRelative(-0.01f, -1.45f, -0.33f, -2.85f, -0.91f, -4.11f);
        k4.x(e, 11.39f, 12.0f, 3.59f, -3.58f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        e.lineToRelative(-4.29f, -4.29f);
        e.curveToRelative(-0.63f, -0.63f, -1.71f, -0.18f, -1.71f, 0.71f);
        e.lineTo(8.98f, 9.6f);
        e.lineTo(5.09f, 5.7f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineTo(8.57f, 12.0f);
        e.lineToRelative(-4.89f, 4.89f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(3.89f, -3.89f);
        e.verticalLineToRelative(6.18f);
        e.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        e.lineToRelative(4.3f, -4.3f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        uo.l(e, 11.39f, 12.0f, 10.98f, 5.83f);
        e.lineToRelative(1.88f, 1.88f);
        gy.B(e, -1.88f, 1.88f, 10.98f, 5.83f);
        e.moveTo(10.98f, 18.17f);
        e.verticalLineToRelative(-3.76f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.88f, 1.88f, -1.88f, 1.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothAudio = build;
        build.getClass();
        return build;
    }
}
