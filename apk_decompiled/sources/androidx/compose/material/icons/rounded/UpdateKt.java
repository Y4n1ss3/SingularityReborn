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
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Rounded rounded) {
        ImageVector imageVector = _update;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Update", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(11.0f, 8.75f, 3.68f);
        h.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
        h.lineToRelative(3.12f, 1.85f);
        h.curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
        h.curveToRelative(0.21f, -0.36f, 0.1f, -0.82f, -0.26f, -1.03f);
        h.lineToRelative(-2.87f, -1.71f);
        h.verticalLineToRelative(-3.4f);
        h.curveTo(12.5f, 8.34f, 12.16f, 8.0f, 11.75f, 8.0f);
        h.reflectiveCurveTo(11.0f, 8.34f, 11.0f, 8.75f);
        bv.g(h, 21.0f, 9.5f, 4.21f);
        h.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        h.lineToRelative(-1.78f, 1.78f);
        h.curveToRelative(-1.81f, -1.81f, -4.39f, -2.85f, -7.21f, -2.6f);
        h.curveToRelative(-4.19f, 0.38f, -7.64f, 3.75f, -8.1f, 7.94f);
        h.curveTo(2.46f, 16.4f, 6.69f, 21.0f, 12.0f, 21.0f);
        h.curveToRelative(4.59f, 0.0f, 8.38f, -3.44f, 8.93f, -7.88f);
        h.curveToRelative(0.07f, -0.6f, -0.4f, -1.12f, -1.0f, -1.12f);
        h.curveToRelative(-0.5f, 0.0f, -0.92f, 0.37f, -0.98f, 0.86f);
        h.curveToRelative(-0.43f, 3.49f, -3.44f, 6.19f, -7.05f, 6.14f);
        h.curveToRelative(-3.71f, -0.05f, -6.84f, -3.18f, -6.9f, -6.9f);
        h.curveTo(4.94f, 8.2f, 8.11f, 5.0f, 12.0f, 5.0f);
        h.curveToRelative(1.93f, 0.0f, 3.68f, 0.79f, 4.95f, 2.05f);
        h.lineToRelative(-2.09f, 2.09f);
        h.curveTo(14.54f, 9.46f, 14.76f, 10.0f, 15.21f, 10.0f);
        h.horizontalLineToRelative(5.29f);
        h.curveTo(20.78f, 10.0f, 21.0f, 9.78f, 21.0f, 9.5f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _update = build;
        build.getClass();
        return build;
    }
}
