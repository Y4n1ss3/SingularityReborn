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
public final class PaddingKt {
    private static ImageVector _padding;

    public static final ImageVector getPadding(Icons.Rounded rounded) {
        ImageVector imageVector = _padding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Padding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(3.0f, 5.0f, 14.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(14.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.verticalLineTo(5.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.horizontalLineTo(5.0f);
        h.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        h.close();
        h.moveTo(9.0f, 8.0f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        h.reflectiveCurveTo(7.0f, 8.55f, 7.0f, 8.0f);
        h.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveTo(9.0f, 7.45f, 9.0f, 8.0f);
        h.close();
        h.moveTo(13.0f, 8.0f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        h.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveTo(13.0f, 7.45f, 13.0f, 8.0f);
        h.close();
        h.moveTo(17.0f, 8.0f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        h.curveTo(16.55f, 7.0f, 17.0f, 7.45f, 17.0f, 8.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _padding = build;
        build.getClass();
        return build;
    }
}
