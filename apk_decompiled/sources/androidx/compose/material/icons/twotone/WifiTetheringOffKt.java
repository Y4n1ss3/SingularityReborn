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
import defpackage.af0;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiTetheringOffKt {
    private static ImageVector _wifiTetheringOff;

    public static final ImageVector getWifiTetheringOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wifiTetheringOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WifiTetheringOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.81f, 2.81f, 1.39f, 4.22f);
        i.lineToRelative(2.69f, 2.69f);
        i.curveTo(2.78f, 8.6f, 2.0f, 10.71f, 2.0f, 13.0f);
        i.curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f);
        i.lineToRelative(1.42f, -1.42f);
        i.curveTo(4.9f, 17.21f, 4.0f, 15.21f, 4.0f, 13.0f);
        i.curveToRelative(0.0f, -1.75f, 0.57f, -3.35f, 1.51f, -4.66f);
        i.lineToRelative(1.43f, 1.43f);
        i.curveTo(6.35f, 10.7f, 6.0f, 11.81f, 6.0f, 13.0f);
        i.curveToRelative(0.0f, 1.66f, 0.68f, 3.15f, 1.76f, 4.24f);
        i.lineToRelative(1.42f, -1.42f);
        i.curveTo(8.45f, 15.1f, 8.0f, 14.11f, 8.0f, 13.0f);
        i.curveToRelative(0.0f, -0.63f, 0.15f, -1.23f, 0.41f, -1.76f);
        i.lineToRelative(1.61f, 1.61f);
        i.curveToRelative(0.0f, 0.05f, -0.02f, 0.1f, -0.02f, 0.15f);
        i.curveToRelative(0.0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f);
        i.curveTo(10.95f, 14.77f, 11.45f, 15.0f, 12.0f, 15.0f);
        i.curveToRelative(0.05f, 0.0f, 0.1f, -0.01f, 0.16f, -0.02f);
        i.lineToRelative(7.62f, 7.62f);
        gy.B(i, 1.41f, -1.41f, 2.81f, 2.81f);
        i.moveTo(17.7f, 14.87f);
        i.curveTo(17.89f, 14.28f, 18.0f, 13.65f, 18.0f, 13.0f);
        i.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        i.curveToRelative(-0.65f, 0.0f, -1.28f, 0.1f, -1.87f, 0.3f);
        i.lineToRelative(1.71f, 1.71f);
        i.curveTo(11.89f, 9.0f, 11.95f, 9.0f, 12.0f, 9.0f);
        i.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        i.curveToRelative(0.0f, 0.05f, 0.0f, 0.11f, -0.01f, 0.16f);
        uo.l(i, 17.7f, 14.87f, 12.0f, 5.0f);
        i.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        i.curveToRelative(0.0f, 1.22f, -0.27f, 2.37f, -0.77f, 3.4f);
        i.lineToRelative(1.49f, 1.49f);
        i.curveTo(21.53f, 16.45f, 22.0f, 14.78f, 22.0f, 13.0f);
        i.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        i.curveToRelative(-1.78f, 0.0f, -3.44f, 0.46f, -4.89f, 1.28f);
        i.lineToRelative(1.48f, 1.48f);
        i.curveTo(9.63f, 5.27f, 10.78f, 5.0f, 12.0f, 5.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiTetheringOff = build;
        build.getClass();
        return build;
    }
}
