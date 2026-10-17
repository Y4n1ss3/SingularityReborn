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
import defpackage.af0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalWifiConnectedNoInternet4Kt {
    private static ImageVector _signalWifiConnectedNoInternet4;

    public static final ImageVector getSignalWifiConnectedNoInternet4(Icons.Rounded rounded) {
        ImageVector imageVector = _signalWifiConnectedNoInternet4;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SignalWifiConnectedNoInternet4", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.21f, 8.24f);
        b.curveTo(20.22f, 5.6f, 16.3f, 4.0f, 12.0f, 4.0f);
        b.curveTo(7.7f, 4.0f, 3.78f, 5.6f, 0.79f, 8.24f);
        b.curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f);
        b.lineToRelative(10.56f, 10.58f);
        b.curveToRelative(0.19f, 0.19f, 0.45f, 0.29f, 0.7f, 0.29f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.horizontalLineToRelative(6.99f);
        b.lineToRelative(2.29f, -2.29f);
        b.curveTo(23.68f, 9.3f, 23.65f, 8.63f, 23.21f, 8.24f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.3f, 14.71f, 20.3f, 14.71f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(-1.39f, 1.38f);
        i.lineToRelative(-1.39f, -1.38f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(1.39f, 1.39f);
        i.lineToRelative(-1.39f, 1.39f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(1.39f, -1.38f);
        i.lineToRelative(1.39f, 1.38f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.lineToRelative(-1.38f, -1.39f);
        i.lineToRelative(1.38f, -1.39f);
        i.curveTo(20.69f, 15.73f, 20.69f, 15.1f, 20.3f, 14.71f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiConnectedNoInternet4 = build;
        build.getClass();
        return build;
    }
}
