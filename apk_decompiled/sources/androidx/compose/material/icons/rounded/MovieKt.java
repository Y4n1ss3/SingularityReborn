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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovieKt {
    private static ImageVector _movie;

    public static final ImageVector getMovie(Icons.Rounded rounded) {
        ImageVector imageVector = _movie;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Movie", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 4.0f, 1.82f, 3.64f);
        e.curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f);
        e.horizontalLineToRelative(-1.98f);
        e.curveToRelative(-0.38f, 0.0f, -0.73f, -0.21f, -0.89f, -0.55f);
        e.lineTo(15.0f, 4.0f);
        e.horizontalLineToRelative(-2.0f);
        e.lineToRelative(1.82f, 3.64f);
        e.curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f);
        e.horizontalLineToRelative(-1.98f);
        e.curveToRelative(-0.38f, 0.0f, -0.73f, -0.21f, -0.89f, -0.55f);
        e.lineTo(10.0f, 4.0f);
        e.horizontalLineTo(8.0f);
        e.lineToRelative(1.82f, 3.64f);
        e.curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f);
        e.horizontalLineTo(7.62f);
        e.curveToRelative(-0.38f, 0.0f, -0.73f, -0.21f, -0.9f, -0.55f);
        e.lineTo(5.0f, 4.0f);
        e.horizontalLineTo(4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(12.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(e, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _movie = build;
        build.getClass();
        return build;
    }
}
