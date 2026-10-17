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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TryKt {
    private static ImageVector _try;

    public static final ImageVector getTry(Icons.Rounded rounded) {
        ImageVector imageVector = _try;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Try", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 2.0f, 4.0f);
        d.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(15.59f);
        d.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        d.lineTo(6.0f, 18.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        k4.x(d, 13.57f, 11.57f, -1.12f, 2.44f);
        d.curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f);
        d.lineToRelative(-1.12f, -2.44f);
        d.lineToRelative(-2.44f, -1.12f);
        d.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        d.lineToRelative(2.44f, -1.12f);
        d.lineToRelative(1.12f, -2.44f);
        d.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        d.lineToRelative(1.12f, 2.44f);
        d.lineToRelative(2.44f, 1.12f);
        d.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 13.57f, 11.57f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _try = build;
        build.getClass();
        return build;
    }
}
