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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerticalAlignBottomKt {
    private static ImageVector _verticalAlignBottom;

    public static final ImageVector getVerticalAlignBottom(Icons.Rounded rounded) {
        ImageVector imageVector = _verticalAlignBottom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VerticalAlignBottom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(14.79f, 13.0f, 13.0f, 4.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        c.verticalLineToRelative(9.0f);
        c.horizontalLineTo(9.21f);
        c.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        c.lineToRelative(2.79f, 2.79f);
        c.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        c.lineToRelative(2.79f, -2.79f);
        c.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        c.close();
        c.moveTo(4.0f, 20.0f);
        c.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(14.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        c.horizontalLineTo(5.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verticalAlignBottom = build;
        build.getClass();
        return build;
    }
}
