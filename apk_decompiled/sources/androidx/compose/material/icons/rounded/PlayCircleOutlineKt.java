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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlayCircleOutlineKt {
    private static ImageVector _playCircleOutline;

    public static final ImageVector getPlayCircleOutline(Icons.Rounded rounded) {
        ImageVector imageVector = _playCircleOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayCircleOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.8f, 15.9f, 4.67f, -3.5f);
        e.curveToRelative(0.27f, -0.2f, 0.27f, -0.6f, 0.0f, -0.8f);
        e.lineTo(10.8f, 8.1f);
        e.curveToRelative(-0.33f, -0.25f, -0.8f, -0.01f, -0.8f, 0.4f);
        e.verticalLineToRelative(7.0f);
        e.curveToRelative(0.0f, 0.41f, 0.47f, 0.65f, 0.8f, 0.4f);
        e.close();
        e.moveTo(12.0f, 2.0f);
        e.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        e.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        e.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        e.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        e.close();
        e.moveTo(12.0f, 20.0f);
        e.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        e.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        e.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -3.59f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playCircleOutline = build;
        build.getClass();
        return build;
    }
}
