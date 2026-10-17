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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FunctionsKt {
    private static ImageVector _functions;

    public static final ImageVector getFunctions(Icons.Rounded rounded) {
        ImageVector imageVector = _functions;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Functions", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(16.5f, 4.0f, 7.56f);
        d.curveTo(6.7f, 4.0f, 6.0f, 4.7f, 6.0f, 5.56f);
        d.curveToRelative(0.0f, 0.28f, 0.12f, 0.55f, 0.32f, 0.74f);
        d.lineTo(12.5f, 12.0f);
        d.lineToRelative(-6.18f, 5.7f);
        d.curveToRelative(-0.2f, 0.19f, -0.32f, 0.46f, -0.32f, 0.74f);
        d.curveTo(6.0f, 19.3f, 6.7f, 20.0f, 7.56f, 20.0f);
        d.horizontalLineToRelative(8.94f);
        d.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        d.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        d.horizontalLineTo(11.0f);
        d.lineToRelative(3.59f, -3.59f);
        d.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        d.lineTo(11.0f, 7.0f);
        d.horizontalLineToRelative(5.5f);
        d.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 17.33f, 4.0f, 16.5f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _functions = build;
        build.getClass();
        return build;
    }
}
