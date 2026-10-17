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
public final class TrackChangesKt {
    private static ImageVector _trackChanges;

    public static final ImageVector getTrackChanges(Icons.Rounded rounded) {
        ImageVector imageVector = _trackChanges;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TrackChanges", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.32f, 5.68f);
        b.curveToRelative(-0.36f, 0.36f, -0.39f, 0.92f, -0.07f, 1.32f);
        b.curveToRelative(1.45f, 1.82f, 2.21f, 4.31f, 1.53f, 6.92f);
        b.curveToRelative(-0.79f, 3.05f, -3.18f, 5.33f, -6.21f, 5.94f);
        b.curveTo(8.47f, 20.87f, 4.0f, 16.93f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -4.08f, 3.05f, -7.44f, 7.0f, -7.93f);
        b.verticalLineToRelative(2.02f);
        b.curveToRelative(-3.13f, 0.53f, -5.43f, 3.46f, -4.93f, 6.83f);
        b.curveToRelative(0.39f, 2.61f, 2.56f, 4.71f, 5.18f, 5.03f);
        b.curveTo(14.89f, 18.4f, 18.0f, 15.56f, 18.0f, 12.0f);
        b.curveToRelative(0.0f, -1.25f, -0.38f, -2.4f, -1.03f, -3.36f);
        b.curveToRelative(-0.34f, -0.5f, -1.07f, -0.53f, -1.5f, -0.11f);
        b.lineToRelative(-0.01f, 0.01f);
        b.curveToRelative(-0.34f, 0.34f, -0.37f, 0.87f, -0.11f, 1.27f);
        b.curveToRelative(0.6f, 0.92f, 0.84f, 2.1f, 0.49f, 3.32f);
        b.curveToRelative(-0.39f, 1.37f, -1.54f, 2.46f, -2.94f, 2.77f);
        b.curveToRelative(-2.6f, 0.57f, -4.9f, -1.39f, -4.9f, -3.9f);
        b.curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f);
        b.verticalLineToRelative(2.14f);
        b.curveToRelative(-0.6f, 0.35f, -1.0f, 0.98f, -1.0f, 1.72f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.74f, -0.4f, -1.38f, -1.0f, -1.72f);
        b.verticalLineTo(2.71f);
        b.curveToRelative(0.0f, -0.39f, -0.32f, -0.71f, -0.71f, -0.71f);
        b.curveToRelative(-5.36f, -0.2f, -9.98f, 4.06f, -10.27f, 9.4f);
        b.curveToRelative(-0.36f, 6.55f, 5.41f, 11.82f, 12.01f, 10.4f);
        b.curveToRelative(3.88f, -0.83f, 6.88f, -3.8f, 7.75f, -7.67f);
        b.curveToRelative(0.71f, -3.16f, -0.2f, -6.16f, -1.97f, -8.37f);
        b.curveToRelative(-0.37f, -0.47f, -1.07f, -0.5f, -1.49f, -0.08f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _trackChanges = build;
        build.getClass();
        return build;
    }
}
