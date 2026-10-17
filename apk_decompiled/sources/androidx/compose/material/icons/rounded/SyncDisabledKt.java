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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SyncDisabledKt {
    private static ImageVector _syncDisabled;

    public static final ImageVector getSyncDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _syncDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SyncDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(10.0f, 5.74f, -0.19f);
        h.curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f);
        h.curveToRelative(-0.19f, 0.09f, -0.36f, 0.2f, -0.54f, 0.3f);
        h.lineTo(9.6f, 6.49f);
        h.curveToRelative(0.24f, -0.18f, 0.4f, -0.45f, 0.4f, -0.75f);
        h.close();
        h.moveTo(20.0f, 12.0f);
        h.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        h.lineToRelative(1.51f, -1.51f);
        h.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        h.horizontalLineTo(14.0f);
        h.verticalLineToRelative(4.79f);
        h.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        h.lineToRelative(1.39f, -1.39f);
        h.curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f);
        h.curveToRelative(0.0f, 0.85f, -0.18f, 1.66f, -0.5f, 2.39f);
        h.lineToRelative(1.48f, 1.48f);
        h.curveTo(19.62f, 14.72f, 20.0f, 13.41f, 20.0f, 12.0f);
        h.close();
        h.moveTo(3.57f, 4.7f);
        h.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        h.lineToRelative(1.65f, 1.65f);
        h.curveTo(4.45f, 9.0f, 4.0f, 10.44f, 4.0f, 12.0f);
        h.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        h.lineToRelative(-1.51f, 1.51f);
        h.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        h.horizontalLineTo(9.5f);
        h.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        h.verticalLineToRelative(-4.29f);
        h.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        h.lineToRelative(-1.39f, 1.39f);
        h.curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f);
        h.curveToRelative(0.0f, -1.0f, 0.26f, -1.93f, 0.69f, -2.76f);
        h.lineToRelative(8.07f, 8.07f);
        h.curveToRelative(-0.01f, 0.02f, -0.01f, 0.02f, -0.01f, 0.04f);
        h.curveToRelative(-0.43f, 0.12f, -0.75f, 0.48f, -0.75f, 0.91f);
        h.verticalLineToRelative(0.18f);
        h.curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f);
        h.curveToRelative(0.31f, -0.14f, 0.61f, -0.31f, 0.9f, -0.49f);
        h.lineToRelative(1.87f, 1.87f);
        h.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        h.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        h.lineTo(4.98f, 4.7f);
        h.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncDisabled = build;
        build.getClass();
        return build;
    }
}
