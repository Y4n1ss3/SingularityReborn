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
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReplayKt {
    private static ImageVector _replay;

    public static final ImageVector getReplay(Icons.Rounded rounded) {
        ImageVector imageVector = _replay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Replay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(12.0f, 5.0f, 2.21f);
        d.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        d.lineToRelative(-3.8f, 3.79f);
        d.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        d.lineToRelative(3.79f, 3.79f);
        d.curveToRelative(0.32f, 0.31f, 0.86f, 0.09f, 0.86f, -0.36f);
        d.verticalLineTo(7.0f);
        d.curveToRelative(3.73f, 0.0f, 6.68f, 3.42f, 5.86f, 7.29f);
        d.curveToRelative(-0.47f, 2.27f, -2.31f, 4.1f, -4.57f, 4.57f);
        d.curveToRelative(-3.57f, 0.75f, -6.75f, -1.7f, -7.23f, -5.01f);
        d.curveToRelative(-0.07f, -0.48f, -0.49f, -0.85f, -0.98f, -0.85f);
        d.curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f);
        d.curveToRelative(0.62f, 4.39f, 4.8f, 7.64f, 9.53f, 6.72f);
        d.curveToRelative(3.12f, -0.61f, 5.63f, -3.12f, 6.24f, -6.24f);
        d.curveTo(20.84f, 9.48f, 16.94f, 5.0f, 12.0f, 5.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replay = build;
        build.getClass();
        return build;
    }
}
