package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoStoriesKt {
    private static ImageVector _autoStories;

    public static final ImageVector getAutoStories(Icons.Filled filled) {
        ImageVector imageVector = _autoStories;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AutoStories", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(19.0f, 1.0f, -5.0f, 5.0f, 11.0f);
        gy.B(e, 5.0f, -4.5f, 19.0f, 1.0f);
        e.moveTo(1.0f, 6.0f);
        e.verticalLineToRelative(14.65f);
        e.curveToRelative(0.0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f);
        e.curveToRelative(0.1f, 0.0f, 0.15f, -0.05f, 0.25f, -0.05f);
        e.curveTo(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
        e.curveToRelative(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f);
        e.lineTo(12.0f, 6.0f);
        e.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        e.reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f);
        k4.r(e, 23.0f, 19.5f, 23.0f, 6.0f);
        e.curveToRelative(-0.6f, -0.45f, -1.25f, -0.75f, -2.0f, -1.0f);
        e.verticalLineToRelative(13.5f);
        e.curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        e.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        e.verticalLineToRelative(2.0f);
        e.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        e.curveToRelative(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f);
        e.curveToRelative(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f);
        e.curveToRelative(0.25f, 0.0f, 0.5f, -0.25f, 0.5f, -0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(e, -1.1f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoStories = build;
        build.getClass();
        return build;
    }
}
