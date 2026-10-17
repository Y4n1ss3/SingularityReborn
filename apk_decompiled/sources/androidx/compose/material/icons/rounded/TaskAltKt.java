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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TaskAltKt {
    private static ImageVector _taskAlt;

    public static final ImageVector getTaskAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _taskAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TaskAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.29f, 5.89f, -10.0f, 10.0f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        e.lineToRelative(-2.83f, -2.83f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(2.12f, 2.12f);
        e.lineToRelative(9.29f, -9.29f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveTo(21.68f, 4.87f, 21.68f, 5.5f, 21.29f, 5.89f);
        e.close();
        e.moveTo(15.77f, 2.74f);
        e.curveToRelative(-1.69f, -0.69f, -3.61f, -0.93f, -5.61f, -0.57f);
        e.curveTo(6.09f, 2.9f, 2.84f, 6.18f, 2.15f, 10.25f);
        e.curveTo(1.01f, 17.0f, 6.63f, 22.78f, 13.34f, 21.91f);
        e.curveToRelative(3.96f, -0.51f, 7.28f, -3.46f, 8.32f, -7.31f);
        e.curveToRelative(0.4f, -1.47f, 0.44f, -2.89f, 0.21f, -4.22f);
        e.curveToRelative(-0.13f, -0.8f, -1.12f, -1.11f, -1.7f, -0.54f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(-0.23f, 0.23f, -0.33f, 0.57f, -0.27f, 0.89f);
        e.curveToRelative(0.22f, 1.33f, 0.12f, 2.75f, -0.52f, 4.26f);
        e.curveToRelative(-1.16f, 2.71f, -3.68f, 4.7f, -6.61f, 4.97f);
        e.curveToRelative(-5.1f, 0.47f, -9.33f, -3.85f, -8.7f, -8.98f);
        e.curveToRelative(0.43f, -3.54f, 3.28f, -6.42f, 6.81f, -6.91f);
        e.curveToRelative(1.73f, -0.24f, 3.37f, 0.09f, 4.77f, 0.81f);
        e.curveToRelative(0.39f, 0.2f, 0.86f, 0.13f, 1.17f, -0.18f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(0.48f, -0.48f, 0.36f, -1.29f, -0.24f, -1.6f);
        e.curveTo(16.31f, 2.98f, 16.04f, 2.85f, 15.77f, 2.74f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _taskAlt = build;
        build.getClass();
        return build;
    }
}
