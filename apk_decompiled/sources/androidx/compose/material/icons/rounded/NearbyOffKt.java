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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearbyOffKt {
    private static ImageVector _nearbyOff;

    public static final ImageVector getNearbyOff(Icons.Rounded rounded) {
        ImageVector imageVector = _nearbyOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NearbyOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.41f, 13.42f, 18.83f, 16.0f);
        i.lineToRelative(-1.81f, -1.81f);
        i.lineTo(19.2f, 12.0f);
        i.lineTo(12.0f, 4.8f);
        i.lineTo(9.81f, 6.99f);
        i.lineTo(8.0f, 5.17f);
        i.lineToRelative(2.58f, -2.58f);
        i.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        i.lineToRelative(8.0f, 8.0f);
        i.curveTo(22.2f, 11.37f, 22.2f, 12.63f, 21.41f, 13.42f);
        k4.r(i, 20.48f, 21.9f, 20.48f, 21.9f);
        i.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        i.lineTo(16.0f, 18.83f);
        i.lineToRelative(-2.58f, 2.58f);
        i.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        i.lineToRelative(-8.0f, -8.0f);
        i.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        i.lineTo(5.17f, 8.0f);
        i.lineTo(2.1f, 4.93f);
        i.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        i.lineToRelative(16.98f, 16.97f);
        i.curveTo(20.87f, 20.87f, 20.87f, 21.51f, 20.48f, 21.9f);
        k4.x(i, 14.19f, 17.02f, -1.39f, -1.39f);
        i.lineToRelative(-0.09f, 0.09f);
        i.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f);
        i.lineToRelative(-3.01f, -3.01f);
        i.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        i.lineToRelative(0.09f, -0.09f);
        i.lineToRelative(-1.4f, -1.39f);
        i.lineTo(4.8f, 12.0f);
        gy.B(i, 7.2f, 7.2f, 14.19f, 17.02f);
        i.moveTo(15.71f, 11.29f);
        i.lineToRelative(-3.01f, -3.01f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineTo(11.2f, 8.38f);
        i.lineToRelative(4.42f, 4.42f);
        i.lineToRelative(0.09f, -0.09f);
        i.curveTo(16.1f, 12.32f, 16.1f, 11.68f, 15.71f, 11.29f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyOff = build;
        build.getClass();
        return build;
    }
}
