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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReplayCircleFilledKt {
    private static ImageVector _replayCircleFilled;

    public static final ImageVector getReplayCircleFilled(Icons.Rounded rounded) {
        ImageVector imageVector = _replayCircleFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ReplayCircleFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(18.0f, 12.74f);
        b.curveToRelative(-0.12f, 3.09f, -2.67f, 5.64f, -5.76f, 5.76f);
        b.curveToRelative(-3.01f, 0.12f, -5.56f, -1.99f, -6.12f, -4.82f);
        b.curveTo(5.99f, 13.07f, 6.48f, 12.5f, 7.1f, 12.5f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.47f, 0.0f, 0.88f, 0.33f, 0.98f, 0.8f);
        b.curveToRelative(0.42f, 2.07f, 2.44f, 3.57f, 4.72f, 3.12f);
        b.curveToRelative(1.56f, -0.3f, 2.82f, -1.56f, 3.12f, -3.12f);
        b.curveToRelative(0.5f, -2.56f, -1.45f, -4.8f, -3.92f, -4.8f);
        b.verticalLineToRelative(1.79f);
        b.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        b.lineTo(8.35f, 7.85f);
        b.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        b.lineToRelative(2.79f, -2.79f);
        b.curveTo(11.46f, 4.04f, 12.0f, 4.26f, 12.0f, 4.71f);
        b.verticalLineTo(6.5f);
        b.curveTo(15.39f, 6.5f, 18.13f, 9.32f, 18.0f, 12.74f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replayCircleFilled = build;
        build.getClass();
        return build;
    }
}
