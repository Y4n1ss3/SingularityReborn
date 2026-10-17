package androidx.compose.material.icons.outlined;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Outlined outlined) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Build", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.61f, 18.99f, -9.08f, -9.08f);
        e.curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f);
        e.curveTo(9.79f, 0.61f, 6.21f, 0.4f, 3.66f, 2.26f);
        e.lineTo(7.5f, 6.11f);
        e.lineTo(6.08f, 7.52f);
        e.lineTo(2.25f, 3.69f);
        e.curveTo(0.39f, 6.23f, 0.6f, 9.82f, 2.9f, 12.11f);
        e.curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f);
        e.lineToRelative(9.11f, 9.11f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(2.3f, -2.3f);
        e.curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.0f, -1.41f);
        k4.x(e, 19.61f, 20.59f, -9.46f, -9.46f);
        e.curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f);
        e.curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f);
        e.curveTo(3.37f, 9.76f, 2.93f, 8.5f, 3.0f, 7.26f);
        e.lineToRelative(3.09f, 3.09f);
        e.lineToRelative(4.24f, -4.24f);
        e.lineToRelative(-3.09f, -3.09f);
        e.curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f);
        e.curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f);
        e.curveToRelative(-0.12f, 0.71f, -0.42f, 1.37f, -0.88f, 1.96f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 9.45f, 9.45f, -0.88f, 0.89f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        build.getClass();
        return build;
    }
}
