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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbDownKt {
    private static ImageVector _thumbDown;

    public static final ImageVector getThumbDown(Icons.Rounded rounded) {
        ImageVector imageVector = _thumbDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.88f, 21.94f, 5.53f, -5.54f);
        e.curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineTo(6.0f);
        e.curveToRelative(-0.8f, 0.0f, -1.52f, 0.48f, -1.83f, 1.21f);
        e.lineTo(0.91f, 11.82f);
        e.curveTo(0.06f, 13.8f, 1.51f, 16.0f, 3.66f, 16.0f);
        e.horizontalLineToRelative(5.65f);
        e.lineToRelative(-0.95f, 4.58f);
        e.curveToRelative(-0.1f, 0.5f, 0.05f, 1.01f, 0.41f, 1.37f);
        e.curveToRelative(0.59f, 0.58f, 1.53f, 0.58f, 2.11f, -0.01f);
        e.close();
        e.moveTo(21.0f, 3.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(8.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDown = build;
        build.getClass();
        return build;
    }
}
