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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlayForWorkKt {
    private static ImageVector _playForWork;

    public static final ImageVector getPlayForWork(Icons.Rounded rounded) {
        ImageVector imageVector = _playForWork;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayForWork", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(11.0f, 6.0f, 4.59f, 8.71f, 10.59f);
        y.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        y.lineToRelative(3.29f, 3.29f);
        y.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        y.lineToRelative(3.29f, -3.29f);
        y.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        y.lineTo(13.0f, 10.59f);
        y.lineTo(13.0f, 6.0f);
        y.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        y.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        y.close();
        y.moveTo(7.1f, 14.0f);
        y.curveToRelative(-0.61f, 0.0f, -1.11f, 0.55f, -0.99f, 1.15f);
        y.curveTo(6.65f, 17.91f, 9.08f, 20.0f, 12.0f, 20.0f);
        y.reflectiveCurveToRelative(5.35f, -2.09f, 5.89f, -4.85f);
        y.curveToRelative(0.12f, -0.6f, -0.38f, -1.15f, -0.99f, -1.15f);
        y.curveToRelative(-0.49f, 0.0f, -0.88f, 0.35f, -0.98f, 0.83f);
        y.curveTo(15.53f, 16.64f, 13.93f, 18.0f, 12.0f, 18.0f);
        y.reflectiveCurveToRelative(-3.53f, -1.36f, -3.91f, -3.17f);
        y.curveToRelative(-0.1f, -0.48f, -0.5f, -0.83f, -0.99f, -0.83f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playForWork = build;
        build.getClass();
        return build;
    }
}
