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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExtensionKt {
    private static ImageVector _extension;

    public static final ImageVector getExtension(Icons.Filled filled) {
        ImageVector imageVector = _extension;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Extension", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(20.5f, 11.0f, 19.0f, 7.0f);
        c.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c.horizontalLineToRelative(-4.0f);
        c.verticalLineTo(3.5f);
        c.curveTo(13.0f, 2.12f, 11.88f, 1.0f, 10.5f, 1.0f);
        c.reflectiveCurveTo(8.0f, 2.12f, 8.0f, 3.5f);
        c.verticalLineTo(5.0f);
        c.horizontalLineTo(4.0f);
        c.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        c.verticalLineToRelative(3.8f);
        c.horizontalLineTo(3.5f);
        c.curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        c.reflectiveCurveToRelative(-1.21f, 2.7f, -2.7f, 2.7f);
        c.horizontalLineTo(2.0f);
        c.verticalLineTo(20.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(3.8f);
        c.verticalLineToRelative(-1.5f);
        c.curveToRelative(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
        c.curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        c.verticalLineTo(22.0f);
        c.horizontalLineTo(17.0f);
        c.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c.verticalLineToRelative(-4.0f);
        c.horizontalLineToRelative(1.5f);
        c.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 21.88f, 11.0f, 20.5f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extension = build;
        build.getClass();
        return build;
    }
}
