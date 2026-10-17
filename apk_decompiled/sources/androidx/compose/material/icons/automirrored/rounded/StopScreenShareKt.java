package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.StopScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(23.0f, 18.0f, -1.2f, 1.79f, 1.79f);
        i.curveToRelative(0.24f, -0.18f, 0.41f, -0.46f, 0.41f, -0.79f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.close();
        i.moveTo(3.23f, 2.28f);
        i.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(0.84f, 0.86f);
        i.reflectiveCurveToRelative(-0.66f, 0.57f, -0.66f, 1.47f);
        i.curveTo(2.0f, 6.92f, 2.0f, 16.0f, 2.0f, 16.0f);
        i.lineToRelative(0.01f, 0.01f);
        i.curveToRelative(0.0f, 1.09f, 0.88f, 1.98f, 1.97f, 1.99f);
        i.lineTo(1.0f, 18.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(17.13f);
        i.lineToRelative(2.0f, 2.0f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        uo.l(i, 3.23f, 2.28f, 7.0f, 15.0f);
        i.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        i.lineToRelative(1.59f, 1.59f);
        i.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        bv.v(i, 13.0f, 9.13f, -0.98f);
        i.curveToRelative(0.0f, -0.44f, 0.52f, -0.66f, 0.84f, -0.37f);
        i.lineTo(15.0f, 8.87f);
        i.lineToRelative(1.61f, 1.5f);
        i.curveToRelative(0.21f, 0.2f, 0.21f, 0.53f, 0.0f, 0.73f);
        i.lineToRelative(-0.89f, 0.83f);
        i.lineToRelative(5.58f, 5.58f);
        i.curveToRelative(0.43f, -0.37f, 0.7f, -0.9f, 0.7f, -1.51f);
        i.lineTo(22.0f, 6.0f);
        i.curveToRelative(0.0f, -1.09f, -0.89f, -1.98f, -1.98f, -1.98f);
        i.lineTo(7.8f, 4.02f);
        i.lineToRelative(5.14f, 5.13f);
        i.curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.02f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = build;
        build.getClass();
        return build;
    }
}
