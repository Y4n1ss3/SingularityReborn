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
public final class PublishedWithChangesKt {
    private static ImageVector _publishedWithChanges;

    public static final ImageVector getPublishedWithChanges(Icons.Rounded rounded) {
        ImageVector imageVector = _publishedWithChanges;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PublishedWithChanges", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.95f, 10.23f, -5.66f, 5.66f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        e.lineToRelative(-2.83f, -2.83f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(2.12f, 2.12f);
        e.lineToRelative(4.95f, -4.95f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveTo(17.34f, 9.21f, 17.34f, 9.84f, 16.95f, 10.23f);
        e.close();
        e.moveTo(4.0f, 12.0f);
        e.curveToRelative(0.0f, -2.33f, 1.02f, -4.42f, 2.62f, -5.88f);
        e.lineToRelative(1.53f, 1.53f);
        e.curveTo(8.46f, 7.96f, 9.0f, 7.74f, 9.0f, 7.29f);
        e.verticalLineTo(3.0f);
        e.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        e.horizontalLineTo(4.21f);
        e.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        e.lineTo(5.2f, 4.7f);
        e.curveTo(3.24f, 6.52f, 2.0f, 9.11f, 2.0f, 12.0f);
        e.curveToRelative(0.0f, 4.75f, 3.32f, 8.73f, 7.76f, 9.75f);
        e.curveToRelative(0.63f, 0.14f, 1.24f, -0.33f, 1.24f, -0.98f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.47f, -0.33f, -0.87f, -0.79f, -0.98f);
        e.curveTo(6.66f, 18.98f, 4.0f, 15.8f, 4.0f, 12.0f);
        e.close();
        e.moveTo(22.0f, 12.0f);
        e.curveToRelative(0.0f, -4.75f, -3.32f, -8.73f, -7.76f, -9.75f);
        e.curveTo(13.61f, 2.11f, 13.0f, 2.58f, 13.0f, 3.23f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, 0.47f, 0.33f, 0.87f, 0.79f, 0.98f);
        e.curveTo(17.34f, 5.02f, 20.0f, 8.2f, 20.0f, 12.0f);
        e.curveToRelative(0.0f, 2.33f, -1.02f, 4.42f, -2.62f, 5.88f);
        e.lineToRelative(-1.53f, -1.53f);
        e.curveTo(15.54f, 16.04f, 15.0f, 16.26f, 15.0f, 16.71f);
        e.verticalLineTo(21.0f);
        e.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        e.horizontalLineToRelative(4.29f);
        e.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        e.lineTo(18.8f, 19.3f);
        e.curveTo(20.76f, 17.48f, 22.0f, 14.89f, 22.0f, 12.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _publishedWithChanges = build;
        build.getClass();
        return build;
    }
}
